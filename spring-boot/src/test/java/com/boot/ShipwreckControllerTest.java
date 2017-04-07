package com.boot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;



public class ShipwreckControllerTest {
	
	//Mockito used for mocking objects, like repository.
	//Hamcrest used for more readable and natural assertion.
	
	//This dependency injection is managed by mockito.
	@InjectMocks
	private ShipwreckController sc;
	
	//This tells mokito that sr is to be mocked.
	@Mock
	private ShipwreckRepository sr;
	
	//@Before function is called every time a test is run.
	//MokitoAnnotations.initMocks(this) tells mockito to create mocks and wire them up.
 	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShipwreckController(){
		Shipwreck sw=new Shipwreck();
		sw.setId(1L);
		
		Shipwreck retSw=sc.get(1L);
		//when & thenReturn are apis provided by mockito.
		//It does exactly what it says. It will mock the api call and return our dummy stub object.
		when(sr.getOne(1L)).thenReturn(sw);
		
		
		//This call verifies if the mocked object api was called propertly.
		verify(sr).findOne(1L);
		
		assertTrue(retSw.getId().equals(1L));
		
		//Below api is same as the assertTrue(junit) used above, but much simpler to read, using hamcrest.
		assertThat(retSw,is(1L));
		
		
	}

}
