package tp3_IntroAJava.unq;

import java.util.ArrayList;

public class MultiOperador {

	public Integer sumarElementos(ArrayList<Integer> listaDeEnteros) {
		
		int sumaDeElementos = 0;
		
		for(int numero: listaDeEnteros) {
			
			sumaDeElementos = sumaDeElementos + numero;
		}
		
		return sumaDeElementos;
	}

	public Integer restarElementos(ArrayList<Integer> listaDeEnteros) {

		
		int restaDeElementos = 0;

		for(int numero: listaDeEnteros) {
			
			 restaDeElementos = restaDeElementos - numero;
		}
		
		return restaDeElementos;
	}

	public Integer multiplicarElementos(ArrayList<Integer> listaDeEnteros) {
		
		int multiplicacionDeElementos = 1;
		
		for(int numero: listaDeEnteros) {
			
			multiplicacionDeElementos = multiplicacionDeElementos * numero;
		}
		
		return multiplicacionDeElementos;
	}

}
