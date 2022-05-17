package shapeShifter;

import java.util.ArrayList;
import java.util.List;

public class LeafShifter extends ComponentShifter{

	int value;
	
	public LeafShifter(int a) {
		value = a;
	}
	
	@Override
	public IShapeShifter compose(IShapeShifter i) {
		return null;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(value);
		return a;
	}

}
