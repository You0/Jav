package com.me.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.me.entity.Test;

@Repository
public interface IUserDao {
	Test getTestById(@Param("id") int id);
	
}
