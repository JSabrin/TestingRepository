package AbstractionConcept;

public interface Car {
	 
	//when we want to full abstract than mean 100% abstraction then we use interface class 
	//so In interface we can define only final and static variables:
	//final int wheels = 4; //by default it will make final or static 
	int wheels = 4;
	
	//In interface i can have only and only Abstract method --
	//no method body
	//only method declaration
	//we achieve 100% abstraction
	//can not create the object of interface
	
	public void  start();
	public void stop();
	public void refuel();
	

}
