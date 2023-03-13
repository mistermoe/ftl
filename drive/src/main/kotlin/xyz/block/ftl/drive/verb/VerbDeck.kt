package xyz.block.ftl.drive.verb

import io.github.classgraph.ClassGraph
import xyz.block.ftl.drive.Logging
import xyz.block.ftl.drive.Verb
import java.util.concurrent.ConcurrentHashMap
import kotlin.reflect.KFunction
import kotlin.reflect.KFunction1
import kotlin.reflect.jvm.kotlinFunction

class VerbDeck {
  private val logger = Logging.logger(VerbDeck::class)
  companion object {
    val instance = VerbDeck()

    fun init(module: String) {
      instance.init(module)
    }
  }

  data class VerbId(val qualifiedName: String)

  private val verbs = ConcurrentHashMap<VerbId, VerbCassette<out Any, out Any>>()

  fun init(module: String) {
    logger.info("Scanning for Verbs in ${module}...")
    // Assign scanResult in try-with-resources
    ClassGraph() // Create a new ClassGraph instance
      .enableAllInfo() // Scan classes, methods, fields, annotations
      .acceptPackages(module) // Scan com.xyz and subpackages
      .disableJarScanning()
      .scan().use { scanResult ->                       // Perform the scan and return a ScanResult
        // Use the ScanResult within the try block, e.g.
        for (clazz in scanResult.getClassesWithMethodAnnotation(Verb::class.java)) {
          clazz.methodInfo.forEach { info ->
            logger.info("    @Verb ${info.name}")
            val function = info.loadClassAndGetMethod().kotlinFunction!!

            @Suppress("UNCHECKED_CAST")
            verbs[toId(function)] = VerbCassette(function as KFunction1<Any, Any>)
          }
        }
      }
  }

  fun lookup(name: String): VerbCassette<out Any, out Any>? = verbs[VerbId(name)]

  private fun toId(verb: KFunction<*>) = VerbId(verb.name)
}
