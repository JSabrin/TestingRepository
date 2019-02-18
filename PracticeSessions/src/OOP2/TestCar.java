 package OOP2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism ---- compile-time polymorphism
		//polymorphism it means one to manny method, overriding
		//childclass have access to inherit the property from parentclass.
		//but parentclass can not have access to inherit the property from childclass
		//from child to parent relationship is possible-
		//But from parent to child relationship is not possible
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.theftSafty();
		b.maintenance();
		b.spreed();
		b.engine();
		
		System.out.println("*********");
		
		Car c = new Car(); 
		c.start();
		c.stop();
		c.spreed();
		c.engine();
		//c.maintenance(); //not allowed
		//c.theftSafty(); //not allowed
		
		//In parentclass we don't have the access to get the property from the childclass. 
		
		System.out.println("*********");
		
		//Top casting:
		Car c1 = new BMW(); //childclass object can be referred by parentclass reference variable....
		//it called dynamic polymorphism --- or run-time polymorphism
		// you can referred my object(new BMW();) but you can not take my property.
		// In dynamic polymorphism we can take only the parentclass methods.
		c1.start();
		c1.stop();
		c1.spreed();
		c1.engine();
		//c1.maintenance(); //not allowed bcoz parentclass have no access to inherit the property from childclass
		//c1.theftSafty();
		System.out.println("*********");
		
		//Down casting:
		//down casting this object is possible only in compile-time but in run-time it will give the exception --- ClassCastException
		
		//BMW b1 = (BMW)new Car();
		//b1.start(); //ClassCastException it will give you Run-Time error.
		//b1.engine();
		
		
		
	}

	
}

