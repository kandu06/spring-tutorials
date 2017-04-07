package com.boot.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//This is a configuration file and can be used in conjunction with applicaiton.properties. 
//All configurations provided in applcation.properties can also be configured programatically in java like below.

@Configuration
public class PersistenceConfiguration {

	/*
	// @Bean annotation tells spring to create this bean and autowire it in
	// application.
	
	// @ConfigurationProperties tells spring to use any property with given
	// prefix from application.properties. Additional properties can also be set
	// here.
	
	// @Primary tells spring to use this datasource by default, in case it finds
	// a conflict.

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	@Primary
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	// @FlywayDataSource tells spring that this is the flyway datasource. Spring integrates well with flyway db.
	
	@Bean
	@ConfigurationProperties(prefix = "flyway")
	@FlywayDataSource
	public DataSource flywayDataSource() {
		return DataSourceBuilder.create().build();
	}
	*/

}
