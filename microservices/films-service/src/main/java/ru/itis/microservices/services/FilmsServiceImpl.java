package ru.itis.microservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.microservices.model.Film;
import ru.itis.microservices.repositories.FilmsRepository;

import java.util.List;

@Service
public class FilmsServiceImpl implements FilmsService {

    @Autowired
    FilmsRepository filmsRepository;

    @Override
    public List<Film> getFilms() {
        return filmsRepository.findAll();
    }

    @Override
    public Film getConcreteFilm(Long id) {
        return filmsRepository.getOne(id);
    }
}
