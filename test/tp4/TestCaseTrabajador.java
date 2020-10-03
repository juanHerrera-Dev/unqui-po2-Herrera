package tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseTrabajador {
	
	
	private Trabajador trabajador;
	private Ingreso ingresoNormal;
	private IngresoHorasExtra ingresoHorasExtra;
	
	@BeforeEach
	void setUp() throws Exception {
		
		trabajador= new Trabajador();
		ingresoNormal= new Ingreso(Month.SEPTEMBER,20000.0,"devJunior");
		ingresoHorasExtra= new IngresoHorasExtra(Month.MAY,15000.0,"proyectoVerano",10);
	}

	@Test
	void testConstructorTrabajador() {


		assertEquals(trabajador.cantidadDeIngresos(),0);
	}
	
	@Test
	void totalMontoPercibidoDelTrabajador() {
		
		trabajador.agregarIngreso(ingresoNormal);
		trabajador.agregarIngreso(ingresoHorasExtra);
		
		assertEquals(trabajador.getTotalPercibido(),35000.0);
	}
	@Test
	void totalMontoImponibleDelTrabajador() {
		
		trabajador.agregarIngreso(ingresoNormal);
		trabajador.agregarIngreso(ingresoHorasExtra);
		
		assertEquals(trabajador.getMontoImponible(),20000.0);
	}
	@Test
	void impuestoAPagarDelTrabajador() {
		
		trabajador.agregarIngreso(ingresoNormal);
		trabajador.agregarIngreso(ingresoHorasExtra);
		
		assertEquals(trabajador.getImpuestoAPagar(),400.0);
	}
}
