package AbstractionConcept;

public abstract class Bank {
	
	//when we want to some implements hide for partial Abstraction then we use Abstraction class.
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;
	//so in Abstract class we can define non static var, final var and also static var.
	
	
	//hiding the implementation logic --- is called Abstraction (OOP Concept)
	//Abstract method do not specify a method body
	//Abs class can have abs methods and non abs methods
	//partial abstraction
	//prototype -- no method body 
	//Abs class can create as many as Abs methods but one Abs method is compulsory in that particular Abs class.
	//we can not create the object of Abstract classes
	
	public abstract void loan(); //Abstract method do not specify a method body --- no method body
	
	
	//non abstract methods
	public void credit(){
		System.out.println("credit --- Bank method");
	}
	
	public void debit(){
		System.out.println("debit --- Bank method");
	}
	
	
	
	
	
	
	
	
	

}
