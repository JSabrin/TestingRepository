package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		//Array: to store similar data type values in a array variable
		
		//1. int array:
		//lower Bound/index = 0
		//higher Bound/index = (n-1) n is size of array
		//one dimension array is also called --- static array
		
		//dis-advantages of array:
		//1. size is fixed --- in static array -- to overcome of this problem -- we use Collections -- ArrayList, HashTable -- use dynamic array
		//2. stores only similar data types --- you can't mixed them in static array like> one int another String..-- to overcome of this problem -- we use Object array	
		
		
		int x[] = new int[4];
		System.out.println(x.length); //size/length of array
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		System.out.println(x[0]);
		System.out.println(x[3]);
		//System.out.println(x[4]);---ArrayIndexOutOfBoundsException 
		//print all the values of array--- use for loop
		
		for (int i=0; i<x.length; i++){
			System.out.println(x[i]);
		}
		//2. double array:
		double d[] = new double[3];
		d[0] = 12.44;
		d[1] = 10.85;
		d[2] = 51.74;
		System.out.println(d[1]);
		
		//3. char array:
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 2;
		c[2] = '$';
		System.out.println(c[2]);
		
		//4. boolean array:
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[0]);
		
		//5. String array:
		//square bracket before or after variable doesn't matter in array 
		String []s = new String[3];
		s[0] = "Hello";
		s[1] = "World";
		s[2] = "1/1/2017";
		System.out.println(s.length);
		System.out.println(s[2]);
		
		//6. Object array:(Object is a class) --- is used to store different data types values
		Object obj[] = new Object[6];
		obj[0] = "Steve";
		obj[1] = 24;
		obj[2] = "01/01/1990";
		obj[3] = 'M';
		obj[4] = 8000.125;
		obj[5] = "Afganistan";
		System.out.println(obj[5]);
		System.out.println(obj.length);
		
		for (int i=0; i<obj.length; i++){
			System.out.println(obj[i]);
		}
		
		
		
		
		
		
		
		
		

	}

}
