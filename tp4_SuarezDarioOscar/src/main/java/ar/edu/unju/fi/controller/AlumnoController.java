package ar.edu.unju.fi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.AlumnoCollections;
import ar.edu.unju.fi.model.Alumno;


@Controller
public class AlumnoController {

	@GetMapping("/alumno")
	public ModelAndView getIndex() {        //aqui el nombre del html
		ModelAndView mov = new ModelAndView("alumno");
		Alumno alumnoAux = new Alumno();
		alumnoAux.setApellido("Perez");
		alumnoAux.setDni("159753");
		alumnoAux.setNombre("Pepito");
		mov.addObject("alumnoForm", new Alumno());
		return mov;	
	}
	
	@PostMapping("guardarAlumno")
	public ModelAndView guardarAlumno(@ModelAttribute("alumnoForm") Alumno auxAlumno) {
		ModelAndView mov = new ModelAndView("alumno"); //aqui va el nombreDelHTML que quiero ver luego de presionarBOTON
		AlumnoCollections.agregarObjeto(auxAlumno);
		mov.addObject("listaDeAlumnos", AlumnoCollections.listarObjetos());
		//System.out.println(auxAlumno);
		return mov;
	}
}
