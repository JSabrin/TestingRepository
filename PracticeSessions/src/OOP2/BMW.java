package OOP2;

public class BMW extends Car { //has-a relationship = class to class relationship.
	
	//When same method is present in parent class as well as in child class with the same method name 
	//and same number of arguments,is called method overriding.

	public void start() { //Overridden method --- when the same method have in parent class, as well as in child class 
		//the preference is child class method will execute.
		//Use your own method no need to inherit from parent class.
		
		//from child to parent relationship is possible
		//But from parent to child relationship is not possible
		System.out.println("BMW --- start");
	}

	public void maintenance() {
		System.out.println("BMW --- maintenance");
	}
	
	public void theftSafty(){
		System.out.println("BMW --- theftSafty");
	}


}