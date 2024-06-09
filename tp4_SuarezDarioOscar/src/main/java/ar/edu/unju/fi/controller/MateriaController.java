package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.CarreraCollections;
import ar.edu.unju.fi.collections.DocenteCollections;
import ar.edu.unju.fi.collections.MateriaCollections;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.numerado.Modalidad;

@Controller
@RequestMapping("/materia")
public class MateriaController {
	@Autowired
	Materia materia;
	

	@GetMapping("/nuevo")
	public ModelAndView getFormMateria() {
		ModelAndView mov = new ModelAndView("materia-form");
		mov.addObject("materiaForm", materia);
		mov.addObject("listaDocentes", DocenteCollections.listarObjetos());
		mov.addObject("listaCarreras", CarreraCollections.listarObjetosActivos());
		mov.addObject("modalidad",Modalidad.values());
		mov.addObject("band", true);
		return mov;
	}
	
	@GetMapping("/lista")
	public ModelAndView getListaMaterias() {
		ModelAndView mov = new ModelAndView("materia-list");
		mov.addObject("listaMaterias",MateriaCollections.listarObjetos());
		return mov;
	}
	
	@PostMapping("/guardarMateria")
	public ModelAndView guardarMateria(@ModelAttribute("materiaForm") Materia materia) {
		materia.setDocente(DocenteCollections.buscarObjeto(materia.getDocente().getLegajo()));
		materia.setCarrera(CarreraCollections.buscarObjeto(materia.getCarrera().getCodigo()));
		ModelAndView mov = new ModelAndView("redirect:/materia/lista");
		MateriaCollections.agregarObjeto(materia);
		return mov;
	}
	
	
	@GetMapping("/eliminar/{codigo}")
	public ModelAndView eliminarMateria(@PathVariable("codigo")String codigo) {
		ModelAndView mov = new ModelAndView("redirect:/materia/lista");
		MateriaCollections.eliminarObjeto(codigo);
		return mov;
	}
	
	@GetMapping("/modificar/{codigo}")
	public ModelAndView modificarrMateria(@PathVariable("codigo")String codigo) {
		ModelAndView mov = new ModelAndView("materia-form");
		mov.addObject("materiaForm", MateriaCollections.buscarObjeto(codigo));
		mov.addObject("listaDocentes", DocenteCollections.listarObjetos());
		mov.addObject("listaCarreras", CarreraCollections.listarObjetosActivos());
		mov.addObject("modalidad",Modalidad.values());
		mov.addObject("band", false);
		return mov;
	}
	@PostMapping("modificarMateria")
	public ModelAndView modificarMateria(@ModelAttribute("materiaForm") Materia materia) {
		materia.setDocente(DocenteCollections.buscarObjeto(materia.getDocente().getLegajo()));
		materia.setCarrera(CarreraCollections.buscarObjeto(materia.getCarrera().getCodigo()));
		ModelAndView mov = new ModelAndView("redirect:/materia/lista");
		MateriaCollections.modificarObjeto(materia, materia.getCodigo());
		return mov;
	}
}
