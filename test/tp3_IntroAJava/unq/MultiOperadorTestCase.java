package tp3_IntroAJava.unq;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiOperadorTestCase {

	ArrayList<Integer> listaDeEnteros;
	MultiOperador multiOperador;
	
	@BeforeEach
	void setUp() throws Exception {
		
		listaDeEnteros = new ArrayList<Integer>();
		
		listaDeEnteros.add(5);
		listaDeEnteros.add(5);
		listaDeEnteros.add(5);
		listaDeEnteros.add(5);
		
		multiOperador = new MultiOperador();
	}

	@Test
	void elMultiOperadorPuedeSumarTodosLosElementosDeUnArray() {
		
		
		
		assertEquals(multiOperador.sumarElementos(this.listaDeEnteros),20);
		
	}
	@Test
	void elMultiOperadorPuedeRestarTodosLosElementosDeUnArray() {
		
		
		
		assertEquals(multiOperador.restarElementos(this.listaDeEnteros),-20);
		
	}
	@Test
	void elMultiOperadorPuedeMultiplicarTodosLosElementosDeUnArray() {
		
		
		
		assertEquals(multiOperador.multiplicarElementos(this.listaDeEnteros),625);
		
	}
}
