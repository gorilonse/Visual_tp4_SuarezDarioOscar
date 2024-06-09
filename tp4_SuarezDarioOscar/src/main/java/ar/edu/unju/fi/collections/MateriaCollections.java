package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Materia;

public class MateriaCollections {


	static List <Materia> listaMaterias=new ArrayList<>();
	public static void agregarObjeto(Materia  objeto) {
		listaMaterias.add(objeto);
		
	}
	
	public static List<Materia> listarObjetos(){
		return listaMaterias;
	}
	
	public static Materia buscarObjeto(String buscado) {
		Materia encontrado= new Materia();
		for (int i=0; i<listaMaterias.size();i++) {
			if(buscado.equals(listaMaterias.get(i).getCodigo())) {
				encontrado=listaMaterias.get(i);
			}
		}
		return encontrado;
	}
	
	public static void modificarObjeto(Materia objeto, String buscado) {
		for (int i=0; i<listaMaterias.size();i++) {
			if(buscado.equals(listaMaterias.get(i).getCodigo())) {
				listaMaterias.set(i, objeto);
			}
		}
	}
	
	public static void eliminarObjeto(String buscado) {
		for (int i=0; i<listaMaterias.size();i++) {
			if(buscado.equals(listaMaterias.get(i).getCodigo())) {
				listaMaterias.remove(i);
			}
		}
	}
}
