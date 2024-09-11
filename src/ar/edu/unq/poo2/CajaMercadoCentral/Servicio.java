package ar.edu.unq.poo2.CajaMercadoCentral;

public class Servicio implements Agencia {
	private Double costoPorUnidad;
	private int cantidadConsumida;
	private Double cantidadTotalAPagar;
	
	public Servicio(Double c, int cant) {
		this.cantidadConsumida = cant;
		this.costoPorUnidad = c;
	}

	@Override
	public void registrarPago(Agencia factura) {
		this.cantidadTotalAPagar = this.costoPorUnidad * this.cantidadConsumida;
		
	}
	
	public Double getCantidadTotalAPagar() {
		return cantidadTotalAPagar;
	}
	
	
}
