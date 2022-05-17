package shapeShifter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CompositeShifter extends ComponentShifter{

	ArrayList<IShapeShifter> components;
	
	public CompositeShifter() {
		components = new ArrayList<IShapeShifter>();
	}

	public CompositeShifter add(IShapeShifter i) {
		components.add(i);
		return this;
	}
	
	@Override
	public int deepest() {
		Optional<Integer> o = components.stream()
				.map(c -> c.deepest())
				.max(Integer::compare);
		return o.isPresent() ? o.get()+1 : 1;
	}

	@Override
	public IShapeShifter flat() {
		CompositeShifter c = new CompositeShifter();
		List<Integer> v = this.values();
		for(Integer i:v) {
			LeafShifter l = new LeafShifter(i);
			c.add(l);
		}
		return c;
	}

	@Override
	public List<Integer> values() {
		return components.stream()
				.map(c -> c.values())
				.flatMap(List::stream)
				.toList();
	}

}
