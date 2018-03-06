package com.youyisky.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.youyisky.service.impl.FirstService;

@RestController
@RequestMapping("index/")
public class PageController {

	final Logger logger = LoggerFactory.getLogger(PageController.class);
	@Autowired
	private FirstService firstService;

	@GetMapping("/1")
	public String Index() {

		long time = System.currentTimeMillis();
		logger.info("time ->{} ", time);
		return Long.toString(time);

	}

	@GetMapping("/add")
	public String add(@RequestParam("a") String a, @RequestParam("b") String b)

	{
		logger.info("a->{} b->{}", a, b);
		try {
			return firstService.Add(Integer.parseInt(a), Integer.parseInt(b)) + "";
		} catch (final Exception e) {
			// final 重抛
			e.printStackTrace();
			return "";
		}
	}

}
