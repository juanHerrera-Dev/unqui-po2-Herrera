package tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseBanco {
	
	Banco bancox;
	private Cliente clienteX;
	private SolicitudDeCredito solicitudPersonal;
	private SolicitudDeCredito solicitudHipotecaria;
	private Propiedad propiedadY;
	private SectorContable sectorContable;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		sectorContable = new BancoSectorContable();
		bancox= new Banco(sectorContable);
		
		clienteX = new Cliente("Juan Ignacio","Herrera","siempre viva 123",24,150000.0);
		
		solicitudPersonal = new SolicitudPersonal(clienteX,1000000.0,12);/**credito  aceptable*/
		propiedadY = new Propiedad("Chalet",10000000.0,"La sierra 34");
		solicitudHipotecaria = new SolicitudHipotecaria(clienteX,10000000.0,18,propiedadY);/**credito no aceptable*/
	}

	@Test
	void testUnBancoPuedeAgregarClientes() {
		
		bancox.agregarCliente(clienteX);
		
		assertEquals(1,bancox.getClientes().size());
	}

	@Test
	void testUnBancoPuedeRegistrarUnaSolicitudDeCredito() {
		
		bancox.registrarUnaSolicitud(solicitudPersonal);
		bancox.registrarUnaSolicitud(solicitudHipotecaria);
		
		assertEquals(2,bancox.getSolicitudes().size());
	}
	@Test
	void testUnBancoPuedeObtenerElMontoTotalADesembolsarASusClientesPorLosCreditosOtorgados() {
		
		bancox.registrarUnaSolicitud(solicitudPersonal);
		bancox.registrarUnaSolicitud(solicitudHipotecaria);
		
		assertEquals(1000000,bancox.totalADesembolsar());
	}
}
