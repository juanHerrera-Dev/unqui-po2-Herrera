package tp10.Ejercicio1Encriptador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestCaseModoEncriptacionVocal {
	
	ModoEncriptacion modoEncriptacionVocal;
	
	@BeforeEach
	void setUp() throws Exception {
		modoEncriptacionVocal= new ModoEncriptacionVocal();
	}

	@Test
	void testElModoEncriptacionVocalPuedeEncriptarUnTexto() {
		// cambia las vocales del texto por su vocal consecutiva, las letras , numeros y espacios quedan igual
		
		String textoAEncriptar= "hola ";
		String textoEncriptado= "hule ";
		
		assertEquals(textoEncriptado,modoEncriptacionVocal.encriptar(textoAEncriptar));
	}
	
	@Test
	void testElModoEncriptacionVocalPuedeDesencriptarUnTexto() {
		// cambia las vocales del texto por su vocal anterior, las letras , numeros y espacios quedan igual
		
		String textoDesencriptado= "hola ";
		String textoEncriptado= "hule ";
		
		assertEquals(textoDesencriptado,modoEncriptacionVocal.desencriptar(textoEncriptado));
	}
	

}
