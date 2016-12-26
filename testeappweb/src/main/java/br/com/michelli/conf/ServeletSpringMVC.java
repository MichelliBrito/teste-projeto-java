package br.com.michelli.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.com.michelli.conf.AppConfiguration;
import br.com.michelli.conf.JPAConfiguration;

public class ServeletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {AppConfiguration.class, JPAConfiguration.class};//classe de configuração do servlet do SpringMVC
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};//SpringMVC atenderá as requisições a partir da raiz do nosso projeto (/)
	}

}
