package TestCases;

public class FinalizeConcept {
	
	public void finalize(){
		System.out.println("finalize method");
	}
	//finalize is a method,
	//finalize is used for clean-up processing before the garbage collector processing.
	
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		//In Java concept inside the JVM which object has no reference java garbage collector will be kill that object.
		//to release the java memory.
		//Just for the clean-up processing of the object we use finalize method.
		//Before the gc(Garbage collector)finalize method will be automatically called just for the clean-up-
		//processing of the object & this is the concept of  finalize.

		f1 = null; //without reference
		f2 = null; //no one refering this object
	
		System.gc(); //call garbage collector
	}

}
