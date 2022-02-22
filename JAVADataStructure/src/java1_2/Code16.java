package java1_2;

import java.util.Scanner;


public class Code16 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		int b=kb.nextInt();
		
		int result=power(a,b);
		kb.close();
		System.out.println(result);
	}

	public static int power(int a, int b) {
		int result=1;
		for(int i=1;i<=b;i++) {
			result*=a;
		}
		return result;
	}
	
	
}
