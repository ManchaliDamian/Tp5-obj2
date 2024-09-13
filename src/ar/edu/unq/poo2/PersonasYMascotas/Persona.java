package ar.edu.unq.poo2.PersonasYMascotas;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Nombrable {
	private String nombre;
	private LocalDate fecNac;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFecNac() {
		return fecNac;
	}
	public void setFecNac(LocalDate fecNac) {
		this.fecNac = fecNac;
	}
	public Persona(String nombre, LocalDate fecNac) {
		super();
		this.nombre = nombre;
		this.fecNac = fecNac;
	}

	 public int calcularEdad() {
	        LocalDate hoy = LocalDate.now();
	        return Period.between(this.getFecNac(), hoy).getYears();
	 }
	 
	 public int compararEdad(Persona otraPersona) {
		 
	        return Integer.compare(this.calcularEdad(), otraPersona.calcularEdad());
	   
	 }



}
