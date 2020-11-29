package tp9.composite.Ejercicio1Cultivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestCaseParcelaMixta {
	
	ParcelaMixta parcelaMixta;
	Parcela trigo;
	Parcela soja;
	Parcela trigo2;
	Parcela soja2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		
		trigo=mock(Parcela.class);
		trigo2=mock(Parcela.class);
		soja=mock(Parcela.class);
		soja2=mock(Parcela.class);
		parcelaMixta= new ParcelaMixta(trigo,trigo2,soja,soja2);
	}
	
	@Test
	void testConstructorParcelaMixta() {
		
		assertEquals(4,parcelaMixta.getComponentes().size());
	}
	
	
	@Test
	void testParcelaMixtaGananciaAnual() {
		
		Double gananciaEsperada= 75.0+75.0+125.0+125.0; 
				
		when(trigo.gananciaAnual()).thenReturn(300.0);
		when(trigo2.gananciaAnual()).thenReturn(300.0);
		when(soja.gananciaAnual()).thenReturn(500.0);
		when(soja2.gananciaAnual()).thenReturn(500.0);
		
		assertEquals(gananciaEsperada,parcelaMixta.gananciaAnual());
	}

}
