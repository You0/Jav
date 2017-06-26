package com.me.Jav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.me.entity.Test;
import com.me.service.ITestService;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ApplicationContext ac = null;  
	    ITestService userService;
    	ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");  
        userService = (ITestService) ac.getBean("userService");  
        Test m = userService.getTestById(213);
        System.out.println(m.getId());
	}
}
