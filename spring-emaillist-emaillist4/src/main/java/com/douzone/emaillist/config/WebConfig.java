package com.douzone.emaillist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
 * WebConfig == spring-servlet.xml 
 * 메세지 컨버터, 뷰 리절브 다 여기서 설정
 */

@Configuration
@EnableWebMvc // == <mvc:annotation-driven/>
@ComponentScan("com.douzone.emaillist.controller")
public class WebConfig {
	 
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver resolver = 
				new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/views");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		
		return resolver;
	}
	
	
}
