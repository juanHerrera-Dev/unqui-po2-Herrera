package tp10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseModoEncriptacionNumerica {

ModoEncriptacion modoEncriptacionNumerica;
	
	@BeforeEach
	void setUp() throws Exception {
		modoEncriptacionNumerica= new ModoEncriptacionNumerica();
	}

	@Test
	void testElModoEncriptacionNumericaPuedeEncriptarUnTexto() {
		
		
		String textoAEncriptar= "hola ";
		String textoEncriptado= "8,15,12,1,0";
		
		assertEquals(textoEncriptado,modoEncriptacionNumerica.encriptar(textoAEncriptar));
	}
	
	@Test
	void testElModoEncriptacionNumericaPuedeDesencriptarUnTexto() {
		
		
		String textoDesencriptado= "hola ";
		String textoEncriptado= "8,15,12,1,0";
		
		assertEquals(textoDesencriptado,modoEncriptacionNumerica.desencriptar(textoEncriptado));
	}
	/*@Test
	void testPruebaCharAInt() {
		System.out.println('a'+1); no se puede porque devuelve otra escala de como se representar las letras.
		
	}*/
}
