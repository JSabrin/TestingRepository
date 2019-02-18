package OOP2;

public class HSBCBank extends Finance implements USBank, BrazilBank{ //we are achieving multiple inheritance
	
	//Is-a relationship = it means class to interface relationship. and
	//Has-a relationship = it means class to class relationship, which we use extends keyword
	
	//from specific class if we implements any interface -- the first rule is 
	//we have to create same methods, whatever we have in interface exactly same method we need to create in our class.
	//In class can have some own methods too
	
	//If a class is implementing any interface, than it's mandatory to define/override all the methods of interface.
	
	
	//overriding from USBank interface
	public void credit(){
		System.out.println("hsbc --- credit");
	}
	
	public void debit(){
		System.out.println("hsbc --- debit");
	}
	
	public void transferMoney(){
		System.out.println("hsbc --- transferMoney");
	}
	 
	//separate methods of HSBCBank class
	public void educationLoan(){
		System.out.println("hsbc --- education loan");
	}
	
	public void carLoan(){
		System.out.println("hsbc --- car loan");
	}
	
	//BrazilBank method: override the method from BrazilBank interface
	public void mutualFund(){
		System.out.println("hsbc --- mutualFund");
	}

}
