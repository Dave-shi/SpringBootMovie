package com.iflytek.service;

import com.iflytek.entity.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAll();

    Movie findById(Long id);

    Integer increStars(Long id);
}
