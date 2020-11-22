package tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseSolicitudDeCredito {
	
	//SolicitudDeCredito solicitudGenerica ;
	SolicitudPersonal solicitudPersonal;
	SolicitudHipotecaria solicitudHipotecaria;
	Cliente clienteX;
	Propiedad propiedadY;
	@BeforeEach
	void setUp() throws Exception {
		clienteX = new Cliente("Juan Ignacio","Herrera","siempre viva 123",24,150000.0);
		propiedadY = new Propiedad("Chalet",10000000.0,"La sierra 34");
		//solicitudGenerica = new SolicitudDeCredito(clienteX,1000000.0,12);
		solicitudPersonal = new SolicitudPersonal(clienteX,1000000.0,12);
		solicitudHipotecaria = new SolicitudHipotecaria(clienteX,1000000.0,18,propiedadY);
	}

	/**@Test
	void testConstructorSolicitudDeCreditoGenerica() {
		
		
		assertEquals(solicitudGenerica.getCliente(),clienteX);
		assertEquals(solicitudGenerica.getMonto(),1000000.0);
		assertEquals(solicitudGenerica.getPlazo(),12);
		
	}
	*/
	/**@Test
	void testMontoDeAbonoMensualDeSolicitudDeCredito() {
		
		
		assertEquals(solicitudGenerica.montoAbonoMensual(),1000000.0/12);
		
	}
	*/
	@Test
	void testConstructorSolicitudDeCreditoPersonal() {
		
		
		assertEquals(solicitudPersonal.getCliente(),clienteX);
		assertEquals(solicitudPersonal.getMonto(),1000000.0);
		assertEquals(solicitudPersonal.getPlazo(),12);
		
	}
	@Test
	void testConstructorSolicitudDeCreditoHipotecario() {
		
		
		assertEquals(solicitudHipotecaria.getCliente(),clienteX);
		assertEquals(solicitudHipotecaria.getMonto(),1000000.0);
		assertEquals(solicitudHipotecaria.getPlazo(),18);
		assertEquals(solicitudHipotecaria.getPropiedad(),propiedadY);
	}
	@Test
	void testSolicitudDeCreditoPersonalPuedeSaberSiEsAceptada() {
		
		
		assertEquals(solicitudPersonal.esAceptado(),true);
		
	}
	@Test
	void testSolicitudDeCreditoHipotecarioPuedeSaberSiEsAceptada() {
		
		
		assertEquals(true,solicitudHipotecaria.esAceptado());
		
	}
}
