package OOP2;

public class TestBank {

	public static void main(String[] args) {

		// as we know we can not create the object of interface so we will
		// create the object of class

		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		//call by class or interface name
		System.out.println(USBank.min_bal);
		//USBank.min_bal = 200;
		//first of all variable value default by nature
		//when we final defined the variable value we can not changed it

		// dynamic polymorphism:
		// child class object can be referred by parent interface reference
		// variable
		// It will call only the overriding method

		USBank us = new HSBCBank(); //reference variable of parent interface
		us.credit();
		us.debit();
		us.transferMoney();
		//only the matching overriding methods will take

	}

}
