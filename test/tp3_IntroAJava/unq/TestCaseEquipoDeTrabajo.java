package tp3_IntroAJava.unq;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseEquipoDeTrabajo {

	
	Persona empleado1; 
	Persona empleado2; 
	Persona empleado3; 
	Persona empleado4;
	Persona empleado5;
	static EquipoDeTrabajo equipoA;
	
	
	@BeforeEach
	void setUp() throws Exception {
		 empleado1= new Persona("Juan",LocalDate.of(1996,9,10));
		 empleado2= new Persona("Martin",LocalDate.of(1992,10,6));
		 empleado3= new Persona("Pablo",LocalDate.of(1994,3,4));
		 empleado4= new Persona("Jeremias",LocalDate.of(1990,4,10));
		 empleado5= new Persona("Augusto",LocalDate.of(1999,12,10));
		
		 equipoA = new EquipoDeTrabajo("Unix");
		
		 equipoA.contratar(empleado1);
		 equipoA.contratar(empleado2);
		 equipoA.contratar(empleado3);
		 equipoA.contratar(empleado4);
		 equipoA.contratar(empleado5);
	}
	 

	@Test
	void testConstructorEquipo() {
	 
			
		assertEquals(equipoA.getNombre(),"Unix");
		assertEquals(equipoA.cantidadDeEmpleados(),5);
	}
	@Test
	void testEquipoSabeResponderElPromedioDeEdadDeSusEmpleados() {
	 
			
		assertEquals(equipoA.promedioDeEdad(),(25.4));
	}
	/**
	 * pense en printear los resultados con un main pero no sabria en donde , si en esta clase o en otro lado.
	 * Asi que solo hice los test e instancia en el setUp lo que se pedia.
	 */
}
