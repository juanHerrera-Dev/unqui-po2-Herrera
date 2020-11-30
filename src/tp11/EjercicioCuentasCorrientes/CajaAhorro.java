package tp11.EjercicioCuentasCorrientes;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}
	
	public Boolean cumpleCondicionesParaExtraer(Integer monto) {
		return this.saldo >= monto;
	}
	

}
