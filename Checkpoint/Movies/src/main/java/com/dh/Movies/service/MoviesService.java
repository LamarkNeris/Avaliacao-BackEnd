package com.dh.Movies.service;

import com.dh.Movies.dto.MoviesDto;
import com.dh.Movies.entity.Movies;

import java.util.List;

public interface MoviesService {

    void save(MoviesDto dto);

    MoviesDto findByGender(String idGener);

    String findMovieByGenerId(Long idGener);

}
