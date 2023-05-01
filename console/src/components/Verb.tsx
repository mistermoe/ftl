import { useParams } from 'react-router-dom'
import { modules } from '../data/Modules'
import ModuleNotFound from './ModuleNotFound'
import { ChevronRightIcon, HomeIcon } from '@heroicons/react/20/solid'

export default function Verb() {
  const { moduleId, id } = useParams()
  const module = modules.find(
    module => module.id === moduleId?.toLocaleLowerCase()
  )
  const verb = module?.verbs.find(verb => verb.id === id?.toLocaleLowerCase())

  if (module === undefined || verb === undefined) {
    return <ModuleNotFound id={id} />
  }

  return (
    <>
      <div className="min-w-0 flex-auto">
        <nav className="flex" aria-label="Breadcrumb">
          <ol role="list" className="flex items-center space-x-4">
            <li>
              <div>
                <a href="/" className="text-gray-400 hover:text-gray-500">
                  <HomeIcon
                    className="h-5 w-5 flex-shrink-0"
                    aria-hidden="true"
                  />
                  <span className="sr-only">Home</span>
                </a>
              </div>
            </li>
            <li key={module.id}>
              <div className="flex items-center">
                <ChevronRightIcon
                  className="h-5 w-5 flex-shrink-0 text-gray-400"
                  aria-hidden="true"
                />
                <a
                  href={`/${module.id}`}
                  className="ml-4 text-sm font-medium text-gray-400 hover:text-gray-500"
                  aria-current={'page'}
                >
                  {module.name}
                </a>
              </div>
            </li>
          </ol>
        </nav>
        <div className="flex items-center gap-x-3 py-6">
          <h2 className="min-w-0 text-sm font-semibold leading-6 text-gray-900 dark:text-white">
            <div className="flex gap-x-2">
              <span className="truncate">{verb.name}</span>
            </div>
          </h2>
        </div>
        <div className="mt-3 flex items-center gap-x-2.5 text-xs leading-5 text-gray-400">
          <p className="truncate">{verb.description}</p>
        </div>
      </div>
    </>
  )
}
