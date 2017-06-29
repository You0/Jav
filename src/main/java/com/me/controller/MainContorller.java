package com.me.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.me.dto.MovieListBean;
import com.me.service.IMainService;
import com.me.service.ISearchService;

@Controller
@RequestMapping("/main")
public class MainContorller {
	@Autowired
	ISearchService mSearchService;
	
	@Autowired
	IMainService mMainService;
	
	
	@RequestMapping(value="/last",method=RequestMethod.GET)
	@ResponseBody
	public Object getLastMovieList(@RequestParam("index")int index)
	{
		List<MovieListBean> beans = mSearchService.getLastMovieList(index);
		return beans;
	}
	
	
	@RequestMapping("/search")
	@ResponseBody
	public Object getMovieListByKey(@RequestParam("index")int index,@RequestParam("order")int order){
		List<MovieListBean> beans = mSearchService.getMovieLstByKey(index, order);
		return beans;
	}
	
	
	@RequestMapping("/type")
	@ResponseBody
	public Object getMovieListByType(@RequestParam("index")int index,@RequestParam("order")int order){
		List<MovieListBean> beans = mSearchService.getMovieListByType(index, order);
		return beans;
	}
	
	
	@RequestMapping("/actor")
	@ResponseBody
	public Object getMovieListByActor(@RequestParam("index")int index,@RequestParam("order")int order){
		List<MovieListBean> beans = mSearchService.getMovieListByActor(index, order);
		return beans;
	}
	
	
	
	
	
	
}
