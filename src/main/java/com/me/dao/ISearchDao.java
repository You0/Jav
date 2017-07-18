package com.me.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.me.dto.MovieListBean;

@Repository
public interface ISearchDao {
	List<MovieListBean> getLastMovieList(Map<String,Object> map);
	//根据关键字获取
	List<MovieListBean> getMovieListByKey(Map<String,Object> map);

	List<MovieListBean> getMovieListByType(Map<String,Object> map);
	
	List<MovieListBean> getMovieListByActor(Map<String,Object> map);

	List<MovieListBean> getMovieListByDirector(Map<String,Object> map);

	List<MovieListBean> getMovieListByTime(Map<String,Object> map);

	List<MovieListBean> getMovieListByRating(Map<String,Object> map);

	List<MovieListBean> getMovieListByGroup(Map<String,Object> map);
}
