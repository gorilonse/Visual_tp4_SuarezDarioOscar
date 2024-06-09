package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Docente;

public class DocenteCollections {

	static List<Docente> listaDocentes=new ArrayList<>();

	public static void agregarObjeto(Docente  objeto) {
		listaDocentes.add(objeto);
		
	}
	
	public static List<Docente> listarObjetos(){
		return listaDocentes;
	}
	
	public static Docente buscarObjeto(String buscado) {
		Docente encontrado= new Docente();
		for (int i=0; i<listaDocentes.size();i++) {
			if(buscado.equals(listaDocentes.get(i).getLegajo())) {
				encontrado=listaDocentes.get(i);
			}
		}
		return encontrado;
	}
	
	public static void modificarObjeto(Docente objeto, String buscado) {
		for (int i=0; i<listaDocentes.size();i++) {
			if(buscado.equals(listaDocentes.get(i).getLegajo())) {
				listaDocentes.set(i, objeto);
			}
		}
	}
	
	public static void eliminarObjeto(String buscado) {
		for (int i=0; i<listaDocentes.size();i++) {
			if(buscado.equals(listaDocentes.get(i).getLegajo())) {
				listaDocentes.remove(i);
			}
		}
	}
}
