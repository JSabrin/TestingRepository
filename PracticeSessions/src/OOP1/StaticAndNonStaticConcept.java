package OOP1;

public class StaticAndNonStaticConcept {
	
	String name = "Steve"; //non static global variable
	static int age = 25; //static global variable

	public static void main(String[] args) {
		//how to call static methods and variable?
		//1. direct calling:
		sum();
		
		//2. calling by classname:
		StaticAndNonStaticConcept.sum();
		
		//how to call static variable?
		//1.calling by variable name:
		System.out.println(age);
		
		//2.calling by class name + variable name:
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non static methods and variables -- create by object
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static methods by using object reference? yes
		//Yes but it will given warning --
		obj.sum();
		
		//so over all:
		//for static method --- call directly by method name or variable name.
		//for non static method --- have to create an object for call that method.

	}
	
	public void sendMail(){ //non static method 
		System.out.println("Send mail method");
	}
	public static void sum(){ //static method
		System.out.println("Sum method");
	}

}
