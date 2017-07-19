package com.me.service;

import java.util.List;

import com.me.entity.Movie;

/**
 * 获取电影细节，剧照，预告片，海报，评分，演员，导演，类型之类的信息
 * */
public interface IMovieService{
	//根据电影编号获取电影细节
	public Movie getMovieDetail(String fh);
	//根据一系列电影编号获取一系列电影细节
	public List<Movie> getMovieDetails(List<String> fh);
	
}
