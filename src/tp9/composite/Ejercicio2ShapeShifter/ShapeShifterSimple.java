package tp9.composite.Ejercicio2ShapeShifter;

import java.util.ArrayList;

public class ShapeShifterSimple implements IShapeShifter {
	
	Integer value;
	
	public ShapeShifterSimple(int i) {
		this.value=i;
	}

	public Integer getValue() {
		
		return this.value;
	}

	public  ShapeShifterCompuesto compose(IShapeShifter SS) {
		
		ArrayList<IShapeShifter> listaSS= new ArrayList<IShapeShifter>();
		listaSS.add(this);
		
		return new ShapeShifterCompuesto(listaSS);
	}

	public Integer deepest() {
		
		return 0;
	}

	public IShapeShifter flat() {
		
		
		
		return this;
	}

	public ArrayList<Integer> values() {
		
		ArrayList<Integer> listaConValue= new ArrayList<Integer>();
		listaConValue.add(this.getValue());
		
		return listaConValue;
	}

}
