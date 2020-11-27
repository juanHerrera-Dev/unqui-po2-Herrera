package tp10;

public class EncriptadorNaive {
	
	ModoEncriptacion modoEncriptacion;
	
	public EncriptadorNaive(ModoEncriptacion modoEncriptacion) {
		
		this.modoEncriptacion=modoEncriptacion;
	}

	public ModoEncriptacion getModoEncriptacion() {
		
		return this.modoEncriptacion;
	}

	public void setModoEncriptacion(ModoEncriptacion modoNumerico) {
		
		this.modoEncriptacion=modoNumerico;
		
	}

	public String  encriptar(String textoAEncriptar) {
		// TODO Auto-generated method stub
		return this.modoEncriptacion.encriptar(textoAEncriptar);
	}

	public String desencriptar(String textoEncriptado) {
		
		return this.modoEncriptacion.desencriptar(textoEncriptado);
	}

}
