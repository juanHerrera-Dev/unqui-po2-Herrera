package tp4;

import java.time.Month;

public class Ingreso {
	
	private Month mesDePercepcion;
	private double montoPercibido;
	private String concepto;
	
	
	public Ingreso(Month mesDePercepcion, double montoPercibido, String concepto) {
		
		this.mesDePercepcion=mesDePercepcion;
		this.montoPercibido=montoPercibido;
		this.concepto=concepto;
	}


	public Object getMesPercepcion() {
		
		return this.mesDePercepcion;
	}


	public double getMontoPercibido() {
		
		return this.montoPercibido;
	}


	public String getConcepto() {
		
		return this.concepto;
	}


	public double montoImponible() {
		
		return this.montoPercibido;
	}
	
}
