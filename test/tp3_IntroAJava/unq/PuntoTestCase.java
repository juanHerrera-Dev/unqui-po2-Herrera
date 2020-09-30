package tp3_IntroAJava.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 
class PuntoTestCase {
	
	Punto punto;
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	void sePuedeConstruirUnPuntoConCoordenadasElegidas() {
		
		punto = new Punto(2,3);
		
		assertEquals(punto.getX(),2);
		assertEquals(punto.getY(),3);

	}
	@Test
	void sePuedeConstruirUnPuntoSinIndicarCoordenadas() {
		
		punto = new Punto();
		
		assertEquals(punto.getX(),0);
		assertEquals(punto.getY(),0);

	}
	@Test
	void sePuedeMoverUnPuntoAOtraUbicacion() {
		
		punto = new Punto();
		
		punto.moverA(5,6);
		
		assertEquals(punto.getX(),5);
		assertEquals(punto.getY(),6);

	}
	@Test
	void sePuedeSumarUnPuntoAOtroPunto() {
		
		punto = new Punto(2,2);
		
		Punto puntoASumar= new Punto(4,4);
		
		punto.sumar(puntoASumar);
		
		assertEquals(punto.getX(),6);
		assertEquals(punto.getY(),6);

	}
}
