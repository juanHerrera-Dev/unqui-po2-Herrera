package tp4;

public class Producto {

	private String nombre;
	private double precio;
	private boolean precioCuidado;
	
	public Producto(String nombre, double precio) {
		
		this.nombre=nombre;
		this.precio=precio;
		this.precioCuidado= false;
	}

	public Producto(String nombre, double precio, boolean estadoPrecioCuidado) {
		
		this.nombre=nombre;
		this.precio=precio;
		this.precioCuidado= estadoPrecioCuidado;
	}

	public String getNombre() {
		
		return this.nombre;
	}

	public double getPrecio() {
		
		return this.precio;
	}

	public boolean esPrecioCuidado() {
		
		return this.precioCuidado;
	}

	public void aumentarPrecio(double aumento) {
		
		this.precio =this.precio + aumento;
		
	}
	
}
