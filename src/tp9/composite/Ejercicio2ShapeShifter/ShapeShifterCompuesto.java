package tp9.composite.Ejercicio2ShapeShifter;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;





public class ShapeShifterCompuesto implements IShapeShifter{
	
	
	List<IShapeShifter> componentesShifter;
	
	public ShapeShifterCompuesto(List<IShapeShifter> shifterSimples) {
		
		this.componentesShifter=shifterSimples;
	}

	public List<IShapeShifter> getComponentes() {
		
		return this.componentesShifter;
	}

	public ShapeShifterCompuesto compose(IShapeShifter SS) {
		this.componentesShifter.add(SS);
		
		return new ShapeShifterCompuesto(this.componentesShifter);
	}

	public Integer deepest() {
		
		return this.componentesShifter.stream()
                .mapToInt(figura -> figura.deepest() + 1)
                .max().orElseThrow(NoSuchElementException::new); // la excepcion va porque sino es un optional Int
	}

	public List<Integer> values() {
		
		List<Integer> valores = new ArrayList <Integer> ();
        this.componentesShifter.stream()
                    .forEach(figura -> valores.addAll(figura.values()));
        
        return valores;
	}

	public IShapeShifter flat() {
		
		List<IShapeShifter> shifterSimples= new ArrayList<IShapeShifter>();
		
		 this.values().stream().forEach(valor -> shifterSimples.add(new ShapeShifterSimple(valor))); 
		 
		return new ShapeShifterCompuesto(shifterSimples);
	}

	

}
