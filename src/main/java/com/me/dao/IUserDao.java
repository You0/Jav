package com.me.dao;

import org.apache.ibatis.annotations.Param;

import com.me.entity.Test;

public interface IUserDao {
	Test getTestById(@Param("id") int id);
	
}
