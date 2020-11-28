package tp10.Ejercicio3Mp3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestCaseEstadoSeleccionDeCancion {
	
	EstadoMp3 estadoSeleccionDeCancion;
	
	Mp3 mp3;
	
	Song cancion1;
	
	@BeforeEach
	void setUp() throws Exception {
		
		mp3= mock(Mp3.class);
		
		estadoSeleccionDeCancion= new EstadoDeSeleccionDeCancion();
		
		cancion1= mock(Song.class);
	}

	@Test
	void testCuandoAlEstadoSeleccionDeCancionSeLeMandaElMensajePlayRetornaUnaRespuestaYCambiaElEstadoDeMp3YReproduceLaCancion() {
		
		String RespuestaEsperada= "la cancion esta en reproduccion";
		
		
		assertEquals(RespuestaEsperada,estadoSeleccionDeCancion.play(mp3,cancion1));
		verify(mp3).setEstado(any(EstadoMp3.class));
		verify(mp3).setCancion(cancion1);
		verify(cancion1).play();
		
	}
	@Test
	void testCuandoAlEstadoSeleccionDeCancionSeLeMandaElMensajePauseTiraUnError() {
		

		assertThrows(RuntimeException.class, 
            	() -> estadoSeleccionDeCancion.pause(mp3,cancion1));
		
	}
	@Test
	void testCuandoAlEstadoSeleccionDeCancionSeLeMandaElMensajeStopNoHaceNada() {
		
	 // no se como testear la nada
	}

}
