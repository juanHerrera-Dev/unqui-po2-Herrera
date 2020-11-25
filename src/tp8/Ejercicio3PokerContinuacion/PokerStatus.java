package tp8.Ejercicio3PokerContinuacion;

import java.util.ArrayList;





public class PokerStatus {

	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
	
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
	
	
	private boolean esColor(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		ArrayList<String> mano = this.crearManoDePalos(carta1, carta2, carta3, carta4, carta5);
		
		// busca si hay color en la mano
		return mano.stream().anyMatch(carta -> this.hayColor(carta, mano));
	}


	private boolean esTrio(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		ArrayList<String> mano = this.crearManoDeValores(carta1, carta2, carta3, carta4, carta5);
		
		// busca si hay trio de alguna carta de la mano
		return mano.stream().anyMatch(carta -> this.hayTrioDe(carta, mano));
		
	}


	public Boolean esPoker(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		ArrayList<String> mano = this.crearManoDeValores(carta1, carta2, carta3, carta4, carta5);
		// busca si hay poker de alguna carta de la mano
		return mano.stream().anyMatch(carta -> this.hayPokerDe(carta, mano));
	}
		
	
	private Boolean hayPokerDe(String unValorCarta, ArrayList<String> manoValores) {
		// chequea si la el valor de la carta buscada se repite 4 veces
		return manoValores.stream().filter(valorCarta -> valorCarta.equals(unValorCarta)).count() == 4;
	}

	private boolean hayTrioDe(String unValorCarta, ArrayList<String> manoValores) {
		
		// chequea si la el valor de la carta buscada se repite 3 veces
		return manoValores.stream().filter(valorCarta -> valorCarta.equals(unValorCarta)).count() == 3;
		
		
	}
	
	private Boolean hayColor(String unPalo, ArrayList<String> palosDeCartas) {
		return palosDeCartas.stream()
				.filter(palo -> palo.equals(unPalo))
				.count() == 5;
	}
	
	private ArrayList<String> crearManoDeValores(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		/**
		 * crea una lista de los valores de las cartas
		 * */
		ArrayList<String> mano= new ArrayList<String>();
		
		mano.add(carta1.substring(0,carta1.length()-1));//carta1.length()-1 lo coloco porque sino con el numero 10 no funciona
		mano.add(carta2.substring(0,carta2.length()-1));
		mano.add(carta3.substring(0,carta3.length()-1));
		mano.add(carta4.substring(0,carta4.length()-1));
		mano.add(carta5.substring(0,carta5.length()-1));
		
		return mano;
	}
	
private ArrayList<String> crearManoDePalos(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		/**
		 * crea una lista de los palos de las cartas
		 * */
		ArrayList<String> mano= new ArrayList<String>();
		
		mano.add(carta1.substring(carta1.length()-1,carta1.length()));//carta1.length()-1  y carta1.length() lo coloco porque sino con el numero 10 no funciona
		mano.add(carta2.substring(carta2.length()-1,carta2.length()));
		mano.add(carta3.substring(carta3.length()-1,carta3.length()));
		mano.add(carta4.substring(carta4.length()-1,carta4.length()));
		mano.add(carta5.substring(carta5.length()-1,carta5.length()));
		
		return mano;
	}

}
