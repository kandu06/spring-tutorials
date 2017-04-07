package com.boot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

//This annotation tells to run the test with Spring Junit4 class runner and not regular junit test runner. It is part of spring-boot-starter-test.
@RunWith(SpringJUnit4ClassRunner.class)

//This annotation takes the main class as input and from there it knows how to load spring context and how to wire all objects. 
//This is the key to run integration tests. This tells sping to use the context in main class and boot up the entire context, with all beans autowired.
@ContextConfiguration(classes=DasBootApplication.class)
public class ShipwreckRepositoryIntegrationTest {

	//This object will be autowired with appropriate DB connection based on appication.properties.
	//Which means the application will boot up for every test run and hence integration tests could be slow.
	@Autowired
	private ShipwreckRepository sr;
	
	@Test
	public void testFindAll(){
		List<Shipwreck> shipwrecks=sr.findAll();
		
		assertThat(shipwrecks.size(),is(greaterThanOrEqualTo(0)));
		
	}
	
	
}
