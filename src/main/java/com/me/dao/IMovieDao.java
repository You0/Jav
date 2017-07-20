package com.me.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.me.entity.Movie;

@Repository
public interface IMovieDao {
	Movie getMovieDetail(String fh);
}
