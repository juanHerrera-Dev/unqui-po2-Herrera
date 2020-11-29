package tp9.composite.Ejercicio1Cultivos;

import java.util.ArrayList;
//Composite
public class ParcelaMixta implements Parcela {
	
	
	ArrayList<Parcela> parcelas;
	
	
	public ParcelaMixta(Parcela parcela1,Parcela parcela2 ,Parcela parcela3,Parcela parcela4) {
		this.parcelas= new ArrayList<Parcela>();
		this.parcelas.add(parcela1);
		this.parcelas.add(parcela2);
		this.parcelas.add(parcela3);
		this.parcelas.add(parcela4);
	}
	//no hice el metodo agregarParcela() porque no lo vi necesario en el dominio lo mismo que el remove() y el getChild()
	//pero en caso necesario si deberia implementarlo
	@Override
	public Double gananciaAnual() {
		
		return this.parcelas.stream().mapToDouble(parcelaX -> parcelaX.gananciaAnual()/4).sum();
		
	}

	public ArrayList<Parcela> getComponentes() {
		
		return this.parcelas;
	}

}
