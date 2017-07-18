package com.me.dto;

import java.util.Date;

/**
 * @author Administrator
 * 
 * 简化的bean，主要用于前端显示电影的列表信息
 * */
public class MovieListBean {
	private String cover;
	private String tile;
	private String actor;
	private int id;
	private Date c_date;
	
	
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getTile() {
		return tile;
	}
	public void setTile(String tile) {
		this.tile = tile;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getC_date() {
		return c_date;
	}
	public void setC_date(Date c_date) {
		this.c_date = c_date;
	}
	@Override
	public String toString() {
		return "MovieListBean [cover=" + cover + ", tile=" + tile + ", actor=" + actor + ", id=" + id + ", c_date="
				+ c_date + "]";
	}

}
