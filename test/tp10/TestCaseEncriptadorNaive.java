package tp10;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseEncriptadorNaive {
	
	 EncriptadorNaive encriptadorN;
	 ModoEncriptacion modoVocal;
	 ModoEncriptacion modoNumerico;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		modoVocal= mock(ModoEncriptacion.class);
		
		encriptadorN= new EncriptadorNaive(modoVocal);
	}

	@Test
	void testConstructorEncriptadorNaive() {
		
		assertEquals(encriptadorN.getModoEncriptacion(),modoVocal);
	}
	
	@Test
	void testElEncriptadorNaivePuedeSetearElModoDeEncriptacion() {
		
		encriptadorN.setModoEncriptacion(modoNumerico);
		
		assertEquals(encriptadorN.getModoEncriptacion(),modoNumerico);
	}
	@Test
	void testElEncriptadorNaiverPuedeEncriptarUnTextoQueRecibeSegunSegunModo() {
		String textoAEncriptar= "Hola ";
		String textoEncriptado= "Hule ";
		
		when(modoVocal.encriptar(textoAEncriptar)).thenReturn(textoEncriptado);
		
		
		assertEquals(encriptadorN.encriptar(textoAEncriptar),textoEncriptado);
	}
	@Test
	void testElEncriptadorNaiverPuedeDesencriptarUnTextoQueRecibeSegunSuModo() {
		String textoDesencriptado= "Hola ";
		String textoEncriptado= "Hule ";
		
		when(modoVocal.desencriptar(textoEncriptado)).thenReturn(textoDesencriptado);
		
		
		assertEquals(encriptadorN.desencriptar(textoEncriptado),textoDesencriptado);
	}
	
	
}
