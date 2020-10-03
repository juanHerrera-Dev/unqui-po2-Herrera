package tp4;

import java.util.ArrayList;

public class Trabajador {
	
	
	private ArrayList<Ingreso> ingresos;
	
	public Trabajador() {
		this.ingresos= new ArrayList<Ingreso>();
	}

	public int cantidadDeIngresos() {
		
		return this.ingresos.size();
	}

	public double getTotalPercibido() {
		
		double totalPercibido=0;
		
		if(this.ingresos.isEmpty()){
			
			return totalPercibido;
			
		}
			
		else {	
				for(Ingreso ingreso: this.ingresos) {
			
				totalPercibido= totalPercibido + ingreso.getMontoPercibido();
				
				}
				return totalPercibido;	
		}
	}

	public void agregarIngreso(Ingreso ingreso) {
		
		this.ingresos.add(ingreso);
		
	}

	public double getMontoImponible() {
		
double totalPercibido=0;
		
		if(this.ingresos.isEmpty()){
			
			return totalPercibido;
			
		}
			
		else {	
				for(Ingreso ingreso: this.ingresos) {
			
				totalPercibido= totalPercibido + ingreso.montoImponible();
				
				}
				return totalPercibido;	
		}
	}

	public double getImpuestoAPagar() {
		
		return (this.getMontoImponible()*2.0)/100;
	}
}
