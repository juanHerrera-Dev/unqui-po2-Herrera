package tp11.EjercicioCuentasCorrientes;

public class CuentaCorriente extends CuentaBancaria{
	
	private Integer limiteDescubierto;
	
	public CuentaCorriente(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo, Integer limiteDescubierto) {
		super(historialDeMovimientos, notificador, saldo);
		this.limiteDescubierto = limiteDescubierto;
	}
	
	public Boolean cumpleCondicionesParaExtraer(Integer monto) {
		return (this.saldo + this.limiteDescubierto) >= monto;
	}

}
