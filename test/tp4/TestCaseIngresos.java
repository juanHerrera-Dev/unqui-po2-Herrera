package tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseIngresos {
	
	private IngresoHorasExtra ingresoHorasExtra;
	private Ingreso ingresoNormal;
	
	@BeforeEach
	void setUp() throws Exception {
		
		ingresoNormal= new Ingreso(Month.SEPTEMBER,20000.0,"devJunior");
		ingresoHorasExtra= new IngresoHorasExtra(Month.MAY,15000.0,"proyectoVerano",10);
	}

	@Test
	void testConstructorIngresoNormal() {
		
		assertEquals(ingresoNormal.getMesPercepcion(), Month.SEPTEMBER);
		assertEquals(ingresoNormal.getMontoPercibido(), 20000.0);
		assertEquals(ingresoNormal.getConcepto(),"devJunior");
	}
	@Test
	void testConstructorIngresoPorHorasExtra() {
		
		assertEquals(ingresoHorasExtra.getMesPercepcion(), Month.MAY);
		assertEquals(ingresoHorasExtra.getMontoPercibido(), 15000.0);
		assertEquals(ingresoHorasExtra.getConcepto(),"proyectoVerano");
		assertEquals(ingresoHorasExtra.getHorasExtra(),10);
	}
	@Test
	void testMontoImponibleDeIngresoNormal() {
		
		assertEquals(ingresoNormal.montoImponible(),20000.0);
		
	}
	@Test
	void testMontoImponibleDeIngresoPorHorasExtra() {
		
		assertEquals(ingresoHorasExtra.montoImponible(),0.00000);
		
	}
}
