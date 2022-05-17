package fileSystem;

public interface FyleSystem {

	public int totalSize();
	
	public void printStructure();
	
	public FyleSystem lastModified();
	
	public FyleSystem oldestElement();
	
}
