package ar.edu.unju.fi.model;

import java.time.LocalDate;
import java.util.Date;

public class Alumno {

	
	//ATRIBUTOS
	
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private LocalDate fechaNacimineto;
	private String domicilio;
	private String LU;
	
	
	//GETTER Y SETTER
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	public LocalDate getFechaNacimineto() {
		return fechaNacimineto;
	}
	public void setFechaNacimineto(LocalDate fechaNacimineto) {
		this.fechaNacimineto = fechaNacimineto;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getLU() {
		return LU;
	}
	public void setLU(String lU) {
		LU = lU;
	}
	

	
	 
}
