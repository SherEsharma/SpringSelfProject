package com.xenture.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.xenture.util.IConstant;

public class AppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext container) throws ServletException {
		System.out.println("First");
		AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
		ctx.register(AppConfiguration.class);
		ctx.setServletContext(container);
		
		ServletRegistration.Dynamic servlet=container.addServlet("dispatcher",new DispatcherServlet(ctx));
		servlet.setLoadOnStartup(IConstant.INT_ONE);
		servlet.addMapping("/");
		
	}

}
