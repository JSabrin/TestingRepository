package TestCases;

public class ReverseInteger {

	public static void main(String[] args) {
		
		/*
		int num2 = 123654999;
		int rev2 = 0;
		while(num2 != 0){
			rev2 = rev2 * 10+ num2 % 10;
			num2 = num2 / 10;
		}
		System.out.println(rev2);
		
		*/
	
		//using algo:
		int num = 123456; //654321
		int rev = 0;
		
		while(num != 0){
			rev = rev * 10 + num % 10;
			num = num / 10;
			
		}
		System.out.println("Reverse num is::"+ rev);

		
		//using StringBuffer:
		int num1 = 456897;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	}
	

}
