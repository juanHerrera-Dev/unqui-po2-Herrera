package tp9.composite.Ejercicio2ShapeShifter;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseShapeShifterSimple {
	
	ShapeShifterSimple SSsimple;
	IShapeShifter SScompuesto; 
	@BeforeEach
	void setUp() throws Exception {
		
		SSsimple = new ShapeShifterSimple(1);
		SScompuesto= mock(ShapeShifterCompuesto.class);
	}

	@Test
	void testConstructorShifterSimple() {
		assertEquals(1,SSsimple.getValue());
	}
	@Test
	void testShifterSimpleMetodoCompose() {
		
		ShapeShifterCompuesto ssc= SSsimple.compose(SScompuesto);
		
		assertEquals(1,ssc.getComponentes().size());
	}
	@Test
	void testShifterSimpleMetodoDeepestSiempreEs0() {
		
		assertEquals(0,SSsimple.deepest());
	}
	@Test
	void testShifterSimpleMetodoFlatSeDevuelveAElMismo() {
		
		assertEquals(SSsimple,SSsimple.flat());
	}

	//public List<Integer> values()
	
	@Test
	void testShifterSimpleMetodoValuesDevuelveUnArrayListConSuValue() {
		
		ArrayList<Integer> listaEsperada= new ArrayList<Integer>();
		listaEsperada.add(SSsimple.getValue());
		
		assertEquals(listaEsperada,SSsimple.values());
	}
}
