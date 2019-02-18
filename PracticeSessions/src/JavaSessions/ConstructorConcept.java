package JavaSessions;

public class ConstructorConcept {
	//Constructor: while creating the object if you want to define some class feature in the form of-
	//global variable, in the form of object in that case we using constructor.
	//Constructor is having some properities
	//Constructor it's look like a function, but it is not a function
	//Constructor can not return any value
	//Constructor name should be with the class name always 
	//Duplicate method will not allowed in Constructor
	
	//Can we overloaded the constructor? Yes we can overload the constructor
	//How to call a constructor?
	//Constructor will be call immediatelly when we create the object for the particular class.
	
	public ConstructorConcept(){ //default constructor --- with 0 parameters ---we don't write any void,static or any data type
		System.out.println("Default constructor");
	}
	public ConstructorConcept(int i){
		System.out.println("Single parameter constructor");
		System.out.println("the value of i is "+ i);
	}
	public ConstructorConcept(int i, int j){
		System.out.println("two parameters constructor");
		System.out.println("the value of i: "+i);
		System.out.println("the value of i: "+j);
	}
	 
	
	public static void main(String[] args){
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);
	}
}
