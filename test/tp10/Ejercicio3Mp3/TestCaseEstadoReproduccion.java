package tp10.Ejercicio3Mp3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseEstadoReproduccion {

	EstadoMp3 estadoReproduccion;
	
	Mp3 mp3;
	
	Song cancion1;
	
	@BeforeEach
	void setUp() throws Exception {
		
		mp3= mock(Mp3.class);
		
		estadoReproduccion= new EstadoReproduccion();
		
		cancion1= mock(Song.class);
	}

	@Test
	void testCuandoAlEstadoReproduccionSeLeMandaElMensajePlayRetornaUnError() {
		
		assertThrows(RuntimeException.class, 
            	() -> estadoReproduccion.play(mp3,cancion1));
		
	}
	@Test
	void testCuandoAlEstadoReproduccionSeLeMandaElMensajePauseRetornaUnaRespuestaYCambiaEsEltadoDeMp3YPausaLaCancion() {
		

		String RespuestaEsperada= "la cancion esta en pausa";
		
		
		assertEquals(RespuestaEsperada,estadoReproduccion.pause(mp3,cancion1));
		verify(mp3).setEstado(any(EstadoMp3.class));
		
		verify(cancion1).pause();
		
	}
	@Test
	void testCuandoAlEstadoReproduccionSeLeMandaElMensajeStopModificaElEstadoDeMp3YRetornaUnaRespuesta() {
		
		String RespuestaEsperada= "seleccione una cancion para reproducir";
		
		
		assertEquals(RespuestaEsperada,estadoReproduccion.stop(mp3,cancion1));
		verify(mp3).setEstado(any(EstadoMp3.class));
		
		verify(cancion1).stop();
	
	}


}
