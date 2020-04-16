package ru.itis.microservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.microservices.model.Actor;
import ru.itis.microservices.repositories.ActorsRepository;

import java.util.List;

@Service
public class ActorsServiceImpl implements ActorsService {

    @Autowired
    ActorsRepository actorsRepository;

    @Override
    public List<Actor> getActors() {
        return actorsRepository.findAll();
    }
}
