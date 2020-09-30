package tp3_IntroAJava.unq;

public class Punto {

	//variables locales
	private int x;
	private int y;
	
	//constructores
	public  Punto(int x,int y) {
		
		this();
		
		this.x= x;
		this.y= y;
		
	}


	public Punto() {
		super();
		this.x=0;
		this.y=0;
	}
	//getters

	public Integer getX() {
		
		return this.x;
	}


	public Integer getY() {
	
		return this.y;
	}

	//setters
	

	private void setX(int x) {
		
		this.x= x;
	}
	
	private void setY(int y) {
		
		this.y= y;
	}
	
	public void moverA(int x, int y) {
		
		this.setX(x);
		this.setY(y);
		
	}


	public void sumar(Punto puntoASumar) {
		
		this.setX(this.getX()+puntoASumar.getX());
		this.setY(this.getY()+puntoASumar.getY());
	}


}
