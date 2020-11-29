package tp9.composite.Ejercicio2ShapeShifter;


import java.util.List;

public interface IShapeShifter {

	public Integer deepest();

	public List<Integer> values();

	public IShapeShifter compose(IShapeShifter ss); 
	
	public IShapeShifter flat(); 
	

}
