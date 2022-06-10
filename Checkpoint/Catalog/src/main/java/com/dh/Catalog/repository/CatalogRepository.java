package com.dh.Catalog.repository;

import com.dh.Catalog.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Long> {
    Catalog findByName(String name);
}
