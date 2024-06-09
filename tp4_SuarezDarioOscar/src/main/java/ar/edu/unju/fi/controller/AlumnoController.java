package ar.edu.unju.fi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.AlumnoCollections;
import ar.edu.unju.fi.model.Alumno;


@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@GetMapping("/nuevo")
	public ModelAndView getFormAlumno() {        //aqui el nombre del html
		ModelAndView mov = new ModelAndView("alumno");
		mov.addObject("alumnoForm", new Alumno());
		mov.addObject("band", true);
		return mov;	
	}
	
	@PostMapping("/guardarAlumno")
	public ModelAndView guardarAlumno(@ModelAttribute("alumnoForm") Alumno auxAlumno) {
		ModelAndView mov = new ModelAndView("redirect:/alumno/lista"); //aqui va el nombreDelHTML que quiero ver luego de presionarBOTON
		AlumnoCollections.agregarObjeto(auxAlumno);
		//mov.addObject("listaDeAlumnos", AlumnoCollections.listarObjetos());
		//System.out.println(auxAlumno);
		return mov;
	}
	
	@GetMapping("/lista")
	public ModelAndView getListaAlumnos() {
		ModelAndView mov = new ModelAndView("alumno-list");
		mov.addObject("listaDeAlumnos", AlumnoCollections.listarObjetos());
		return mov;
	}
	

	@GetMapping("/eliminar/{dni}")
	public ModelAndView dni(@PathVariable("dni")String dni) {
		ModelAndView mov = new ModelAndView("redirect:/alumno/lista");
		AlumnoCollections.eliminarObjeto(dni);
		return mov;
	}
	
	@GetMapping("/modificar/{dni}")
	public ModelAndView modificarrAlumno(@PathVariable("dni")String dni) {
		ModelAndView mov = new ModelAndView("alumno");
		mov.addObject("alumnoForm",AlumnoCollections.buscarObjeto(dni));
		mov.addObject("band", false);
		return mov;
	}
	@PostMapping("/modificarAlumno")
	public ModelAndView modificarMateria(@ModelAttribute("materiaForm") Alumno alumno) {
		ModelAndView mov = new ModelAndView("redirect:/alumno/lista");
		AlumnoCollections.modificarObjeto(alumno, alumno.getDni());
		return mov;
	}
	
}