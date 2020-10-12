package tp5;

public class Impuesto implements Factura{

	private double tasaImpuesto;
	private Agencia agencia;

	public Impuesto(double tasaImpuesto, Agencia agencia) {
		this.tasaImpuesto= tasaImpuesto;
		this.agencia= agencia;
	}

	public Agencia getAgencia() {
		
		return this.agencia;
	}

	public double montoAPagar() {
		
		return this.tasaImpuesto;
	}
	public double registrarse() {
		
		return montoAPagar();
		
	}
}
