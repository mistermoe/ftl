import {VerbRef} from '../../protos/xyz/block/ftl/v1/schema/schema_pb'

export function buildVerbSchema(
  verbSchema: string,
  dataScemas: string[]
): string {
  return dataScemas.join('\n\n') + '\n\n' + verbSchema
}

export function verbRefString(verb: VerbRef): string {
  return `${verb.module}.${verb.name}`
}
