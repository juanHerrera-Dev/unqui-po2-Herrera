package tp5;

public class Producto implements Cobrable{
	
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(String nombre, double precio, int stock) {
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
	}

	public String getNombre() {
		
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
	
	public double registrarse() {
		
		this.disminuirStock();
		return getPrecio();
		
	}
	
}
