package tp10.Ejercicio3Mp3;

public class EstadoDeSeleccionDeCancion implements EstadoMp3 {

	@Override
	public String play(Mp3 mp3, Song cancion) {
		
		cancion.play();
		mp3.setCancion(cancion);
		mp3.setEstado(new EstadoReproduccion());
		
		return "la cancion esta en reproduccion";
	}

	@Override
	public String pause(Mp3 mp3, Song cancion) {
		
		throw new RuntimeException("no hay ninguna cancion reproduciendose");
	}

	@Override
	public String stop(Mp3 mp3, Song cancion) {
		// TODO Auto-generated method stub
		return null;
	}

}
