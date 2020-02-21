package com.training.externalproperty.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.training.externalproperty.model.FakeDataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class DataSourceConfig {

	@Value("${data.user}")
	String user;
	@Value("${data.password}")
	String password;
	
	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setPassword(password);
		fakeDataSource.setUser(user);
		System.out.println(user);
		return fakeDataSource;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
