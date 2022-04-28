package com.iag.swe;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTest {
	/**
	*	Give unit test dummy 
	*	when this is running 
	*	then return true.
	*/
	@Test
	void contextLoads() {
		 assertTrue(true,"the unit test dummy is running and ok ;)");
	}

}
