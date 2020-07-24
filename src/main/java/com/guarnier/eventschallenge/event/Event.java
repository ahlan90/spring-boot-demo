package com.guarnier.eventschallenge.event;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    public String id;

    public String name;

    public Date date;

}

