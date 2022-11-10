package io.pavanrkadave.movieservice.service;

import io.pavanrkadave.movieservice.models.Movie;
import io.pavanrkadave.movieservice.repository.MovieRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        log.debug("Fetching all Movies");
        return Streamable.of(movieRepository.findAll()).toList();
    }
}
