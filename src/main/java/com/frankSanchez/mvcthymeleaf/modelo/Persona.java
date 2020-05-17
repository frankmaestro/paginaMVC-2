package com.frankSanchez.mvcthymeleaf.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="persona")
public class Persona {

	@Id
	//@GeneratedValue
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	//@Column(name="nombre")
	private String nombre;
	
	//@Column(name="correo")
	private String correo;
	
	//@Column(name="nacionalidad")
	private String nacionalidad;
	

	public Persona() {
		
	}

	public Persona(int id, String nombre, String correo, String nacionalidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.nacionalidad = nacionalidad;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getNacionalidad() {
		return nacionalidad;
	}



	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	

}


