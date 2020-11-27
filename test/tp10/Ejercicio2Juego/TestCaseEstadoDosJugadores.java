package tp10.Ejercicio2Juego;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseEstadoDosJugadores {

	 MaquinaDeJuegos maquinaSacoa;
	 EstadoJuego estadoDosJugadores;
	 
	 EstadoSinCredito estadoSinCredito;
	
	@BeforeEach
	void setUp() throws Exception {
		maquinaSacoa = mock(MaquinaDeJuegos.class);
		
		estadoDosJugadores= new EstadoDosJugadores();
		estadoSinCredito= mock(EstadoSinCredito.class);
	}

	@Test
	void testCuandoAlEstadoDosJugadoresSeLeEnviaElMensajeInicioRetornaUnaRespuestaYSeCambiaElEstadoDeLaMaquina() {
		
		String textoEsperado = "multiplayer player campaign starts";
		
		assertEquals(textoEsperado, estadoDosJugadores.inicio(maquinaSacoa));
		
		verify(maquinaSacoa).setEstadoJuego(any(EstadoSinCredito.class));
	}
	
	@Test
	void testCuandoAlEstadoDosJugadoresSeLeEnviaElMensajeIngresoFichaRetornaUnaRespuesta() {
		
		String textoEsperado = "All players are ready, invalid insert of coin";
		
		assertEquals(textoEsperado,  estadoDosJugadores.ingresoFicha(maquinaSacoa));
		
	}

}
