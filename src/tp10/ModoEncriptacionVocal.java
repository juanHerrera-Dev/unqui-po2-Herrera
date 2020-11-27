package tp10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModoEncriptacionVocal implements ModoEncriptacion {

	@Override
	public String encriptar(String textoAEncriptar) {
		
		List <Character> output = new ArrayList <Character> ();
		
		for (Character letra : textoAEncriptar.toCharArray()) {
			switch (letra) {
	           case 'a': 
	        	   output.add('e') ;
	        	   break;   
	           case 'e':
	        	   output.add('i') ;
	        	   break;
	           case 'i':
	        	   output.add('o') ;
	        	   break;
	           case 'o':
	        	   output.add('u') ;
	        	   break;
	           case 'u':
	        	   output.add('a') ;
	        	   break;
	           default:
	        	   output.add(letra);
			}
		}
		return output.stream()           
                     .map(String::valueOf)  
                     .collect(Collectors.joining());
		
	}

	@Override
	public String desencriptar(String textoADesencriptar) 
	{
		List <Character> output = new ArrayList <Character> ();
		
		for (Character letra : textoADesencriptar.toCharArray()) {
			switch (letra) {
	           case 'a': 
	        	   output.add('u') ;
	        	   break;   
	           case 'e':
	        	   output.add('a') ;
	        	   break;
	           case 'i':
	        	   output.add('e') ;
	        	   break;
	           case 'o':
	        	   output.add('i') ;
	        	   break;
	           case 'u':
	        	   output.add('o') ;
	        	   break;
	           default:
	        	   output.add(letra);
			}
		}
		return output.stream()           
                     .map(String::valueOf)  
                     .collect(Collectors.joining());
	}
}
