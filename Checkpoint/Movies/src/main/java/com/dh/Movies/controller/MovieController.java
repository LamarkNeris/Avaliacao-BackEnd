package com.dh.Movies.controller;

import com.dh.Movies.dto.MoviesDto;
import com.dh.Movies.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MoviesService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody MoviesDto dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/catalog/{id}")
    public String findByCatalogId(@PathVariable(value = "id") Long idGener) {
        return service.findMovieByGenerId(idGener);
    }
}
