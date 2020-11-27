package tp10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModoEncriptacionNumerica implements ModoEncriptacion {

	@Override
	public String encriptar(String textoAEncriptar) {
		
		List <Integer> output = new ArrayList <Integer> ();
		
		for (Character letra : textoAEncriptar.toCharArray()) {
			if (letra.equals(' ')) {
				output.add(0);
			}else {
				int letraModificada = letra - 'a' + 1; 
				output.add(letraModificada);}
			}
		return output.stream()           
                     .map(String::valueOf)  
                     .collect(Collectors.joining(","));
	}

	@Override
	public String desencriptar(String texto) {
		
		List <Character> output = new ArrayList <Character> ();
		
		String [] listaString = texto.split(",");
		
		for (int i = 0; i < listaString.length; i++) {
			if (listaString[i].equals("0")) {
				output.add(' ');
			} else {
				Integer valorNumericoLetra = Integer.parseInt(listaString[i]);
				Character letraModificada =(char) (valorNumericoLetra + 'a' - 1); 
				output.add(letraModificada);
			}
		}
		
		return 	output.stream()
				      .map(String::valueOf)  
                      .collect(Collectors.joining());
	}

}
