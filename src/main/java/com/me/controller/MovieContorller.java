package com.me.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.me.entity.Movie;
import com.me.service.IMovieService;

@Controller
@RequestMapping("/movie")
public class MovieContorller {
	@Autowired
	private IMovieService MovieService;
	
	
	/**
	 * 根据单个编号获取电影细节
	 * */
	@RequestMapping("/detail")
	@ResponseBody
	public Movie getMovieDetail(@RequestParam("fh")String fh) {
		Movie movie = MovieService.getMovieDetail(fh);
		return movie;
	}

	/**
	 * 根据多个编号获取电影细节
	 * */
	@RequestMapping("/details")
	@ResponseBody
	public List<Movie> getMovieDetails(@RequestParam("fh")String fhs) {
		String[] fhStrings = fhs.split(" ");
		List<Movie> movies = MovieService.getMovieDetails(Arrays.asList(fhStrings));
		return movies;
	}
	
}
