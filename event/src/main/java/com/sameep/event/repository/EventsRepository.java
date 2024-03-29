package com.sameep.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sameep.event.model.Events;


@Repository
public interface EventsRepository extends JpaRepository<Events, Long> {

}
