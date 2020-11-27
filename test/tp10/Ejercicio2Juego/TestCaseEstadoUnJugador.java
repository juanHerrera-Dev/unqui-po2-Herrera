package tp10.Ejercicio2Juego;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseEstadoUnJugador {

	 MaquinaDeJuegos maquinaSacoa;
	 EstadoJuego estadoUnJugador;
	 EstadoDosJugadores estadoDosJugadores;
	 EstadoSinCredito estadoSinCredito;
	
	@BeforeEach
	void setUp() throws Exception {
		maquinaSacoa = mock(MaquinaDeJuegos.class);
		estadoUnJugador = new EstadoUnJugador();
		estadoDosJugadores= mock(EstadoDosJugadores.class);
		estadoSinCredito= mock(EstadoSinCredito.class);
	}

	@Test
	void testCuandoAlEstadoUnJugadorSeLeEnviaElMensajeInicioRetornaUnaRespuestaYSeCambiaElEstadoDeLaMaquina() {
		
		String textoEsperado = "single player campaign starts";
		
		assertEquals(textoEsperado, estadoUnJugador.inicio(maquinaSacoa));
		
		verify(maquinaSacoa).setEstadoJuego(any(EstadoSinCredito.class));
	}
	
	@Test
	void testCuandoAlEstadoUnJugadorSeLeEnviaElMensajeIngresoFichaRetornaUnaRespuestaYSeCambiaElEstadoDeLaMaquina() {
		
		String textoEsperado = "All Players ready";
		
		assertEquals(textoEsperado,  estadoUnJugador.ingresoFicha(maquinaSacoa));
		verify(maquinaSacoa).setEstadoJuego(any(EstadoDosJugadores.class));
	}
}
