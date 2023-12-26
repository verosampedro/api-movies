package dev.verosampedro.apimovies.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.verosampedro.apimovies.models.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    Optional<Movie> findByTitle(String title);
}
