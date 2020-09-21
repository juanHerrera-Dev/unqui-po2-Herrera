package tp3_IntroAJava.unq;

import java.util.ArrayList;


public class Counter {
	
	
	ArrayList<Integer> numerosEnteros;
	
	
	
	
	public Counter() {
		
	this.numerosEnteros = new ArrayList<Integer>();
	
	}
	
	
	
	public void addNumber(Integer i) {
		
	this.numerosEnteros.add(i);	
		
	}



	public Integer getEvenOcurrences() {
		
	Integer	contador = 0;
		
		for (Integer numero:this.numerosEnteros){
			
			if ((numero % 2)== 0  ) 
				{
				contador = contador + 1;
				}
		}
		return contador;
	}



	public int getCantidadDeImpares() {
		
		int cantDePares = 0;
		
			for(int numero:this.numerosEnteros){

				if ((numero % 2) != 0  ) {
					
					cantDePares = cantDePares + 1;
				}
			}
		return cantDePares;
	}



	public int getCantidadMultiplosDeN(int multiploBuscado) {
		
		
		int cantDeMultiplos = 0;
		
		for(int numero:this.numerosEnteros){

			if ((numero % multiploBuscado) == 0  ) {
				
				cantDeMultiplos = cantDeMultiplos + 1;
			}
		}
	return cantDeMultiplos;
		
	}

}
