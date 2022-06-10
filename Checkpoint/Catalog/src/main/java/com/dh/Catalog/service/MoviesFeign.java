package com.dh.Catalog.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "MOVIES")
public interface MoviesFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/movies/catalog/{id}")
    String findName(@PathVariable(value = "id") Long genre);
}
