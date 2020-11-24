package tp7.ejercicio8;

import org.joda.time.DateTime;


public class AdaptadorDeDateTime implements IFecha {

	private DateTime fecha;
	
	public AdaptadorDeDateTime(DateTime fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public void restarDias(int cantidadDeDias) {
		this.fecha=this.fecha.minusDays(cantidadDeDias);
	}

	@Override
	public boolean antesDeAhora() { 
		return this.fecha.isBeforeNow();
	}

	@Override
	public boolean antesDe(IFecha fecha) {
		AdaptadorDeDateTime fechaX=(AdaptadorDeDateTime) fecha;//este casteo lo hice para no tener que definir un nuevo metodo en la interface IFecha
		return this.fecha.isBefore(fechaX.toDateTime()); 
	}

	@Override
	public boolean despuesDeAhora() {
		return this.fecha.isAfterNow();
	}

	@Override
	public boolean despuesDeFecha(IFecha fecha) {
		AdaptadorDeDateTime fechaX=(AdaptadorDeDateTime) fecha;//este casteo lo hice para no tener que definir un nuevo metodo en la interface IFecha
		return this.fecha.isAfter(fechaX.toDateTime());
	}

	@Override
	public int dia() {
		return this.fecha.getDayOfMonth();
	}

	@Override
	public int mes() {
		return this.fecha.getMonthOfYear();
	}

	@Override
	public int anio() {
		return this.fecha.getYear();
	}
	private DateTime toDateTime() {
		
		return this.fecha;
	}
}
