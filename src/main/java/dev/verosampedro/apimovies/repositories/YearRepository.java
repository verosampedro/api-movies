package dev.verosampedro.apimovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.verosampedro.apimovies.models.Year;

public interface YearRepository extends JpaRepository<Year,Long> {

}
