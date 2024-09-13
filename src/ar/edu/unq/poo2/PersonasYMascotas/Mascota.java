package ar.edu.unq.poo2.PersonasYMascotas;

public class Mascota implements Nombrable{
	private String nombre;
	private String raza;
	
	public Mascota(String n, String r) {
		this.nombre = n;
		this.raza = r;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getRaza() {
		return this.raza;
	}
}
