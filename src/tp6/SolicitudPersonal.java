package tp6;

public class SolicitudPersonal extends SolicitudDeCredito {

	public SolicitudPersonal(Cliente cliente, double monto, int plazo) {
		
		super(cliente,monto,plazo);
	}
	@Override public boolean esAceptado() {
		
		return esSueldoAnualMayorA15000() && esCuotaMensualMenorAl70PorcientoDelSueldoMensual() ;
	}
	private boolean esCuotaMensualMenorAl70PorcientoDelSueldoMensual() {
		return this.montoAbonoMensual() <= 0.7*this.getCliente().getSueldoNeto();
	}
	
	private boolean esSueldoAnualMayorA15000() {
		return this.getCliente().getSueldoNetoAnual()>=15000.0;
	}
}
