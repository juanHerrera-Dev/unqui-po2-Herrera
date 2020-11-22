package tp6;

public class Propiedad {

	private String descripcion;
	private String direccion;
	private double valorFiscal;

	public Propiedad(String descripcion, double valorFiscal, String direccion) {
		this.descripcion=descripcion;
		this.valorFiscal=valorFiscal;
		this.direccion=direccion;
	}

	public double getValorFiscal() {
		
		return this.valorFiscal;
	}

}
