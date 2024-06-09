package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ar.edu.unju.fi.model.Carrera;

public class CarreraCollections {

	static List<Carrera> listaCarreras=new ArrayList<>();
	public static void agregarObjeto(Carrera  objeto) {
		listaCarreras.add(objeto);
		
	}
	
	public static List<Carrera> listarObjetos(){
		return listaCarreras;
	}
	
	public static List<Carrera>listarObjetosActivos(){
		Predicate<Carrera> filtrarDisponibles = c -> c.getEstado();
		return listaCarreras.stream().filter(filtrarDisponibles).collect(Collectors.toList());
	}
	
	public static Carrera buscarObjeto(String buscado) {
		Carrera encontrado= new Carrera();
		for (int i=0; i<listaCarreras.size();i++) {
			if(buscado.equals(listaCarreras.get(i).getCodigo())) {
				encontrado=listaCarreras.get(i);
			}
		}
		return encontrado;
	}
	
	public static void modificarObjeto(Carrera objeto, String buscado) {
		for (int i=0; i<listaCarreras.size();i++) {
			if(buscado.equals(listaCarreras.get(i).getCodigo())) {
				listaCarreras.set(i, objeto);
			}
		}
	}
	
	public static void eliminarObjeto(String buscado) {
		for (int i=0; i<listaCarreras.size();i++) {
			if(buscado.equals(listaCarreras.get(i).getCodigo())) {
				listaCarreras.remove(i);
			}
		}
	}
	
}
