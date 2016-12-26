package br.com.michelli.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.michelli.controllers.HomeController;
import br.com.michelli.dao.CursoDAO;
import br.com.michelli.dao.materiaDao;


@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class, CursoDAO.class, materiaDao.class})
public class AppConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("/WEB-INF/views/");
	    resolver.setSuffix(".jsp");
	    return resolver;
	}
}