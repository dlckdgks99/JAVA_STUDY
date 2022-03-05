package java3_3;

public class Test {
	public int a=5;
	public double x=5;
	
	
	public String toString() {
		return a+" "+x;
	}
	
	public boolean equals(Object other) //overriding
	{
		Test other2=(Test)other; //type casting
		return a==other2.a && x==other2.x;
			
		
	}
	public static void main(String[] args) {
		Test test1=new Test();
		Test test2=new Test();
		
		test2.a=5;
		test2.x=5.0;
		
		System.out.println(test1.toString());
		
		if(test2.equals(test1)) {
		 	System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
