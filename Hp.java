package Interface;

public class Hp implements Laptop{
	@Override
	public void copy() {
		System.out.println("Hp copy code");
		
	}

	@Override
	public void main() {
		System.out.println("Hp copy main");
		
	}

	@Override
	public void cut() {
		System.out.println("Hp copy cut");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Hp copy keyboard");
	}
	public void Print() {
		System.out.println("Hp Own Print Code");

}


}
