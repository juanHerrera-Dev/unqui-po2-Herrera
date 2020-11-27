package tp10.Ejercicio2Juego;

public class EstadoDosJugadores implements EstadoJuego {

	@Override
	public String inicio(MaquinaDeJuegos maquinaDeJuegos) {
		
		maquinaDeJuegos.setEstadoJuego(new EstadoSinCredito());
		return "multiplayer player campaign starts";
	}

	@Override
	public String ingresoFicha(MaquinaDeJuegos maquinaDeJuegos) {
		
		return "All players are ready, invalid insert of coin";
	}

}
