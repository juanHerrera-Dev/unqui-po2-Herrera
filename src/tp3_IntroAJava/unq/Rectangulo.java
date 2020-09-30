package tp3_IntroAJava.unq;

 

public class Rectangulo {

	private Punto esquinaSuperiorIzquierda;
	private int ancho;
	private int alto;
	
	public Rectangulo(Punto punto, int altura, int ancho) {
	
	this.esquinaSuperiorIzquierda = punto;
	this.alto= altura;
	this.ancho= ancho;
	}

	public Integer getAlto() {
		
		return this.alto;
	}

	public Integer getAncho() {
		
		return this.ancho;
	}

	public Object getEsquinaSuperiorIzquierda() {
		
		return this.esquinaSuperiorIzquierda;
	}

	public Integer area() {
		
		return (this.alto*this.ancho);
	}

	public Integer perimetro() {
		
		return (this.alto*2)+(this.ancho*2);
	}

	public Boolean esHorizontal() {
		
		return (this.ancho>this.alto );
	}

	

}
