package br.com.setra.aws.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/test")
@Log4j2
public class TestController {

	@GetMapping("/dog/{name}")
	@ResponseStatus(code = HttpStatus.OK)
	public String dogTest(@PathVariable String name) {
		log.info("Test Controller - name {}", name);
		return "Name : " + name;
	}
	
	
}
