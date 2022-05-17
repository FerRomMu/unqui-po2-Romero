package shapeShifter;

import java.util.List;

public abstract class ComponentShifter implements IShapeShifter {

	@Override
	public IShapeShifter compose(IShapeShifter i) {
		CompositeShifter c = new CompositeShifter();
		c.add(this).add(i);
		return c;
	}

	@Override
	public abstract int deepest();

	@Override
	public abstract IShapeShifter flat();

	@Override
	public abstract List<Integer> values();

}
