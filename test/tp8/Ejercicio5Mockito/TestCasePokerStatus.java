package tp8.Ejercicio5Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
	//Sut
	pokerStatus= new PokerStatus();
	
	//Doc
	carta1= mock(Carta.class);
	carta2= mock(Carta.class);
	carta3= mock(Carta.class);
	carta4= mock(Carta.class);
	carta5= mock(Carta.class);
	
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
		
		//carta5=new Carta("A","D") ; Setup junto con las cartas declaradas anteriormente
		// en estos test se usan Stub porque se necesitan inputs indirectos por parte de las cartas (Doc)
		
		/*carta1= new Carta("A","P");
		carta2= new Carta("A","T");
		carta3= new Carta("A","C");
		carta4= new Carta("7","D");*/
		
		//se usaron doubles stub
		when(carta1.getValorNumerico()).thenReturn(13);
		when(carta2.getValorNumerico()).thenReturn(13);
		when(carta3.getValorNumerico()).thenReturn(13);
		when(carta4.getValorNumerico()).thenReturn(7);
		when(carta5.getValorNumerico()).thenReturn(13);
		
		assertEquals("Poker",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	
	@Test
	void testPokerStatusAlVerificarUnaManoQuePoseeTrioRetornaTrio() {
		
		//carta5=new Carta("10","D") ; Setup junto con las cartas declaradas anteriormente
		
		when(carta1.getValorNumerico()).thenReturn(13);
		when(carta2.getValorNumerico()).thenReturn(13);
		when(carta3.getValorNumerico()).thenReturn(13);
		when(carta4.getValorNumerico()).thenReturn(7);
		when(carta5.getValorNumerico()).thenReturn(10);
		
		assertEquals("Trio",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	@Test
	void testPokerStatusAlVerificarUnaManoQuePoseeColorRetornaColor() {
		/*carta1= new Carta("A","D");
		carta2= new Carta("5","D");
		carta3=	new Carta("8","D");
		carta5= new Carta("10","D"); Setup junto con las cartas declaradas anteriormente*/
		
		when(carta1.getPalo()).thenReturn("D");
		when(carta2.getPalo()).thenReturn("D");
		when(carta3.getPalo()).thenReturn("D");
		when(carta4.getPalo()).thenReturn("D");
		when(carta5.getPalo()).thenReturn("D");
		
		assertEquals("Color",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	
	
	
	@Test
	void testPokerStatusVerificaSiHayAlgunaJugadaEnLaManoEnCasoDeQueNoRetornaSinJuego() {
		
		//carta3=new Carta("2","P");
		//carta5=new Carta("K","D"); Setup junto con las cartas declaradas anteriormente
		
		when(carta1.getValorNumerico()).thenReturn(13);
		when(carta2.getValorNumerico()).thenReturn(13);
		when(carta3.getValorNumerico()).thenReturn(2);
		when(carta4.getValorNumerico()).thenReturn(7);
		when(carta5.getValorNumerico()).thenReturn(12);
		
		when(carta1.getPalo()).thenReturn("T");
		when(carta2.getPalo()).thenReturn("D");
		when(carta3.getPalo()).thenReturn("P");
		when(carta4.getPalo()).thenReturn("C");
		when(carta5.getPalo()).thenReturn("D");
		
		assertEquals("Sin juego",pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5));//verify
	}
	
	
}
