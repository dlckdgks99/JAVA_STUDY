package java1_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson_1 {
	static String [] names=new String[1000];
	static int [] numbers=new int[1000];
	static int n=0;
	public static void main(String[] args) {
		Scanner sc;
		try {
			sc=new Scanner(new File("input.txt"));
			while(sc.hasNext()) {
				names[n]=sc.next();
				numbers[n]=sc.nextInt();
				n++;
			}
			sc.close();
		}catch(FileNotFoundException e) {
			System.out.println("No file");
			System.exit(1);
		}
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(numbers));
	}
	static public void bubbleSort() {
		
	}
}
