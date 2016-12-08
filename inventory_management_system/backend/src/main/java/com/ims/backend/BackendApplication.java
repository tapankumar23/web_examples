package com.ims.backend;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.ims.backend.conf.JwtFilter;

@SpringBootApplication
@ImportResource( { "applicationContext.xml"} ) 
public class BackendApplication {
	
	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter((Filter) new JwtFilter());
		registrationBean.addUrlPatterns("/rest/*");
		
		return registrationBean;
	}
	
	public static void main(String[] args) { SpringApplication.run(BackendApplication.class, args); }
}
