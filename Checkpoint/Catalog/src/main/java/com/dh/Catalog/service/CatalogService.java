package com.dh.Catalog.service;


import com.dh.Catalog.dto.CatalogDto;

public interface CatalogService {

    void save(CatalogDto dto);

    Long findByName(String name);

    String findMoviesByName(String name);
}
