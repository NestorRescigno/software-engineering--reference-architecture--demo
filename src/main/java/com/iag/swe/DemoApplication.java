package com.iag.swe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* DemoApplication is application type "hello world", 
* this print to message on browser. 
**/
@SpringBootApplication
public class DemoApplication {
	/**
	 *  main appication start with spring framework library SpringApplication.run()
	 **/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	public String errorSonarTest(){
		String hola = "mi";
	        return hola;
	}

}
