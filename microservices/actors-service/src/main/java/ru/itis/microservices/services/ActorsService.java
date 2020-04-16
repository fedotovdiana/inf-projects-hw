package ru.itis.microservices.services;

import ru.itis.microservices.model.Actor;

import java.util.List;

public interface ActorsService {
    List<Actor> getActors();
}
