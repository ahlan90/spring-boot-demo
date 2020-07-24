package com.guarnier.eventschallenge.event;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> findAll() {
        return this.eventRepository.findAll();
    }

    public Event insert(Event event) {
        return this.eventRepository.insert(event);
    }
}
