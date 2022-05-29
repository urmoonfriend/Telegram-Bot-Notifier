package kz.aidos.CalendarBot.repository;

import kz.aidos.CalendarBot.event.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
}
