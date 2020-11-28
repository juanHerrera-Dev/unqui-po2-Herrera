package tp10.Ejercicio3Mp3;

public interface EstadoMp3 {

	String play(Mp3 mp3, Song cancion);

	String pause(Mp3 mp3, Song cancion);
	
	String stop(Mp3 mp3, Song cancion);

}
