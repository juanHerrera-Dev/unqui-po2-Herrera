package tp8.Ejercicio3PokerContinuacion;

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
	 * 4 Casos posibles de test:
	 * tiene poker
	 * tiene color
	 * tiene trio
	 * no tiene nada
	 * */
	
	
	@Test
	void testPokerStatusAlVerificarUnaManoQuePoseePokerRetornaPoker() {
		
		carta5= "AD";//Setup junto con las cartas declaradas anteriormente
		
		assertEquals("Poker",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	
	@Test
	void testPokerStatusAlVerificarUnaManoQuePoseeTrioRetornaTrio() {
		
		carta5= "10D";//Setup junto con las cartas declaradas anteriormente
		
		assertEquals("Trio",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	@Test
	void testPokerStatusAlVerificarUnaManoQuePoseeColorRetornaColor() {
		carta1= "AD";
		carta2= "5D";
		carta3=	"8D";
		carta5= "10D";//Setup junto con las cartas declaradas anteriormente
		
		assertEquals("Color",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	
	
	
	@Test
	void testPokerStatusVerificaSiHayAlgunaJugadaEnLaManoEnCasoDeQueNoRetornaSinJuego() {
		
		carta3="2P";
		carta5= "KD";//Setup junto con las cartas declaradas anteriormente
		
		assertEquals("Sin juego",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	
	/*@Test 
	void prueba() {
		carta5= "KP";
		System.out.println(carta5.substring(carta5.length()-1,carta5.length()));
		assertTrue(carta1.substring(1,2).equals(carta5.substring(1,2)));
	}*/
}
