package com.ats.personas;

public class Medico {
	
	private String titulacion;
	private int yearsExperience;
	
	public Medico(String titulacion, int yearsExperience) {
		this.titulacion = titulacion;
		this.yearsExperience = yearsExperience;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

	@Override
	public String toString() {
		return "Medico: \n" + super.toString() + "\nTitulaci�n" + titulacion + "\nA�os de experiencia: " + yearsExperience;
	}
	
	
	
}
