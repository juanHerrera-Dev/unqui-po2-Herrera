package tp6;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudDeCredito> solicitudesDeCredito;
	private SectorContable sectorContable;
	
	

	public Banco(SectorContable sectorContable) {
		
		this.sectorContable=sectorContable;
		this.clientes= new ArrayList<Cliente>();
		this.solicitudesDeCredito= new ArrayList<SolicitudDeCredito>();
	}

	public void agregarCliente(Cliente cliente) {
		
		this.clientes.add(cliente);
		
	}

	public ArrayList<Cliente> getClientes() {
		
		return this.clientes;
	}

	public void registrarUnaSolicitud(SolicitudDeCredito solicitud) {
		
		this.solicitudesDeCredito.add(solicitud);
		
	}

	public ArrayList<SolicitudDeCredito> getSolicitudes() {
		
		return this.solicitudesDeCredito;
	}

	public double totalADesembolsar() {
		
		return this.sectorContable.totalADesembolsar(this.solicitudesDeCredito);
	}

	

}
