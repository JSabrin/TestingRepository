package OOP1;

public class CallByValueAndCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		
		int i = obj.testSum(10, 20);
		System.out.println(i );
		// or
		int x = 10;
		int y = 20;
		obj.testSum(x,  y); // call by value or pass by value
		
		
		obj.p = 100;
		obj.q = 200;
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.p); //200
		System.out.println(obj.q); //100
	}
	public int testSum(int a, int b){
		int c = a+b;
		return c;
	}
	// Is it possible call by reference in java? -- Yes -- by using object references -- we have to pass object references
	
	//call by reference:
	public void swap(CallByValueAndCallByReference t){
		int temp;
		temp = t.p; //temp = 100
		t.p = t.q; //t.p = 200
		t.q = temp; //t.q = 100
	}
}
