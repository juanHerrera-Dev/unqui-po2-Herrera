package tp5;

public class AgenciaServicio implements Agencia {
	
	private boolean estadoDePago= false;
	@SuppressWarnings("unused")
	private String nombre;
	
	public AgenciaServicio(String nombre) {
		this.nombre= nombre;
	}
	public void registrarPago(Factura factura) {
		this.estadoDePago= true;
	}
	public boolean getEstadoDePago() {
		return this.estadoDePago;
	}
}
