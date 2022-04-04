package com.iflytek.dao;

import com.iflytek.entity.Movie;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MovieDao {

    @Select("select * from t_movie")
    List<Movie> getAll();

    @Select("select * from t_movie where id=#{id}")
    Movie getMovieById(Long id);

    @Update("update t_movie set stars=stars+1 where id=#{id}")
    void increStars(Long id);
}
