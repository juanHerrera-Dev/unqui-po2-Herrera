package tp6;

import java.util.ArrayList;

public class BancoSectorContable implements SectorContable {

	@Override
	public double totalADesembolsar(ArrayList<SolicitudDeCredito> solicitudes) {
		
		double montoTotal=0.0;
		
		for(SolicitudDeCredito solicitud:solicitudes) {
			if(solicitud.esAceptado()) {
				montoTotal= montoTotal + solicitud.getMonto();
			}
		}
		
		return montoTotal;
	}

}
