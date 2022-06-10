package com.dh.Movies.dto;

import lombok.Data;

@Data
public class MoviesDto {

    private Long id;
    private String name;
    private String genre;
    private String urlStream;

}
