package ru.itis.microservices.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.microservices.model.Actor;
import ru.itis.microservices.services.ActorsService;

import java.util.List;

@RestController
@Slf4j
public class ActorsController {

    @Autowired
    ActorsService actorsService;

    @GetMapping("/actors")
    public List<Actor> getActors() {
        return actorsService.getActors();
    }
}
