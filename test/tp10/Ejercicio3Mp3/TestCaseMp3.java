package tp10.Ejercicio3Mp3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseMp3 {
	
	Mp3 mp3;
	
	EstadoMp3 estadoSeleccionDeCancion;
	EstadoMp3 estadoReproduccion;
	EstadoMp3 estadoReproduccionPausada;
	
	Song cancion1;
	Song cancion2;
	
	@BeforeEach
	void setUp() throws Exception {
		estadoSeleccionDeCancion= mock(EstadoMp3.class);
		estadoReproduccion=mock(EstadoMp3.class);
		mp3= new Mp3(estadoSeleccionDeCancion);
		cancion1= mock(Song.class);
	}

	@Test
	void testConstructorMp3() {
		
		assertEquals(estadoSeleccionDeCancion,mp3.getEstado());
		assertNull(mp3.getCancionEnReproduccion());// no deberia tener ninguna cancion asignada cuando se crea
	}
	
	@Test
	void testSetEstadoMp3() {
		
		mp3.setEstado(estadoReproduccion);
		
		assertEquals(estadoReproduccion,mp3.getEstado());
	}
	@Test
	void testSetCancionEnReproduccionMp3() {
		
		mp3.setCancion(cancion2);
		
		assertEquals(cancion2,mp3.getCancionEnReproduccion());
	}
	
	@Test
	void testCuandoMp3RecibeElMensajePlayRetornaUnaRespuesta() {
		
		String RespuestaEsperada= "la cancion esta en reproduccion";
		
		when(estadoSeleccionDeCancion.play(mp3,cancion1)).thenReturn("la cancion esta en reproduccion");
		
		assertEquals(RespuestaEsperada,mp3.play(cancion1));
		
	}
	@Test
	void testCuandoMp3RecibeElMensajePauseRetornaUnaRespuesta() {
		
		String RespuestaEsperada= "la cancion esta en pausa";
		
		mp3.play(cancion1);// esto esta de ejemplo de que para que funcione el metodo pause deberia habersele dado play anteriormente
		
		when(estadoSeleccionDeCancion.pause(mp3,null)).thenReturn("la cancion esta en pausa");// el caso donde no hay cancion activa deberia tirar error pero es responsabilidad del estado no del mp3
		
		assertEquals(RespuestaEsperada,mp3.pause());
		
	}
	@Test
	void testCuandoMp3RecibeElMensajeStopRetornaUnaRespuestaYPoneAEsaCancionEnReproduccion() {
		
		String RespuestaEsperada= "seleccione una cancion";
		
		mp3.play(cancion1);// esto esta de ejemplo de que para que funcione el metodo stop deberia habersele dado play anteriormente
		
		when(estadoSeleccionDeCancion.stop(mp3,null)).thenReturn("seleccione una cancion");// el caso donde no hay cancion activa deberia tirar error pero es responsabilidad del estado no del mp3,en el null deberia ir any(Song.class) pero no me funcionaba
		
		assertEquals(RespuestaEsperada,mp3.stop());
		
	}
}
