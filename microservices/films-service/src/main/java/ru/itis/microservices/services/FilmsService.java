package ru.itis.microservices.services;

import ru.itis.microservices.model.Film;

import java.util.List;

public interface FilmsService {
    List<Film> getFilms();
    Film getConcreteFilm(Long id);
}
