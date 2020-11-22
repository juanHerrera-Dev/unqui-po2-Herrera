package tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseCliente {
	
	Cliente clienteX;
	
	@BeforeEach
	void setUp() throws Exception {
		
		clienteX = new Cliente("Juan Ignacio","Herrera","siempre viva 123",24,150000.0);
	}

	@Test
	void testConstructorCliente() {
		
		assertEquals(clienteX.getNombre(),"Juan Ignacio");
		assertEquals(clienteX.getEdad(),24);
		assertEquals(clienteX.getDireccion(),"siempre viva 123");
		assertEquals(clienteX.getApellido(),"Herrera");
		assertEquals(clienteX.getSueldoNeto(),150000.0);
	}
	@Test
	void testClienteSueldoNetoAnual() {
		
		assertEquals(clienteX.getSueldoNetoAnual(),(150000.0 * 12));
		
	}
}
