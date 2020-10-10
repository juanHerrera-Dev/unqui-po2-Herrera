package tp5;

public class Producto {
	
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(String nombre, double precio, int stock) {
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
	}

	public Object getNombre() {
		
		return this.nombre;
	}

	public Integer getStock() {
		
		return this.stock;
	}

	public double getPrecio() {
		
		return this.precio;
	}

	public void disminuirStock() {
		
		this.stock= this.stock-1 ;
		
	}
	
	
}
