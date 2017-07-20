package com.me.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.dao.IMovieDao;
import com.me.entity.Movie;
import com.me.service.IMovieService;

@Service
public class MovieService implements IMovieService{
	
	@Autowired
	private IMovieDao MovieDao;
	
	@Override
	public Movie getMovieDetail(String fh) {
		Movie movie = MovieDao.getMovieDetail(fh);
		return movie;
	}

	@Override
	public List<Movie> getMovieDetails(List<String> fh) {
		List<Movie> list = new LinkedList<>();
		for(int i = 0;i<fh.size();i++){
			Movie movie = MovieDao.getMovieDetail(fh.get(i));
			list.add(movie);
		}
		return list;
	}

}
