package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.compare.ObjectToStringComparator;

import ar.edu.unju.fi.model.Alumno;

public class AlumnoCollections {

	static List <Alumno> listaAlumnos=new ArrayList<>();

	public static void agregarObjeto(Alumno  objeto) {
		listaAlumnos.add(objeto);
		
	}
	
	public static List<Alumno> listarObjetos(){
		return listaAlumnos;
	}
	
	public static Alumno buscarObjeto(String buscado) {
		Alumno encontrado= new Alumno();
		for (int i=0; i<listaAlumnos.size();i++) {
			if(buscado.equals(listaAlumnos.get(i).getDni())) {
				encontrado=listaAlumnos.get(i);
			}
		}
		return encontrado;
	}
	
	public static void modificarObjeto(Alumno objeto, String buscado) {
		for (int i=0; i<listaAlumnos.size();i++) {
			if(buscado.equals(listaAlumnos.get(i).getDni())) {
				listaAlumnos.get(i).setDni(objeto.getDni());
				listaAlumnos.get(i).setApellido(objeto.getApellido());
				listaAlumnos.get(i).setNombre(objeto.getNombre());
				listaAlumnos.get(i).setDomicilio(objeto.getDomicilio());
				listaAlumnos.get(i).setEmail(objeto.getEmail());
				listaAlumnos.get(i).setFechaNacimineto(objeto.getFechaNacimineto());
				listaAlumnos.get(i).setLU(objeto.getLU());
				listaAlumnos.get(i).setTelefono(objeto.getTelefono());
				// listaAlumnos.set(i, objeto); //PROBAR para no hacer lo anterior
				
			}
		}
	}
	
	public static void eliminarObjeto(String buscado) {
		Alumno encontrado= new Alumno();
		for (int i=0; i<listaAlumnos.size();i++) {
			if(buscado.equals(listaAlumnos.get(i).getDni())) {
				listaAlumnos.remove(i);
			}
		}
	}
	
	
}
