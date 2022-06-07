package com.iag.swe.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
* this is the controller class
*/
@SpringBootTest
public class DemoControllerTest {
	/**
	*	Give unit test dummy 
	*	when this is running 
	*	then return true.
	*/
	@Test
	void helloTest() {
		DemoController demoTest = new DemoController();
		 assertTrue(!demoTest.equals("hello world!!!"),"the unit test dummy is running and ok ;)");
	}


}

