package tp10.Ejercicio2Juego;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseMaquinaJuego {
	
	MaquinaDeJuegos maquinaSacoa;
	
	EstadoJuego sinCredito;
	EstadoJuego unJugador;
	

	@BeforeEach
	void setUp() throws Exception {
		sinCredito= mock(EstadoJuego.class);
		unJugador= mock(EstadoJuego.class);
		
		maquinaSacoa= new MaquinaDeJuegos(sinCredito);
		
		
	}

	@Test
	void testConstructorMaquina() {
		
		assertEquals(sinCredito,maquinaSacoa.getEstado());
	}
	@Test
	void testAUnaMaquinaDeJuegoSeLePuedeSetearSuEstado() {
		
		maquinaSacoa.setEstadoJuego(unJugador);
		
		assertEquals(unJugador,maquinaSacoa.getEstado());
	}
	/**
	 * No testeo la respuesta dependiendo el estado de la maquina debido o si cambia de un estado a otro porque
	 * me parece que es responsabilidad de los estados hacer eso
	 * */
	@Test
	void testCuandoAUnaMaquinaSeLeIndicaElInicioRetornaUnaRespuesta() {
		
		String MensajeEsperado = "Please insert coin";
		
		when(sinCredito.inicio(maquinaSacoa)).thenReturn(MensajeEsperado);
		
		
		assertEquals(MensajeEsperado, maquinaSacoa.inicio()); 
		
	}
	
	@Test
	void testCuandoAunaMaquinaSeLeingresaUnaFichaRetornaUnaRespuesta() {
		
		String MensajeEsperado = "Ready Player 1";
		
		when(sinCredito.ingresoFicha(maquinaSacoa)).thenReturn(MensajeEsperado);
		
		
		assertEquals(MensajeEsperado,maquinaSacoa.ingresoFicha());
		
	}

}
