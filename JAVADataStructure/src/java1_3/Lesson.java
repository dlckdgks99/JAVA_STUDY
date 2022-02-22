package java1_3;

import java.awt.Taskbar;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson {
	
//	static String [] names=new String[1000];
//	static int [] numbers=new int[1000];
//	static int n=0;
	
	public static void main(String[] args) {
		 
		
		Scanner kb=new Scanner(System.in);
		int k =kb.nextInt(); //scanf("%d,&k);
		String [] names=new String[k];
		int [] numbers=new int[k];
		int n=0;
		
		for(int i=0;i<k;i++) {
			names[i]=kb.next();
			numbers[i]=kb.nextInt();
		}
			
		
		kb.close();
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(numbers));
	}
	public void finc() {
		
		
	}
}	