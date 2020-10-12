package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseFacturas {
	
	Servicio servicio;
	Impuesto impuesto;
	AgenciaServicio movistar;
	AgenciaImpuesto edesur;
	
	@BeforeEach
	void setUp() throws Exception {
		
		this.edesur= new AgenciaImpuesto("Edesur");
		this.movistar= new AgenciaServicio("Movistar");
		
		this.servicio= new Servicio(5.0,100.0,this.movistar);
		this.impuesto= new Impuesto(3000.0,this.edesur);
	}

	@Test
	void testConstructorFactura() {
		
		assertEquals(this.servicio.getAgencia(),this.movistar);
		assertEquals(this.impuesto.getAgencia(),this.edesur);
	}
	@Test
	void testMontoAPagarDeFactura() {
		
		assertEquals(this.servicio.montoAPagar(),500.0);
		assertEquals(this.impuesto.montoAPagar(),3000.0);
	}
}
