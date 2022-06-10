package com.dh.Movies.service;

import com.dh.Movies.dto.MoviesDto;
import org.apache.commons.configuration.resolver.CatalogResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.catalog.Catalog;

@FeignClient(name = "CATALOG")
public interface CatalogFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/catalog/{name}")
    Long findByName(@RequestParam (value = "name" ) String genre);
}
