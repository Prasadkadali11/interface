package Interface;

public class Lenovo implements Laptop{

	@Override
	public void copy() {
		System.out.println("lenovo copy code");
		
	}

	@Override
	public void main() {
		System.out.println("lenovo copy main");
		
	}

	@Override
	public void cut() {
		System.out.println("lenovo copy cut");
		
	}

	@Override
	public void keyboard() {
		System.out.println("lenovo copy keyboard");
	}
	public void camera() {
		System.out.println("Lenovo Own Devlop");
	}

}
