package tp6;

public class SolicitudHipotecaria extends SolicitudDeCredito {
	
	Propiedad propiedad;
	
	
	public SolicitudHipotecaria(Cliente cliente, double monto, int plazo, Propiedad propiedad) {
		
		super(cliente,monto,plazo);
		this.propiedad=propiedad;
	}

	@Override
	public boolean esAceptado() {
		
		return (this.montoAbonoMensual() <= 0.5*this.getCliente().getSueldoNeto())
				&& 
			   (this.getMonto()<= 0.7*this.propiedad.getValorFiscal())
			    &&
			   (this.getCliente().getEdad() + (this.getPlazo()/12)<= 65);
	}
	/*
	 * Para ser aceptadas, las solicitudes de créditos hipotecarios requieren que el monto de la cuota no supere el 50% de los ingresos 
	 * mensuales del titular, que el monto total solicitado no sea mayor al 70% del valor fiscal de la garantía, 
	 * y que la persona no supere los 65 años de edad antes de terminar de pagar el crédito. 
	 * */
	public Propiedad getPropiedad() {
		// TODO Auto-generated method stub
		return this.propiedad;
	}

}
