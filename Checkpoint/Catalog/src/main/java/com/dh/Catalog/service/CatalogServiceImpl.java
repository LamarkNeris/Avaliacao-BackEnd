package com.dh.Catalog.service;

import com.dh.Catalog.Catalog;
import com.dh.Catalog.dto.CatalogDto;
import com.dh.Catalog.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService{

    @Autowired
    private CatalogRepository repository;

    @Autowired
    private MoviesFeign moviesFeign;

    @Override
    public void save(CatalogDto dto) {
        Catalog catalog = new Catalog();
        catalog.setName(dto.getName());
        repository.save(catalog);
    }

    @Override
    public Long findByName(String name) {
        var catalog = repository.findByName(name);
        return catalog.getId();
    }

    @Override
    public String findMoviesByName(String name) {
        var catalog = repository.findByName(name);
        return moviesFeign.findName(catalog.getId());
    }

}
