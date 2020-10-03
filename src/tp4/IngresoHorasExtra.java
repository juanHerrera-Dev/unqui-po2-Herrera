package tp4;

import java.time.Month;

public class IngresoHorasExtra extends Ingreso {

	private int horasExtra;

	public IngresoHorasExtra(Month mes, double montoPercibido, String concepto, int horasExtra) {
		super(mes,montoPercibido,concepto);
		this.horasExtra= horasExtra;
	}

	public int getHorasExtra() {
		
		return this.horasExtra;
	}
	@Override public double montoImponible() {
		
		return 0.0;
	}
	
	
	
}
