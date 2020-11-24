package tp7.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseAdaptadorDeDateTime {
	
	IFecha fechaX;
	IFecha fechaY;
	
	@BeforeEach
	void setUp() throws Exception {
		fechaX= new AdaptadorDeDateTime(new DateTime(2050,10,10,19,35));
		fechaY= new AdaptadorDeDateTime(new DateTime(2020,10,10,19,35));
	}
	/**
	metodos de IFecha
	void restarDias(int cantidadDeDias);
	boolean antesDeAhora();
	boolean antesDe(IFecha fecha);
	boolean despuesDeAhora();
	boolean despuesDeFecha(IFecha fecha);
	int dia();
	int mes();
	int anio();
	 
	 * */
	@Test
	void testConstructorAdaptadorDeDateTime() {
		assertEquals(2020,fechaY.anio());
		assertEquals(10,fechaY.mes());
		assertEquals(10,fechaY.dia());
	}
	@Test
	void testUnAdaptadorDeDateTimePuedeDisminuirSusDias() {
		
		fechaY.restarDias(5);
		
		assertEquals(5,fechaY.dia());
	}
	@Test
	void testUnAdaptadorDeDateTimePuedeSaberSiEsUnaFechaAnteriorALaActual() {
		
		
		assertTrue(fechaY.antesDeAhora());
	}
	@Test
	void testUnAdaptadorDeDateTimePuedeSaberSiEsUnaFechaAnteriorAUnaFechaDada() {
		
		fechaY.restarDias(5);
		
		assertTrue(fechaY.antesDe(fechaX));
	}
	@Test
	void testUnAdaptadorDeDateTimePuedeSaberSiEsUnaFechaPosteriorALaActual() {
		
		
		assertFalse(fechaY.despuesDeAhora());
	}
	@Test
	void testUnAdaptadorDeDateTimePuedeSaberSiEsUnaFechaPosteriorAUnaFechaDada() {
		
		
		
		assertFalse(fechaY.despuesDeFecha(fechaX));
	}
}
