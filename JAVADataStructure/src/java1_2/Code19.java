package java1_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//파일 입출력 
public class Code19 {

	public static void main(String[] args) {		
		String [] name= new String[1000];
		String [] number=new String[1000];
		int n=0;
		try{
			Scanner inFile=new Scanner(new File("input.txt"));
			
			while(inFile.hasNext()) {//detect End of File
				name[n]=inFile.next();//하나의 문자열 입력
				number[n]=inFile.next();
				n++;
			}
			
			
		
			inFile.close();
		}catch(FileNotFoundException e) {
			System.out.println("No file");
			return;
		}
		for(int i=0;i<n;i++) {
			System.out.println(name[i]+" : "+number[i]);
		}
	}
}