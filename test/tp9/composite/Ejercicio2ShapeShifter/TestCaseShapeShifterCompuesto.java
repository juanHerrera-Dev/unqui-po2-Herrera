package tp9.composite.Ejercicio2ShapeShifter;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestCaseShapeShifterCompuesto {

	IShapeShifter SSsimple;
	ShapeShifterCompuesto SScompuesto; 
	IShapeShifter SScompuestoMock;
	@BeforeEach
	void setUp() throws Exception {
		
		SScompuestoMock = mock(ShapeShifterCompuesto.class);
		SSsimple =mock(ShapeShifterSimple.class);
		
		ArrayList<IShapeShifter> listaSS= new ArrayList<IShapeShifter>();
		
		listaSS.add(SSsimple);
		listaSS.add(SScompuestoMock);
		SScompuesto= new ShapeShifterCompuesto(listaSS);
	}

	@Test
	void testConstructorShifterCompuesto() {
		
		assertEquals(2,SScompuesto.getComponentes().size());
		
	}
	
	@Test
	void testShifterCompuestoMetodoCompose() {
		
		ShapeShifterCompuesto ssc= SScompuesto.compose(SSsimple);
		
		assertEquals(3,ssc.getComponentes().size());
		
	}
	
	@Test
	void testShifterCompuestoMetodoDeepestRetornaLaProfundidad() {
		//SScompuestoMock se hace de cuenta que es un compuesto con solo shifter simples
		
		when(SScompuestoMock.deepest()).thenReturn(1);
		assertEquals(2,SScompuesto.deepest());
	}
	
	/*@Test
	void testShifterCompuestoMetodoFlatSeDevueleUnShifterCompuestoConSusRespectivosShifterSimples() {
		
		
		
		assertEquals(SScompuesto,SScompuesto.flat().values());
	}*/ //esta comentado porque no sabia como testear que lo que retornaba el metodo flat era valido
	
	//public List<Integer> values()
	
	@Test
	void testShifterCompuestoMetodoValuesDevuelveUnArrayListConLosValoresDeSusShiftersSimples() {
		
		List<Integer> listaMocksSimple= new ArrayList<Integer>();
		listaMocksSimple.add(1);
		when(SSsimple.values()).thenReturn(listaMocksSimple);
		
		List<Integer> listaMockCompuesto= new ArrayList<Integer>();
		listaMockCompuesto.add(2);
		listaMockCompuesto.add(3);
		
		when(SScompuestoMock.values()).thenReturn(listaMockCompuesto);
		
		
		List<Integer> listaEsperada= new ArrayList<Integer>();
		listaEsperada.addAll(SSsimple.values());
		listaEsperada.addAll(SScompuestoMock.values());
		
		assertEquals(listaEsperada,SScompuesto.values());
	}
	
}
