package com.me.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.dao.ISearchDao;
import com.me.dto.MovieListBean;
import com.me.service.ISearchService;

@Service
public class SearchServiceImpl implements ISearchService{
	
	private final int pageSize = 10;
	@Autowired
	private ISearchDao searchDao;
	

	public List<MovieListBean> getLastMovieList(int index) {
		
		return null;
	}


	public List<MovieListBean> getMovieListByType(int index, int order, String type) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		int from = index * pageSize;
		params.put("from", from);
		params.put("pageSize", pageSize);
		params.put("order", order);
		params.put("type", type);
		List<MovieListBean> list = searchDao.getMovieListByGroup(params);
		return list;
	}


	public List<MovieListBean> getMovieLstByKey(int index, int order, String key) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("index", index);
		params.put("order", order);
		params.put("key", key);
		List<MovieListBean> list = searchDao.getMovieListByGroup(params);
		return list;
	}


	public List<MovieListBean> getMovieListByActor(int index, int order, String actor) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("index", index);
		params.put("order", order);
		params.put("actor", actor);
		List<MovieListBean> list = searchDao.getMovieListByGroup(params);
		return list;
	}


	public List<MovieListBean> getMovieListByDirector(int index, int order, String director) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("index", index);
		params.put("order", order);
		params.put("director", director);
		List<MovieListBean> list = searchDao.getMovieListByGroup(params);
		return list;
	}


	public List<MovieListBean> getMovieListByTime(int index, int order, String time) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("index", index);
		params.put("order", order);
		params.put("time", time);
		List<MovieListBean> list = searchDao.getMovieListByGroup(params);
		return list;
	}


	public List<MovieListBean> getMovieListByRating(int index, int order, String rating) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		int from = index * pageSize;
		params.put("from", from);
		params.put("pageSize", pageSize);
		params.put("order", order);
		params.put("rating", rating);
		List<MovieListBean> list = searchDao.getMovieListByGroup(params);
		return list;
	}


	public List<MovieListBean> getMovieListByGroup(int index, int order, String key, String actor, String director,
			String time, String rating, String type) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		int from = index * pageSize;
		params.put("from", from);
		params.put("pageSize", pageSize);
		params.put("order", order);
		params.put("type", type);
		params.put("rating", rating);
		params.put("time", time);
		params.put("actor", actor);
		params.put("director", director);
		List<MovieListBean> list = searchDao.getMovieListByGroup(params);
		return list;
	}



}
