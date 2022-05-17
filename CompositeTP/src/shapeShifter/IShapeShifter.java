package shapeShifter;

import java.util.List;

/*Component*/
public interface IShapeShifter {

	public IShapeShifter compose(IShapeShifter i);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();
}
