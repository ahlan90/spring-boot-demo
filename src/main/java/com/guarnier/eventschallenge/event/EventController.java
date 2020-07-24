package com.guarnier.eventschallenge.event;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getAll() {
        return this.eventService.findAll();
    }

    @GetMapping("/create")
    public Event create() {
        Event event = new Event(null,"Ahlan", new Date());

        return this.eventService.insert(event);
    }

}
