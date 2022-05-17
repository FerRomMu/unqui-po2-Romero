package fileSystem;


public class Archivo implements FyleSystem {

	String name;
	int size;
	
	public Archivo(String n, int s) {
		s = size;
		this.setName(n);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	@Override
	public int totalSize() {
		return size;
	}

	@Override
	public void printStructure() {
		System.out.println(name);
	}

	@Override
	public FyleSystem lastModified() {
		return this;
	}

	@Override
	public FyleSystem oldestElement() {
		return this;
	}

}
