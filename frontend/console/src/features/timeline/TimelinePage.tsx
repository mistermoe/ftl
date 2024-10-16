import { useEffect, useState } from 'react'
import { useSearchParams } from 'react-router-dom'
import type { EventsQuery_Filter } from '../../protos/xyz/block/ftl/v1/console/console_pb'
import { SidePanelProvider } from '../../providers/side-panel-provider'
import { Timeline } from './Timeline'
import { TimelineFilterPanel } from './filters/TimelineFilterPanel'
import { TIME_RANGES, type TimeSettings, TimelineTimeControls } from './filters/TimelineTimeControls'

export const TimelinePage = () => {
  const [searchParams] = useSearchParams()
  const [timeSettings, setTimeSettings] = useState<TimeSettings>({ isTailing: true, isPaused: false })
  const [filters, setFilters] = useState<EventsQuery_Filter[]>([])
  const [selectedTimeRange, setSelectedTimeRange] = useState(TIME_RANGES.tail)
  const [isTimelinePaused, setIsTimelinePaused] = useState(false)

  const initialEventId = searchParams.get('id')
  useEffect(() => {
    if (initialEventId) {
      // if we're loading a specific event, we don't want to tail.
      setSelectedTimeRange(TIME_RANGES['24h'])
      setIsTimelinePaused(true)
    }
  }, [])

  const handleTimeSettingsChanged = (settings: TimeSettings) => {
    setTimeSettings(settings)
  }

  const handleFiltersChanged = (filters: EventsQuery_Filter[]) => {
    setFilters(filters)
  }

  return (
    <SidePanelProvider>
      <div className='flex h-full'>
        <div className='flex-none overflow-y-auto'>
          <TimelineTimeControls selectedTimeRange={selectedTimeRange} isTimelinePaused={isTimelinePaused} onTimeSettingsChange={handleTimeSettingsChanged} />
          <TimelineFilterPanel onFiltersChanged={handleFiltersChanged} />
        </div>
        <div className='flex-grow overflow-y-scroll'>
          <Timeline timeSettings={timeSettings} filters={filters} />
        </div>
      </div>
    </SidePanelProvider>
  )
}
