package tp9.observer.Ejercicio3PyR;

import java.util.Set;

public interface IJugador {

	void inicioPartida(Set<String> preguntas, ReceptorDeRespuestas juego);
	void preguntaRespondida(String pregunta, String nombreJugador);
	void finDePartida(String nombreJugadorGanador);
	void respuestaCorrecta();
	void respuestaIncorrecta();
	String nombreDeJugador();
	
}
