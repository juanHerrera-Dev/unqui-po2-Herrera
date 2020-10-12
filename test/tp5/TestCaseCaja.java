package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseCaja {
	
	Producto productoNormal;
	ProductoDeCooperativa productoCooperativa;
	Caja cajaSupermercado; 
	
	Factura servicio;
	Factura impuesto;
	AgenciaServicio movistar;
	AgenciaImpuesto edesur;
	
	@BeforeEach
	void setUp() throws Exception {
		productoNormal= new Producto("Aceite de oliva",270.0,15);
		productoCooperativa = new ProductoDeCooperativa("fideos%",50.0,20);
		cajaSupermercado = new Caja();
		
		this.edesur= new AgenciaImpuesto("Edesur");
		this.movistar=  new AgenciaServicio("Movistar");
		
		this.servicio= new Servicio(5.0,100.0,this.movistar);
		this.impuesto= new Impuesto(3000.0,this.edesur);
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
		cajaSupermercado.registrarCobrable(productoNormal);
		cajaSupermercado.registrarCobrable(productoCooperativa);
		
		
		
		assertEquals(cajaSupermercado.getMontoAPagar(),(productoNormal.getPrecio()+productoCooperativa.getPrecio()));
		assertEquals(productoNormal.getStock(),14);
		assertEquals(productoCooperativa.getStock(),19);
	}
	@Test
	void unaCajaPuedeRegistrarTantoProductosComoFacturas() {
		/**
		 * una caja al registrar un producto simplemente acumula su precio 
		 * y el producto disminuye su stock
		 */
		cajaSupermercado.registrarCobrable(productoNormal);
		cajaSupermercado.registrarCobrable(productoCooperativa);
		cajaSupermercado.registrarCobrable(servicio);
		cajaSupermercado.registrarCobrable(impuesto);
		
		double montoEsperado= productoNormal.getPrecio()+productoCooperativa.getPrecio()+impuesto.montoAPagar()+servicio.montoAPagar();
		
		assertEquals(cajaSupermercado.getMontoAPagar(),(montoEsperado));
		assertEquals(productoNormal.getStock(),14);
		assertEquals(productoCooperativa.getStock(),19);
	}
	void cuandoEnUnaCajaSeRegistranFacturasSusAgenciasRegistranElPago() {
		/**
		 * una caja al registrar un producto simplemente acumula su precio 
		 * y el producto disminuye su stock
		 */
		
		cajaSupermercado.registrarCobrable(servicio);
		cajaSupermercado.registrarCobrable(impuesto);
		
		
		
		assertTrue(movistar.getEstadoDePago());
		assertTrue(edesur.getEstadoDePago());
		
	}
}
