package Interface;

public interface Laptop {
	// any company following these Conditions
	public void copy();
	public void main();
	public void cut();
	public void keyboard();

	default void security() {
	 System.out.println(" please implement");
		
	} 
	}
	
