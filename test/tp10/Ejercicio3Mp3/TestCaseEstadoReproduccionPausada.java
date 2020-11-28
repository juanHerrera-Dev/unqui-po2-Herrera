package tp10.Ejercicio3Mp3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseEstadoReproduccionPausada {

	EstadoMp3 estadoReproduccionEnPausa;
	
	Mp3 mp3;
	
	Song cancion1;
	
	@BeforeEach
	void setUp() throws Exception {
		
		mp3= mock(Mp3.class);
		
		estadoReproduccionEnPausa= new EstadoReproduccionEnPausa();
		
		cancion1= mock(Song.class);
	}

	@Test
	void testCuandoAlEstadoReproduccionEnPausaSeLeMandaElMensajePlayProduceUnError() {
		
		assertThrows(RuntimeException.class, 
            	() -> estadoReproduccionEnPausa.play(mp3,cancion1));
		
	}
	@Test
	void testCuandoAlEstadoReproduccionEnPausaSeLeMandaElMensajePauseRetornaUnaRespuestaYCambiaEsEltadoDeMp3YPausaLaCancion() {
		

		String RespuestaEsperada= "la cancion se esta reproduciendo";
		
		
		assertEquals(RespuestaEsperada,estadoReproduccionEnPausa.pause(mp3,cancion1));
		verify(mp3).setEstado(any(EstadoMp3.class));
		
		verify(cancion1).pause();
		
	}
	@Test
	void testCuandoAlEstadoReproduccionEnPausaSeLeMandaElMensajeStopModificaElEstadoDeMp3RetornaUnaRespuestaYAlaCancionLaDetiene() {
		
		String RespuestaEsperada= "seleccione una cancion para reproducir";
		
		
		assertEquals(RespuestaEsperada,estadoReproduccionEnPausa.stop(mp3,cancion1));
		verify(mp3).setEstado(any(EstadoMp3.class));
		
		verify(cancion1).stop();

	}
}
