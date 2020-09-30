package tp3_IntroAJava.unq;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCasePersona {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	@Test
	void testConstructorPersona() {
		
		
		Persona persona= new Persona("Juan",LocalDate.of(1996,9,10));
		
		assertEquals(persona.getNombre(),"Juan");
		assertEquals(persona.getFechaNacimiento(),LocalDate.of(1996,Month.SEPTEMBER,10));
		
	}

	@Test
	void testUnaPersonaPuedeConocerSuEdad() {
		
		
		Persona persona= new Persona("Juan",LocalDate.of(1996,9,10));
		
		
		assertEquals(persona.edad(),24);
		
	}
	@Test
	void testUnaPersonaPuedeSaberSiEsMenorQueOtra() {
		
		
		Persona juan= new Persona("Juan",LocalDate.of(1996,9,10));
		Persona martin= new Persona("Martin",LocalDate.of(1990,5,23));
		
		assertTrue(juan.menorQue(martin));
		
	}
	
}
