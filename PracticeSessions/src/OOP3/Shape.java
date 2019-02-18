package OOP3;

public abstract class Shape {

	Shape(){
		System.out.println("Shape class constructor");
	}
	int color;
	
	abstract void drawing();
	
	public void fill(){
		System.out.println("Shape --- fill");
	}
	
	
}
