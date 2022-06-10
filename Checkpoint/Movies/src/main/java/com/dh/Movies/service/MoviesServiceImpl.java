package com.dh.Movies.service;

import com.dh.Movies.dto.MoviesDto;
import com.dh.Movies.entity.Movies;
import com.dh.Movies.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    private CatalogFeign catalog;

    @Autowired
    private MoviesRepository repository;


    @Override
    public void save(MoviesDto dto) {
        Movies movie = new Movies();
        movie.setName(dto.getName());
        movie.setIdGener(catalog.findByName(dto.getGenre()));
        movie.setUrlStream(dto.getUrlStream());

        ArrayList<Object> moviesList = new ArrayList<>();
        moviesList.add(repository.save(movie));
    }

    @Override
    public MoviesDto findByGender(String gener) {
        return null;
    }

    @Override
    public String findMovieByGenerId(Long idGener) {
        var movies = repository.findByIdGener(idGener);
        return movies.getName();
    }
}
