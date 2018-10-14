package com.sameep.event.service;

import com.sameep.event.model.Events;

public interface EventService {
	public void save(Events event);

	public Events getById(Long id);

}
