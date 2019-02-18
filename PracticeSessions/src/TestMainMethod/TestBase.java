package TestMainMethod;

public class TestBase {
	
	//main method we can overloaded -- same method name with diff arguments called method overloading.
	//same original main method we can not define twice in specific class
	//JVM -- main (static args[]) -- public static void
	
	public static void main(String[] args) {
		System.out.println("main method -1");

		main("Java practice");
		main(10);
		main(20, 30);
		
	}
	
	public static void main(String args){
		System.out.println("main method -2");
	}
	
	public static void main(int a){
		System.out.println("main method -3");
	}

	public static void main(int a, int b){
		System.out.println("main method -4");
	}
}
