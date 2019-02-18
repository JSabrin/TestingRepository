package OOP1;

public class Car {

	// class(Car) variable:
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		Car a = new Car(); // new Car() --- this is the Object of Car class
		Car b = new Car(); // new keyword is used to create the Object
		Car c = new Car(); // a,b,c is the Object reference variable/name
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2016;
		b.wheel = 4;
		
		c.mod = 2017;
		c.wheel = 4;
		
		System.out.println("Before assigning the references");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the references");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod); //10
		c.mod = 20;
		System.out.println(a.mod); //20
		System.out.println(c.mod); //20
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
