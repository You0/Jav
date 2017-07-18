package com.me.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.me.dto.MovieListBean;
import com.me.service.ISearchService;

@Service
public class SearchServiceImpl implements ISearchService{

	@Override
	public List<MovieListBean> getLastMovieList(int index) {
		
		return null;
	}

	@Override
	public List<MovieListBean> getMovieListByType(int index, int order, String type) {
		
		return null;
	}

	@Override
	public List<MovieListBean> getMovieLstByKey(int index, int order, String key) {
		
		return null;
	}

	@Override
	public List<MovieListBean> getMovieListByActor(int index, int order, String actor) {
		
		return null;
	}

	@Override
	public List<MovieListBean> getMovieListByDirector(int index, int order, String director) {
		
		return null;
	}

	@Override
	public List<MovieListBean> getMovieListByTime(int index, int order, String time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovieListBean> getMovieListByRating(int index, int order, String rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovieListBean> getMovieListByGroup(int index, int order, String key, String actor, String director,
			String time, String rating, String type) {
		// TODO Auto-generated method stub
		return null;
	}



}
