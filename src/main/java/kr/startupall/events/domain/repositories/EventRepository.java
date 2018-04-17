package kr.startupall.events.domain.repositories;

import kr.startupall.events.domain.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {

}
