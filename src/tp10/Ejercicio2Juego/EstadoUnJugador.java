package tp10.Ejercicio2Juego;

public class EstadoUnJugador implements EstadoJuego {

	@Override
	public String inicio(MaquinaDeJuegos maquinaDeJuegos) {
		//cuando se inicia vuelve al estado Sin credito ,pero el juego se sigue desarrollando hasta el gameOver
		maquinaDeJuegos.setEstadoJuego(new EstadoSinCredito());
		return "single player campaign starts";
	}

	@Override
	public String ingresoFicha(MaquinaDeJuegos maquinaDeJuegos) {
		
		maquinaDeJuegos.setEstadoJuego(new EstadoDosJugadores());
		return "All Players ready";
	}

}
