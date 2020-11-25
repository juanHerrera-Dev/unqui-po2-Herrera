package tp8.Ejercicio2Poker;

import java.util.ArrayList;



public class PokerStatus {

	public Boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
	  
	  return esPoker(carta1,carta2,carta3,carta4,carta5);
	}
	
	
	public Boolean esPoker(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		ArrayList<String> mano = this.crearMano(carta1, carta2, carta3, carta4, carta5);
		// busca si hay poker de alguna carta de la mano
		return mano.stream().anyMatch(carta -> this.hayPokerDe(carta, mano));
	}
		
	
	public Boolean hayPokerDe(String unaCarta, ArrayList<String> mano) {
		// chequea si la el valor de la carta buscada se repite 4 veces
		return mano.stream().filter(carta -> carta.equals(unaCarta)).count() == 4;
	}


	private ArrayList<String> crearMano(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		/**
		 * crea una lista de los valores de las cartas
		 * */
		ArrayList<String> mano= new ArrayList<String>();
		
		mano.add(carta1.substring(0,1));
		mano.add(carta2.substring(0,1));
		mano.add(carta3.substring(0,1));
		mano.add(carta4.substring(0,1));
		mano.add(carta5.substring(0,1));
		
		return mano;
	}

}
