package tp10.Ejercicio2Juego;

public class MaquinaDeJuegos {
	
	EstadoJuego estadoJuego;
	
	public MaquinaDeJuegos(EstadoJuego estadoJuego) {
		
		this.estadoJuego=estadoJuego;
	}

	public EstadoJuego getEstado() {
		
		return this.estadoJuego;
	}

	public void setEstadoJuego(EstadoJuego estadoJuego) {
		
		this.estadoJuego=estadoJuego;
		
	}

	public String inicio() {
		
		return this.estadoJuego.inicio(this);
	}

	public String ingresoFicha() {
		
		return this.estadoJuego.ingresoFicha(this);
	}

}
