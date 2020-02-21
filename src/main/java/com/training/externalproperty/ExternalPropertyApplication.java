package com.training.externalproperty;

import java.applet.AppletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.training.externalproperty.model.FakeDataSource;

@SpringBootApplication
public class ExternalPropertyApplication {

	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ExternalPropertyApplication.class, args);
		FakeDataSource fakeDataSource=(FakeDataSource)ctx.getBean("fakeDataSource");
		System.out.println(fakeDataSource.getUser());
	}

}
