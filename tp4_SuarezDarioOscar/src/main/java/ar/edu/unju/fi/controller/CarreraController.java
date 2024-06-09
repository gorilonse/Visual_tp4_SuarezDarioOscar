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
import ar.edu.unju.fi.model.Carrera;

@Controller
@RequestMapping("/carrera")
public class CarreraController {


	@Autowired
	Carrera carrera;
	
	@GetMapping("/nuevo")
	public ModelAndView getCarreraForm() {
		ModelAndView mov = new ModelAndView("carrera-form");
		carrera.setEstado(true);
		mov.addObject("carreraForm", carrera);
		mov.addObject("band", true);
		return mov;
	}
	
	@GetMapping("/lista")
	public ModelAndView getListaCarrera() {
		ModelAndView mov = new ModelAndView("carrera-list");
		mov.addObject("listaCarreras", CarreraCollections.listarObjetos());
		return mov;
	}
	
	@PostMapping("/guardarCarrera")
	public ModelAndView guardarCarrera(@ModelAttribute("carreraForm")Carrera carrera) {
		ModelAndView mov=new ModelAndView("redirect:/carrera/lista");
		CarreraCollections.agregarObjeto(carrera);
		return mov;
	}	
	@GetMapping("/eliminar/{codigo}")
	public ModelAndView dni(@PathVariable("codigo")String codigo) {
		ModelAndView mov = new ModelAndView("redirect:/carrera/lista");
		CarreraCollections.eliminarObjeto(codigo);
		return mov;
	}
	
	@GetMapping("/modificar/{codigo}")
	public ModelAndView modificarrAlumno(@PathVariable("codigo")String codigo) {
		ModelAndView mov = new ModelAndView("carrera-form");
		mov.addObject("carreraForm", CarreraCollections.buscarObjeto(codigo));
		mov.addObject("band", false);
		return mov;
	}
	@PostMapping("/modificarCarrera")
	public ModelAndView modificarMateria(@ModelAttribute("materiaForm") Carrera carrera) {
		ModelAndView mov = new ModelAndView("redirect:/carrera/lista");
		CarreraCollections.modificarObjeto(carrera, carrera.getCodigo());
		return mov;
	}
	
}
