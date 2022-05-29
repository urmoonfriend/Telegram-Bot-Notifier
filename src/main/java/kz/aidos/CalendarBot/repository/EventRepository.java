package kz.aidos.CalendarBot.repository;

import kz.aidos.CalendarBot.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    Event findByEventId(long id);
}
