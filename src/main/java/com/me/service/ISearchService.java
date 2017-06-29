package com.me.service;


import java.util.List;

import com.me.dto.MovieListBean;

public interface ISearchService {
	
	/**
	 * @param index 第几页 
	 * 
	 * 获取最近的电影的列表
	 * */
	public List<MovieListBean> getLastMovieList(int index);
	
	/**
	 * @param 
	 * 	index 第几页
	 * 	order -1降序，0不排序，1升序 (按时间)
	 * 
	 * 根据电影的type搜索电影
	 * */
	public List<MovieListBean> getMovieListByType(int index,int order);
	
	/**
	 * @param 
	 * 		index 第几页
	 * 		order -1降序，0不排序，1升序 (按时间)
	 * 
	 * 根据传入的关键字查询电影列表(这个搜索标题、type和actor)
	 * */
	public List<MovieListBean> getMovieLstByKey(int index,int order);
	
	
	/**
	 * @param 
	 * 		index 第几页
	 * 		order -1降序，0不排序，1升序 (按时间)
	 * 
	 * 根据演员查询电影
	 * */
	public List<MovieListBean> getMovieListByActor(int index,int order);
	

}
