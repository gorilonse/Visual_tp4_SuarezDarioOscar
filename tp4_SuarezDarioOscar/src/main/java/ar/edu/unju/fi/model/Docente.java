package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

public class Docente {
	//ATRIBUTO
	private String legajo;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	
	public Docente() {
		// TODO Auto-generated constructor stub
	}
	
		
	public Docente(String legajo, String nombre, String apellido, String email, String telefono) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}




	@Override
	public String toString() {
		return "Docente [legajo=" + legajo + ", nombre=" + nombre + ", epellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + "]";
	}


	
	//GETTER Y SETTER 
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEpellido() {
		return apellido;
	}
	public void setEpellido(String epellido) {
		this.apellido = epellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	

}
