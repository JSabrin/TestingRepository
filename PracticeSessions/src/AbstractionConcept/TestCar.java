package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		Car c = new BMW();
		
		c.start();
		c.stop();
		c.refuel();
		//c.theftSafety();//for that ref Car var we can not define theftSafety method 
		//theftSafety method is BMW class property

	}

}
