package com.ats.personas;

public class Persona {
	
	protected String nombre;
	protected String apellido;
	protected int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Nombre: \n" + nombre + "\napellido=" + apellido + "\nedad=" + edad;
	}
	
	
	

}
