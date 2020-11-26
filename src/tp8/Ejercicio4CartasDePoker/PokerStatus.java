package tp8.Ejercicio4CartasDePoker;

import java.util.ArrayList;






public class PokerStatus {
	
	
	
	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
	
	  if(esPoker(carta1,carta2,carta3,carta4,carta5)) {
		  return "Poker";
	  }
	  else if(esTrio(carta1,carta2,carta3,carta4,carta5)){
		  
		  return "Trio";
	  }
	  else if(esColor(carta1,carta2,carta3,carta4,carta5)) {
		  return "Color";
	  }
	  else {
		  return "Sin juego";
	  }
	 
	}
	
	
	private boolean esColor(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		ArrayList<Carta> mano = this.crearMano(carta1, carta2, carta3, carta4, carta5);
		
		// busca si hay color en la mano
		return mano.stream().anyMatch(carta -> this.hayColor(carta, mano));
	}


	private boolean esTrio(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		ArrayList<Carta> mano = this.crearMano(carta1, carta2, carta3, carta4, carta5);
		
		// busca si hay trio de alguna carta de la mano
		return mano.stream().anyMatch(carta -> this.hayTrioDe(carta, mano));
		
	}


	public Boolean esPoker(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		ArrayList<Carta> mano = this.crearMano(carta1, carta2, carta3, carta4, carta5);
		// busca si hay poker de alguna carta de la mano
		return mano.stream().anyMatch(carta -> this.hayPokerDe(carta, mano));
	}
		
	
	private Boolean hayPokerDe(Carta unaCarta, ArrayList<Carta> mano) {
		// chequea si la el valor de la carta buscada se repite 4 veces
		return mano.stream().filter(carta -> carta.getValor().equals(unaCarta.getValor())).count() == 4;
	}

	private boolean hayTrioDe(Carta unaCarta, ArrayList<Carta> mano) {
		
		// chequea si la el valor de la carta buscada se repite 3 veces
		return mano.stream().filter(carta -> carta.getValor().equals(unaCarta.getValor())).count() == 3;
		
		
	}
	
	private Boolean hayColor(Carta unaCarta, ArrayList<Carta> mano) {
		return mano.stream()
				.filter(carta -> carta.getPalo().equals(unaCarta.getPalo()))
				.count() == 5;
	}
	
	private ArrayList<Carta> crearMano(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		/**
		 * crea una lista de los valores de las cartas
		 * */
		ArrayList<Carta> mano= new ArrayList<Carta>();
		
		mano.add(carta1);
		mano.add(carta2);
		mano.add(carta3);
		mano.add(carta4);
		mano.add(carta5);
		
		
		
		return mano;
	}
	


}
