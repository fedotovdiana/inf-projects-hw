package ru.itis.microservices.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itis.microservices.model.Film;
import ru.itis.microservices.services.FilmsService;

import java.util.List;

@RestController
@Slf4j
public class FilmsController {

    @Autowired
    FilmsService filmsService;

    @GetMapping("/films")
    public List<Film> getFilms() {
        return filmsService.getFilms();
    }
}
