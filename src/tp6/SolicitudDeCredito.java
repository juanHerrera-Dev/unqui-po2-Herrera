package tp6;

public abstract class  SolicitudDeCredito {
	
	private Cliente cliente;
	private double monto;
	private int plazo;//plazo en meses para pagar
	
	
	public SolicitudDeCredito(Cliente cliente, double monto, int plazo) {
		this.cliente=cliente;
		this.monto=monto;
		this.plazo=plazo;
	}


	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return this.cliente;
	}


	public double getMonto() {
		// TODO Auto-generated method stub
		return this.monto;
	}


	public int getPlazo() {
		// TODO Auto-generated method stub
		return this.plazo;
	}


	public double montoAbonoMensual() {
		// TODO Auto-generated method stub
		return monto/plazo;
	}
	public abstract boolean esAceptado();
}
