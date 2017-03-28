package com.fitness.model;

import org.hibernate.validator.constraints.Range;

public class Goal {
	
	//this is a form validation for minutes field. Error msg displayed in addGoals.jsp. Any action on validation failure is specified in the controller method.
	//Also, note the default error msg can be changed as well using the properties, check out messages.properties file.
	//this is an example of JSR-303 validation.
	@Range(min=1,max=120) 
	private int minutes;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	
}
