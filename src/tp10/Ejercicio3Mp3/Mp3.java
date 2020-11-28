package tp10.Ejercicio3Mp3;

public class Mp3 {

	EstadoMp3 estadoMp3;
	private Song cancionEnReproduccion;
	
	public Mp3(EstadoMp3 estadoMp3) {
		
		this.estadoMp3=estadoMp3;
	}

	public EstadoMp3 getEstado() {
		
		return this.estadoMp3;
	}

	public void setEstado(EstadoMp3 estadoMp3) {
		
		this.estadoMp3=estadoMp3;
		
	}

	public String play(Song cancion1) {
		
		
		
		return this.estadoMp3.play(this,cancion1);
	}

	public Song getCancionEnReproduccion() {
		
		return this.cancionEnReproduccion;
	}

	public void setCancion(Song cancion) {
		
		this.cancionEnReproduccion= cancion;
		
	}

	public String pause() {
		
		return  this.estadoMp3.pause(this,this.cancionEnReproduccion);
	}

	public String stop() {
		
		return this.estadoMp3.stop(this,this.cancionEnReproduccion);
	}

}
