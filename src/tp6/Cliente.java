package tp6;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNeto;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNeto) {
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.edad=edad;
		this.sueldoNeto=sueldoNeto;
		
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
	public String getApellido() {
		// TODO Auto-generated method stub
		return this.apellido;
	}
	public int getEdad() {
		// TODO Auto-generated method stub
		return this.edad;
	}
	public String getDireccion() {
		// TODO Auto-generated method stub
		return this.direccion;
	}
	public double getSueldoNeto() {
		// TODO Auto-generated method stub
		return this.sueldoNeto;
	}

	public double getSueldoNetoAnual() {
		// TODO Auto-generated method stub
		return (this.sueldoNeto*12);
	}
}
