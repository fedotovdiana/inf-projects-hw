package ru.itis.microservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.microservices.model.Actor;

public interface ActorsRepository extends JpaRepository<Actor, Long> { }
