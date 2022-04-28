package com.iag.swe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* this is the controller class
*/
@RestController
@RequestMapping(path = "/demo")
public class DemoController {
	
	/**
	 * method hello, this return message "hello world!!" 
	 * method request GET (http://localhost:8080/demo/hello)
	 */
	@GetMapping
	public String hello() {
		return "hello world!!!";
	}

}
