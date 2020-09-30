package tp3_IntroAJava.unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseRectanguloYCuadrado {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testConstructorRectangulo() {
		
		Punto puntoDeEsquinaEsperado = new Punto(0,2);
		
		Rectangulo rectangulo= new Rectangulo(new Punto(0,2),2,2);
		
		assertEquals(rectangulo.getAlto(),2);
		assertEquals(rectangulo.getAncho(),2);
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda(),puntoDeEsquinaEsperado);
	}
	@Test
	void testAreaDelRectangulo() {
		
		Rectangulo rectangulo= new Rectangulo(new Punto(0,2),2,2);
		
		assertEquals(rectangulo.area(),4);
		
	}
	@Test
	void testPerimetroDelRectangulo() {
		
		Rectangulo rectangulo= new Rectangulo(new Punto(0,2),1,2);
		
		assertEquals(rectangulo.perimetro(),6);
	}
	@Test
	void testEsHorizontalOVertical() {
		
		/**
		 * true = Horizontal false = vertical
		 */
		
		Rectangulo rectangulo= new Rectangulo(new Punto(0,2),1,2);
		
		assertTrue(rectangulo.esHorizontal());
	}
	@Test
	void testConstructorCuadrado() {
		
		Punto puntoDeEsquinaEsperado = new Punto(0,2);
		
		Cuadrado cuadrado= new Cuadrado(new Punto(0,2),2);
		
		assertEquals(cuadrado.getAlto(),2);
		assertEquals(cuadrado.getAncho(),2);
		assertEquals(cuadrado.getEsquinaSuperiorIzquierda(),puntoDeEsquinaEsperado);
	}
	@Test
	void testAreaDelCuadrado() {
		
		Cuadrado cuadrado= new Cuadrado(new Punto(0,2),2);
		
		assertEquals(cuadrado.area(),4);
		
	}
	@Test
	void testPerimetroDelCuadrado() {
		
		Cuadrado cuadrado= new Cuadrado(new Punto(0,2),1);
		
		assertEquals(cuadrado.perimetro(),4);
	}
}
