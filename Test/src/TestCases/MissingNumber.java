package TestCases;

public class MissingNumber {

	public static void main(String[] args) {
		
		//int a[] = {1,2,3,4,5,6,7,8,9,10........100};
		//1+2+4+5 = 12
		//1+2+3+4+5 = 15
		//15-12 = 3
		
		//simple we do addition then substruct
		
		int a[] = {1,2,4,5,6};
		int sum = 0;
		
		for(int i=0; i<a.length; i++){
			sum = sum + a[i]; //18
		}
		System.out.println(sum);
		
		int sum1 = 0;
		for(int j=1; j<=6; j++){
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		
		System.out.println("missinig number is::: "+ (sum1-sum));
	
	
	
	
	}
	
	
}