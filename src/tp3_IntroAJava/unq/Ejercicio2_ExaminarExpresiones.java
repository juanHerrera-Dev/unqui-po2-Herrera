package tp3_IntroAJava.unq;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ejercicio2_ExaminarExpresiones {

	Integer integer ;
	int int1 ;
	String a = "abc"; 
	String s = a; 
	String t;

	@Test public void lengthS() {
		
		int tamañoEsperado= s.length();
		
		assertEquals(tamañoEsperado, 3);// devuelve tamaño 3 
	}
	
	
	 /**@Test public void lengthT() {
			
			int tamañoEsperado= t.length();
			
			assertEquals(tamañoEsperado, 0);// nullPointerException porque la variable t no esta inicializada.
		}
	  */
	@Test public void sumaDeStringYInt() {
		
		String stringEsperado = 1 + a; 
		
		assertEquals(stringEsperado, 1+ a);// 1+abc = "1abc" con el mas se concatena al int como un string
		
	}
	 
	@Test public void stringAMayuscula() {
			
			String stringEsperado = a.toUpperCase(); 
			
			assertEquals(stringEsperado,a.toUpperCase()); // devuelve el string en mayusculas
			
		  }
	@Test public void indiceDeString(){
		
		int indiceEsperado = "Libertad".indexOf("r"); 
		
		assertEquals(indiceEsperado,4);// devuelve el indice 4
	} 
	
	@Test public void ultimoIndiceDeElementeDeString(){
		
		int indiceEsperado = "Universidad".lastIndexOf('i');  
		
		assertEquals(indiceEsperado,7);// devuelve el indice 7
	} 
	 
	 
	 @Test public void subString(){
			
			String stringEsperado = "Quilmes".substring(2,4);   
			
			assertEquals(stringEsperado,"il");// devuelve el string "il"
		}
	 
	 
	 /**@Test public void comienzaConA(){
			
			  
			
			assertTrue((a.length() + a).startsWith("a"));// devuelve false ya que el string comienza con el tamaño de a
		}
	 */
	
	 @Test public void stringIgualAString(){
			
		  
			
			assertTrue(s == a);// devuelve true porque la variable s esta iniciada con la variable a por lo tanto son el mismo objeto
		}
	 @Test public void stringIgualAOtroString(){
			
		  
			
			assertTrue(a.substring(1,3).equals("bc"));// devuelve true porque la variable s esta iniciada con la variable a por lo tanto son el mismo objeto
		}
	 
	 
}

