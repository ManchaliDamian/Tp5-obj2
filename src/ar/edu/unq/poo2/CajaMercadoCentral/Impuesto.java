package ar.edu.unq.poo2.CajaMercadoCentral;

public class Impuesto implements Agencia {
	private int monto;
	
	public Impuesto(int monto) {
		this.setMonto(monto);;
	}
	@Override
	public void registrarPago(Agencia factura) {
		
		
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
}
