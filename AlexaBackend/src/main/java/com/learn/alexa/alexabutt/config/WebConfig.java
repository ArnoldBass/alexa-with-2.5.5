package com.learn.alexa.alexabutt.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.ask.servlet.SkillServlet;
import com.learn.alexa.alexabutt.servlet.AlexaServlet;

@Configuration
public class WebConfig {
	

	@Bean
	public ServletRegistrationBean<AlexaServlet> registerAlexaServlet(){
		AlexaServlet alexaSkillServlet = new AlexaServlet();
		ServletRegistrationBean<AlexaServlet> servRegBean = new ServletRegistrationBean<>(alexaSkillServlet,"/alexa");
		servRegBean.setLoadOnStartup(1);
		return servRegBean;
		
	}
}
