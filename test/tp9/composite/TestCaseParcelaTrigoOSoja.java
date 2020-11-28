package tp9.composite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseParcelaTrigoOSoja {
	
	Parcela trigo; 
	Parcela soja;
	
	@BeforeEach
	void setUp() throws Exception {
		trigo= new Trigo();
		soja= new Soja();
	}

	@Test
	void testGananciaAnualParcelaTrigo() {
		assertEquals(300.0,trigo.gananciaAnual());
	}
	@Test
	void testGananciaAnualParcelaSoja() {
		assertEquals(500.0,soja.gananciaAnual());
	}

}
