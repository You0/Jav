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
	 *  type 电影的类型
	 * 根据电影的type搜索电影
	 * */
	public List<MovieListBean> getMovieListByType(int index,int order,String type);
	
	/**
	 * @param 
	 * 		index 第几页
	 * 		order -1降序，0不排序，1升序 (按时间)
	 * 		key 查询关键字
	 * 根据传入的关键字查询电影列表(这个搜索标题、type和actor)
	 * */
	public List<MovieListBean> getMovieLstByKey(int index,int order,String key);
	
	
	/**
	 * @param 
	 * 		index 第几页
	 * 		order -1降序，0不排序，1升序 (按时间)
	 * 		actor 演员
	 * 根据演员查询电影
	 * */
	public List<MovieListBean> getMovieListByActor(int index,int order,String actor);
	
	
	
	
	/**
	 * @param 
	 * 		index 第几页
	 * 		order -1降序，0不排序，1升序 (按时间)
	 * 		director 导演
	 * 根据导演查询电影
	 * */
	public List<MovieListBean> getMovieListByDirector(int index,int order,String director);
	
	
	/**
	 * @param 
	 * 		index 第几页
	 * 		order -1降序，0不排序，1升序 (按时间)
	 * 		time 时间
	 * 根据时间查询电影
	 * */
	public List<MovieListBean> getMovieListByTime(int index,int order,String time);
	
	
	/**
	 * @param 
	 * 		index 第几页
	 * 		order -1降序，0不排序，1升序 (按时间)
	 * 		ratirng 评分
	 * 根据评分查询电影
	 * */
	public List<MovieListBean> getMovieListByRating(int index,int order,int rating);
	
	
	/**
	 * @param 
	 * 		index 第几页
	 * 		order -1降序，0不排序，1升序 (按时间)
	 *
	 * 组合查询,使用多个关键字进行查询
	 * */
	public List<MovieListBean> getMovieListByGroup(int index,int order,String key,String actor
			,String director,String time,String rating,String type);
	

}
