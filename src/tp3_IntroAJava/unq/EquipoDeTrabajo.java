package tp3_IntroAJava.unq;

import java.util.ArrayList;

public class EquipoDeTrabajo {

	 
	private String nombreEquipo;
	private ArrayList<Persona> empleados;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombreEquipo= nombre;
		this.empleados= new ArrayList<Persona>();
	}

	public void contratar(Persona empleado) {
		
		this.empleados.add(empleado);
	}
	public String getNombre() {
		return this.nombreEquipo;
	}

	public int cantidadDeEmpleados() {
		
		
		return this.empleados.size();
	}

	public double promedioDeEdad() {
	
	double promedio= 0;	
	
	if(empleados.isEmpty())
		
		{return promedio;}
		
		else{
			for (Persona empleado:this.empleados){
				promedio=promedio + empleado.edad();
				}
		return promedio/empleados.size();
		}
		
	}
}