package tp10.Ejercicio3Mp3;

public class EstadoReproduccionEnPausa implements EstadoMp3 {

	@Override
	public String play(Mp3 mp3, Song cancion) {
		
		throw new RuntimeException("ya hay una cancion en reproduccion,use el boton pause o stop");
	}

	@Override
	public String pause(Mp3 mp3, Song cancion) {
		
		cancion.pause();
		
		mp3.setEstado(new EstadoReproduccion());
		
		return "la cancion se esta reproduciendo";
	}

	@Override
	public String stop(Mp3 mp3, Song cancion) {
		
		cancion.stop();
		
		mp3.setEstado(new EstadoDeSeleccionDeCancion());
		
		return "seleccione una cancion para reproducir";
	}

}
