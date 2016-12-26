package br.com.michelli.controllers;

import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.michelli.models.Curso;
import br.com.michelli.models.TipoMateria;
import br.com.michelli.dao.CursoDAO;




@Controller
public class HomeController {
	
	@Autowired
	private CursoDAO cursoDao;
	
	
	@RequestMapping("/form")
	public ModelAndView form(){
		ModelAndView mv = new ModelAndView("form");
		mv.addObject("materias", TipoMateria.values());
		System.out.println(TipoMateria.values());
		return mv;
	}
	
	@RequestMapping("/confirma")
	public String gravarCursos(Curso curso){
		System.out.println(curso.getMaterias());
		cursoDao.gravar(curso);
		return "confirmaCurso";
	}
	
	@RequestMapping("/listaCursos")
	public String mostraCursos(Model model) throws SQLException{
		System.out.println(cursoDao.lista());
		model.addAttribute("cursos", cursoDao.lista());
		return "lista";
	}
	
	@RequestMapping("/listaMaterias")
	public String mostraMaterias(Model model) throws SQLException{
		System.out.println(cursoDao.listaMaterias());
		model.addAttribute("materias", cursoDao.listaMaterias());
		return "listaMaterias";
	}
	
	@RequestMapping("/cadastrarMaterias")
	public String formMaterias(){
		return "materias";
	}
	
	//@RequestMapping("/cadastrarMaterias")
	//public String gravarMaterias(Materias materia){
		//System.out.println(materia);
		//mDao.gravarMateria(materia);
		//return "materias";
	//}
}
