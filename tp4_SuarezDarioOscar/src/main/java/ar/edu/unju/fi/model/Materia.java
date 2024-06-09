package ar.edu.unju.fi.model;

import org.attoparser.trace.MarkupTraceEvent.DocumentEndTraceEvent;
import org.springframework.stereotype.Component;
import ar.edu.unju.fi.numerado.Modalidad;

public class Materia {

	//ATRIBUTOS
	private String codigo;
	private String nombre;
	private String curso;
	private String cantidadDeHora;   
	private Modalidad modalidadDeHoraString;  //ENUMERADO
	private Docente docente; //del tipo Docente
	private Carrera carrera; //del tipo Carrera
	
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(String codigo, String nombre, String curso, String cantidadDeHora, Modalidad modalidadDeHoraString,
			Docente docente, Carrera carrera) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.curso = curso;
		this.cantidadDeHora = cantidadDeHora;
		this.modalidadDeHoraString = modalidadDeHoraString;
		this.docente = docente;
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nombre=" + nombre + ", curso=" + curso + ", cantidadDeHora="
				+ cantidadDeHora + ", modalidadDeHoraString=" + modalidadDeHoraString + ", docente=" + docente
				+ ", carrera=" + carrera + "]";
	}

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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCantidadDeHora() {
		return cantidadDeHora;
	}

	public void setCantidadDeHora(String cantidadDeHora) {
		this.cantidadDeHora = cantidadDeHora;
	}

	public Modalidad getModalidadDeHoraString() {
		return modalidadDeHoraString;
	}

	public void setModalidadDeHoraString(Modalidad modalidadDeHoraString) {
		this.modalidadDeHoraString = modalidadDeHoraString;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
	
	
	
}
