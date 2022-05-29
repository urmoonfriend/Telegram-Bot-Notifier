package kz.aidos.CalendarBot.repository;

import kz.aidos.CalendarBot.event.EventCashEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventCashRepository extends JpaRepository<EventCashEntity, Long> {
    EventCashEntity findById(long id);
}
