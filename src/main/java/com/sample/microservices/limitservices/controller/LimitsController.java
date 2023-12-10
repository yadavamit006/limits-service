package com.sample.microservices.limitservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.microservices.limitservices.bean.Limits;
import com.sample.microservices.limitservices.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration config;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(config.getMinimum(),config.getMaximum());
	}
}
