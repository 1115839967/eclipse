package com.itheima.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("hello")
	public Map hello() {
		Map map = new HashMap();
		map.put("name", "xutiancheng");
		map.put("age", 18);
		
		return map;
	}
}
