package tp4;

import java.util.ArrayList;



public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos;

	public Supermercado(String nombre, String direccion) {
		
		this.nombre= nombre;
		this.direccion= direccion;
		this.productos= new ArrayList<Producto>();
	}

	public Integer getCantidadDeProductos() {
		
		return this.productos.size();
	}

	public void agregarProducto(Producto producto) {
		
		this.productos.add(producto);
		
	}

	public Double getPrecioTotal() {
		
	double precioTotal= 0;
		
		if(this.productos.isEmpty())
			
		{return precioTotal;}
		
		else{
			for (Producto producto:this.productos){
				precioTotal=precioTotal + producto.getPrecio();
				}
		return precioTotal;
		}
	}

}
