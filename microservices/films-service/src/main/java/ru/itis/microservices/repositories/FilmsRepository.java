package ru.itis.microservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.microservices.model.Film;

public interface FilmsRepository extends JpaRepository<Film, Long> {}
