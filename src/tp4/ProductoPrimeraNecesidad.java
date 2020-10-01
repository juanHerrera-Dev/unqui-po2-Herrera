package tp4;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean estadoDePrecioCuidado) {
		super(nombre,precio,estadoDePrecioCuidado);
	}
	
	 @Override public double getPrecio() {
		
		return (super.getPrecio()*0.9);
	}
}
