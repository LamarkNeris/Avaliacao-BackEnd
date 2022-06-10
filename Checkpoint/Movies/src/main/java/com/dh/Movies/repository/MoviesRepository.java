package com.dh.Movies.repository;

import com.dh.Movies.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.catalog.Catalog;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long> {
    Movies findByIdGener(Long genreName);

}
