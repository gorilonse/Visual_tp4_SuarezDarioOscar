package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.collections.DocenteCollections;
import ar.edu.unju.fi.model.Docente;

@Controller
@RequestMapping("/docente")
public class DocenteController {
	@Autowired
	Docente docente;
	
	
	@GetMapping("/nuevo")
	public ModelAndView getFormDocente() {
		ModelAndView mov = new ModelAndView("docente-form");
		mov.addObject("docenteForm", docente);
		mov.addObject("band", true);
		return mov;
	}
	
	@GetMapping("/lista")
	public ModelAndView getListaDocentes() {
		ModelAndView mov = new ModelAndView("docente-list");
		mov.addObject("listaDocentes",DocenteCollections.listarObjetos());
		return mov;
	}
	
	@PostMapping("/guardarDocente")
	public ModelAndView guardarDocente(@ModelAttribute("docenteForm") Docente docente) {
		ModelAndView mov = new ModelAndView("redirect:/docente/lista");
		DocenteCollections.agregarObjeto(docente);
		return mov;
	}
	@GetMapping("/eliminar/{legajo}")
	public ModelAndView eliminarDocente(@PathVariable("legajo")String legajo) {
		ModelAndView mov = new ModelAndView("redirect:/docente/lista");
		DocenteCollections.eliminarObjeto(legajo);
		return mov;
	}
	
	@GetMapping("/modificar/{legajo}")
	public ModelAndView modificarrDocente(@PathVariable("legajo")String legajo) {
		ModelAndView mov = new ModelAndView("docente-form");
		mov.addObject("docenteForm", DocenteCollections.buscarObjeto(legajo));
		mov.addObject("band", false);
		return mov;
	}
	@PostMapping("/modificarDocente")
	public ModelAndView modificarDocente(@ModelAttribute("docenteForm") Docente docente) {
		ModelAndView mov = new ModelAndView("redirect:/docente/lista");
		DocenteCollections.modificarObjeto(docente, docente.getLegajo());
		return mov;
	}

}
