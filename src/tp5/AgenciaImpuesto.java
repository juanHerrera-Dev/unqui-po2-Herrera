package tp5;

public class AgenciaImpuesto implements Agencia {
	
	@SuppressWarnings("unused")
	private String nombre;
	private boolean estadoDePago;
	
	public AgenciaImpuesto(String nombre) {
		this.nombre= nombre;
	}
	public void registrarPago(Factura factura) {
		this.estadoDePago= true;
	}
	public boolean getEstadoDePago() {
		return this.estadoDePago;
	}
}
