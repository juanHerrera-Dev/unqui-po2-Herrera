package tp5;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(String nombre, double precio, int stock) {
		
		super(nombre,precio,stock);
	}
	
	@Override public double getPrecio() {
		
		
		return super.getPrecio()*0.9;
	}
	
	
}
