package com.boot;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boot.controller.HelloController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DasBootApplicationTests {

	@Test
	public void contextLoads() {
		
		HelloController hc=new HelloController();
//		assertTrue(hc.sayHello().equalsIgnoreCase("Hello. Reporting to work !!"));
		assertEquals(hc.sayHello(),"Hello. Reporting to work !!");
		
	}

}
