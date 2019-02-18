package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hb = new HDFCBank();
		
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		Bank b = new HDFCBank();
		
		b.credit();
		b.debit();
		b.loan();
		//b.funds(); //we can't define funds method here bcoz object is HDFCBank but b is here from Bank variable.
		
		//Bank b1 = new Bank(); // we can not create object of abstract class 
		

	}

}
