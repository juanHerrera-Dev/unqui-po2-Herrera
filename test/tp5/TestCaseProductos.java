package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseProductos {
	
	
	Producto productoNormal;
	ProductoDeCooperativa productoCooperativa;
	
	@BeforeEach
	void setUp() throws Exception {
		
		productoNormal= new Producto("Aceite de oliva",270.0,15);
		productoCooperativa = new ProductoDeCooperativa("fideos%",50.0,20);
	}

	@Test
	void testConstructorProducto() {
		
		
		
		assertEquals(productoNormal.getNombre(),"Aceite de oliva");
		assertEquals(productoNormal.getPrecio(),270.0);
		assertEquals(productoNormal.getStock(),15);
	}
	@Test
	void testProductoCooperativaCalculaPrecio() {
		
		
		
		assertEquals(productoCooperativa.getPrecio(),45.0);
		
	}
	@Test
	void testProductoDisminuyeStock() {
		
		productoCooperativa.disminuirStock();
		productoNormal.disminuirStock();
		
		
		assertEquals(productoNormal.getStock(),14);
		assertEquals(productoCooperativa.getStock(),19);
		
	}
}
