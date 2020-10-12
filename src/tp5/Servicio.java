package tp5;

public class Servicio implements Factura{
	
	private double costoUnidad;
	private double unidadesConsumidas;
	private Agencia agencia;

	public Servicio(double costoUnidad, double unidadesConsumidas, Agencia agencia) {
		this.costoUnidad= costoUnidad;
		this.unidadesConsumidas= unidadesConsumidas;
		this.agencia= agencia;
	}

	public Agencia getAgencia() {
		
		return this.agencia;
	}

	public double montoAPagar() {
		
		return this.costoUnidad*this.unidadesConsumidas;
	}
	public double registrarse() {
		
		return montoAPagar();
		
	}
}
