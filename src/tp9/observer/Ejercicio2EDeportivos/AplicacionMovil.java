package tp9.observer.Ejercicio2EDeportivos;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil implements IObserver {

	private List<Partido> partidosObtenidos;
	
	public AplicacionMovil() {
		this.partidosObtenidos = new ArrayList<Partido>();
	}
	
	@Override
	public void update(Partido partido) {
		this.getPartidos().add(partido);
	}

	public List<Partido> getPartidos(){
		return this.partidosObtenidos;
	}
	
}
