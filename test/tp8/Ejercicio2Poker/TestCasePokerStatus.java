package tp8.Ejercicio2Poker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestCasePokerStatus {
	
	PokerStatus pokerStatus;
	String carta1;
	String carta2;
	String carta3;
	String carta4;
	String carta5;
	
	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
		
		carta1= "AP";
		carta2= "AT";
		carta3= "AC";
		carta4= "7D";
		
	}
	
	/**
	 * 2 Casos posibles de test, 1 cuando tiene poker y otro cuando no.
	 * 
	 * 
	 * */
	
	
	@Test
	void testPoquerStatusPuedeVerificarSiHayPokerOno() {
		
		carta5= "AD";//Setup junto con las cartas declaradas anteriormente
		
		assertTrue(pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	@Test
	void testPoquerStatusVerificaSiHayPoquerEnCasoDeQueNoRetornaFalse() {
		
		carta5= "KD";//Setup junto con las cartas declaradas anteriormente
		
		assertFalse(pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}

}
