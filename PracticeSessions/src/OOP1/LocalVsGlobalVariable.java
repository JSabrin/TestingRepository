package OOP1;

public class LocalVsGlobalVariable {
	
	//Global variable -- bcoz after the class I created (class variable)
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		
		int i = 10; // local variable for main method
		System.out.println(i);
		
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
	
		
	}
	
	public void sum(){
		int i = 10; //local variable for sum method
		int j = 20;
		int age = 25;
	}
	
	

	

}
