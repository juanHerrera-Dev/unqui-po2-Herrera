package tp8.Ejercicio4CartasDePoker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestCasePokerStatus {
	
	PokerStatus pokerStatus;
	Carta carta1;
	Carta carta2;
	Carta carta3;
	Carta carta4;
	Carta carta5;
	
	@BeforeEach
	void setUp() throws Exception {
		pokerStatus = new PokerStatus();
		
		carta1= new Carta("A","P");
		carta2= new Carta("A","T");
		carta3= new Carta("A","C");
		carta4= new Carta("7","D");
		
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
		
		carta5=new Carta("A","D") ;//Setup junto con las cartas declaradas anteriormente
		
		assertEquals("Poker",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	
	@Test
	void testPokerStatusAlVerificarUnaManoQuePoseeTrioRetornaTrio() {
		
		carta5=new Carta("10","D") ;//Setup junto con las cartas declaradas anteriormente
		
		assertEquals("Trio",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	@Test
	void testPokerStatusAlVerificarUnaManoQuePoseeColorRetornaColor() {
		carta1= new Carta("A","D");
		carta2= new Carta("5","D");
		carta3=	new Carta("8","D");
		carta5= new Carta("10","D");//Setup junto con las cartas declaradas anteriormente
		
		assertEquals("Color",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	
	
	
	@Test
	void testPokerStatusVerificaSiHayAlgunaJugadaEnLaManoEnCasoDeQueNoRetornaSinJuego() {
		
		carta3=new Carta("2","P");
		carta5=new Carta("K","D");//Setup junto con las cartas declaradas anteriormente
		
		assertEquals("Sin juego",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	
	
}
