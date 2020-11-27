package tp10.Ejercicio2Juego;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseEstadoSinCredito {
	
	EstadoJuego estadoSinCredito;
	EstadoUnJugador estadoUnJugador;
	MaquinaDeJuegos maquinaSacoa;
	
	@BeforeEach
	void setUp() throws Exception {
		
		maquinaSacoa= mock(MaquinaDeJuegos.class);
		estadoSinCredito= new EstadoSinCredito();
		estadoUnJugador= new EstadoUnJugador();
	}

	@Test
	void testCuandoElEstadoSinCreditoRecibeElMensajeInicioRetornaUnaRespuesta() {
		
		String MensajeEsperado = "Please insert coin";
		
		assertEquals(MensajeEsperado, estadoSinCredito.inicio(maquinaSacoa)); 
	}
	@Test
	void testCuandoElEstadoSinCreditoRecibeElMensajeIngresoFichaRetornaUnaRespuestaYCambiaElEstadoDeLaMaquina() {
		
		String MensajeEsperado = "Ready Player 1";
		
		assertEquals(MensajeEsperado, estadoSinCredito.ingresoFicha(maquinaSacoa));
		
		verify(maquinaSacoa).setEstadoJuego(any(EstadoUnJugador.class));

	}
}
