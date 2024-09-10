package ar.edu.unq.poo2.CajaMercadoCentral;

public class Producto {
	private String nombre;
	private Double Precio;
	
	
	
	public Producto(String n, Double p) {
		this.setNombre(n);
		this.setPrecio(p);
		
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return Precio;
	}
	public void setPrecio(Double precio) {
		Precio = precio;
	}

}
