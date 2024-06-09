package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

@Component
public class Carrera {

	//ATRIBUTOS
	private String codigo;
	private String nombre;
	private String cantidadDeAnios;
	private boolean estado;
	
	public Carrera() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Carrera(String codigo, String nombre, String cantidadDeAnios, boolean estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidadDeAnios = cantidadDeAnios;
		this.estado = estado;
	}




	@Override
	public String toString() {
		return "Carrera [codigo=" + codigo + ", nombre=" + nombre + ", cantidadDeAnios=" + cantidadDeAnios + ", estado="
				+ estado + "]";
	}




	//GETTER Y SETTER
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCantidadDeAnios() {
		return cantidadDeAnios;
	}
	public void setCantidadDeAnios(String cantidadDeAnios) {
		this.cantidadDeAnios = cantidadDeAnios;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	 
	
}