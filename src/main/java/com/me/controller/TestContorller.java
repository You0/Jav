package com.me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("t")
public class TestContorller {

	@RequestMapping(value="/test")
	@ResponseBody
	public String test()
	{
		return "Xx";
	}
	
}
