package io.pavanrkadave.movieservice;

import io.pavanrkadave.movieservice.models.Movie;
import io.pavanrkadave.movieservice.repository.MovieRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootApplication
public class MovieServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieServiceApplication.class, args);
    }

}

@Component
record MovieRunner(MovieRepository movieRepository) implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        var movies = List.of(new Movie(null, "Tom Cruise Maverick", 9.0),
                new Movie(null, "Avengers End Game", 10.0));
        movieRepository.saveAll(movies);
    }
}
