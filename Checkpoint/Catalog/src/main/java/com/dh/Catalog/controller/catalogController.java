package com.dh.Catalog.controller;

import com.dh.Catalog.Catalog;
import com.dh.Catalog.dto.CatalogDto;
import com.dh.Catalog.service.CatalogService;
import com.dh.Catalog.service.CatalogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class catalogController {

    @Autowired
    private CatalogService service;

    @Autowired
    private CatalogServiceImpl catalogService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody CatalogDto dto) {
        service.save(dto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{name}")
    public Long findByName(@RequestParam String name) {

        return service.findByName(name);

    }

    @GetMapping("/movies/{name}")
    public String findMoviesByName(@PathVariable String name) {

        return service.findMoviesByName(name);
    }
}
