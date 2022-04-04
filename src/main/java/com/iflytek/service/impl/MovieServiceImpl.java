package com.iflytek.service.impl;

import com.iflytek.dao.MovieDao;
import com.iflytek.entity.Movie;
import com.iflytek.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Override
    public List<Movie> findAll() {
        return movieDao.getAll();
    }

    @Override
    public Movie findById(Long id) {
        return movieDao.getMovieById(id);
    }

    //给电影点赞，返回最新的点赞数量
    @Override
    public Integer increStars(Long id) {
        movieDao.increStars(id);
        Movie movie = this.findById(id);
        return movie.getStars();
    }
}
