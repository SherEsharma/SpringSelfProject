package com.xenture.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.xenture.util.IConstant;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages =IConstant.CANDIDATE_BASE_PACKAGE)
public class AppConfiguration extends WebMvcConfigurerAdapter  {
	@Bean
	 public ViewResolver viewResolver() {
		System.out.println("Second");
       InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
       viewResolver.setViewClass(JstlView.class);
       viewResolver.setPrefix("/WEB-INF/view/");
       viewResolver.setSuffix(".jsp");

       return viewResolver;
   }
	
			

}
