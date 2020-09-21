package tp3_IntroAJava.unq;




import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CounterTestCase {
	
	private Counter counter;
	/**
	 * Crea un escenario de test basico , que consiste en un contador
	 * con 10 enteros
	 * 
	 * @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
		
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	/**
	 * Verifica la cantidad de pares
	 * 
	 */
	@Test public void testEvenNumbers() {
		
		
		
		int amount = counter.getEvenOcurrences();
		
		assertEquals(amount,1);
	} 
	 
	@Test public void testNumerosImpares() {
		
		int cantidadEsperada = counter.getCantidadDeImpares();
		
		
		assertEquals(cantidadEsperada,9);
	}
	
	@Test public void testNumeroMultiplosDeN() {
		
		int cantidadEsperada = counter.getCantidadMultiplosDeN(3);
		
		assertEquals(cantidadEsperada,2);
	}
}




	 
	 
 
