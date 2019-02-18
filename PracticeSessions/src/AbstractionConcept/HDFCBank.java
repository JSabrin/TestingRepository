package AbstractionConcept;

public class HDFCBank extends Bank {

	//Abs method name loan has to be create with same method name loan in that child class HDFCBank
	public void loan(){ //same method name with same argument in parent class as well as in child class is called method over ridding.
		System.out.println("HDFC -- loan method");
	}
	
	public void funds(){
		System.out.println("HDFC -- Funds method" );
	}
	
	
	
}
