package io.pavanrkadave.movieservice.repository;

import io.pavanrkadave.movieservice.models.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {
}
