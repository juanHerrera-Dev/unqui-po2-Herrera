package tp3_IntroAJava.unq;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Persona {

	private LocalDate fechaDeNacimiento;
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre= nombre;
	}
	
	public Persona(String nombre,LocalDate fechaNacimiento) {
		
		this.nombre= nombre;
		this.fechaDeNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		
		return this.nombre;
	}

	public LocalDate getFechaNacimiento() {
		
		return this.fechaDeNacimiento;
	}

	public Integer edad() {
		
		return (int) ChronoUnit.YEARS.between(this.fechaDeNacimiento, LocalDate.now());
		//return  (LocalDate.now().getYear() - this.fechaDeNacimiento.getYear());
	}

	public Boolean menorQue(Persona otraPersona) {
		
		return this.edad()<otraPersona.edad();
	}
}
