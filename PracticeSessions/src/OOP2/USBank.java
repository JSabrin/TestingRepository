package OOP2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body -- only method prototype
	//In interface we can declare the variables, variable are by the default static in nature.
	//variable value will not be changed, it's final/constant in nature
	//no static method in interface
	//no main method in interface
	//we can not create the object of interface
	//interface is abstract in nature
	

}
