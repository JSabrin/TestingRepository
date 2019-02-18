package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
	
		// 1. while loop:
		//print 1 to 10 using while method
		// Disadvantage for while loop = it will generate the infinite loop if we don't give incremental or decrement part...
		int i = 1;
		while (i<=10){
			System.out.println(i);
			i++;
		}
		System.out.println("****************************");

		// 2. for loop:
		// i++ means i=i+1
		// print 0 To 10
		
		for (i=0; i<=10; i++){   //initialization , conditional, incremental
			System.out.println(i); //three part of for loop....
		} 
		System.out.println("****************************");
		
		// print 10 to 1
		// k-- means k=k-1
		// it will print 10 9 8 7 6 5 4 3 2 1
		
		for (int k=10; k>=1; k--){
			System.out.println(k);
		}
		System.out.println("**********************************");
			
		for (int k=10; k>=0; k--){
			System.out.println(k);
		}
		System.out.println("**********************************");
		
		// -1>-10 = True
		// 1>10 = false
		
		for (int k=10; k>=-10; k--){ // initialization, conditional, decrement
			System.out.println(k);
		}
		//System.out.println("**********************************");
			
			
			

		
		
		
		
		
		
		
		
		
	}

}
