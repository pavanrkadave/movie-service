package io.pavanrkadave.movieservice.controller;

import io.pavanrkadave.movieservice.models.Movie;
import io.pavanrkadave.movieservice.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public String movies(Model model) {
        model.addAttribute("movies",movieService.getAllMovies());
        return "movies";
    }
}
