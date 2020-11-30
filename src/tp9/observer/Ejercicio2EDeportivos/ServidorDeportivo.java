package tp9.observer.Ejercicio2EDeportivos;


import java.util.HashSet;
import java.util.Set;

public class ServidorDeportivo implements IObserver{

	private Set<Partido> partidosRecibidos;
	
	public ServidorDeportivo(){
		this.partidosRecibidos = new HashSet<Partido>();
	}
	
	@Override
	public void update(Partido partido) {
		agregarPartido(partido);
	}

	private void agregarPartido(Partido partido) {
		partidosRecibidos.add(partido);
	}

	public Set<Partido> getPartidosRecibidos() {
		return this.partidosRecibidos;
	}
}
