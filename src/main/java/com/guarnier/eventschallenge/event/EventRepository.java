package com.guarnier.eventschallenge.event;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {

    public Event findByName(String name);
}
