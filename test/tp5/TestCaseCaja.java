package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseCaja {
	
	Producto productoNormal;
	ProductoDeCooperativa productoCooperativa;
	Caja cajaSupermercado; 
	
	
	@BeforeEach
	void setUp() throws Exception {
		productoNormal= new Producto("Aceite de oliva",270.0,15);
		productoCooperativa = new ProductoDeCooperativa("fideos%",50.0,20);
		cajaSupermercado = new Caja();
	}

	@Test
	void testConstructorCaja() {
		assertEquals(cajaSupermercado.getMontoAPagar(),0.0);
	}
	
	@Test
	void unaCajaPuedeRegistrarProductos() {
		/**
		 * una caja al registrar un producto simplemente acumula su precio 
		 * y el producto disminuye su stock
		 */
		cajaSupermercado.registrarProducto(productoNormal);
		cajaSupermercado.registrarProducto(productoCooperativa);
		
		assertEquals(cajaSupermercado.getMontoAPagar(),(productoNormal.getPrecio()+productoCooperativa.getPrecio()));
		assertEquals(productoNormal.getStock(),14);
		assertEquals(productoCooperativa.getStock(),19);
	}
}
