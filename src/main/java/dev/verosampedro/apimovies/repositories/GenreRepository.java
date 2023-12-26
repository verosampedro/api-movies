package dev.verosampedro.apimovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.verosampedro.apimovies.models.Movie;

public interface GenreRepository extends JpaRepository<Movie,Long> {
    
}