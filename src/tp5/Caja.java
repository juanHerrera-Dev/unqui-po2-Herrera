package tp5;

public class Caja {

	private double montoAPagar;
	
	public Caja() {
		this.montoAPagar= 0.0;
	}
	
	
	
	public double getMontoAPagar() {
		
		return this.montoAPagar;
	}



	/*public void registrarProducto(Producto producto) {
		
		this.montoAPagar= this.montoAPagar + producto.getPrecio();
		
		producto.disminuirStock();
	}*/



	public void registrarCobrable(Cobrable productoCobrable) {
		
		this.montoAPagar= this.montoAPagar + productoCobrable.registrarse();
		
	}

}
