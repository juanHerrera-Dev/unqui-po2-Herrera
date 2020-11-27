package tp10.Ejercicio2Juego;

public class EstadoSinCredito implements EstadoJuego {

	@Override
	public String inicio(MaquinaDeJuegos maquinaDeJuegos) {
		
		return "Please insert coin";
	}

	@Override
	public String ingresoFicha(MaquinaDeJuegos maquinaDeJuegos) {
		
		maquinaDeJuegos.setEstadoJuego(new EstadoUnJugador());
		return "Ready Player 1";
	}

}
