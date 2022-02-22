package java1_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IndexMaker {
	static String [] words=new String[100000];
	static int [] count=new int[100000];
	static int n=0;
	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		while(true) {
			System.out.print("$ ");
			String command=kb.next();//next()-->����ڰ� �Է��� �� 
			
			
			if(command.equals("read")) {   //equals�� ��ü���� ������ ��(�ݹ��̹��)   , ==�� �ּ��� ���� ���(�ݹ��̷��۷���)
				String fileName=kb.next(); 
				makeIndex(fileName);
			}
			else if(command.equals("find")){
				String str=kb.next();
				int index=findWord(str);
				if(index>-1) {
					System.out.println("The word" + words[index]+" appears "+count[index]+" times");
				}
				else {
					System.out.println("The word "+ str +"does not appears");
				}
			}
			else if(command.equals("saves")){
				String fileName=kb.next();
				saveAs(fileName);
			}
			else if(command.equals("showall")){
				for(int i=0; i<n;i++) {
					System.out.println(words[i]+" "+count[i]);
				}

			}
			else if(command.equals("exit")||command.equals("EXIT")) {
				break;
			}
			
		}
		kb.close();
		}
	public static void saveAs(String fileName) {
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(fileName));
			for(int i=0;i<n;i++) {
				outFile.println(words[i]+ " " +count[i]);
			}
			outFile.close();
		} catch (IOException e) {
			System.out.println("Saved failed");
			return;
			
		}
	}
	public static void makeIndex(String fileName) {
		try {
			Scanner inFile=new Scanner(new File(fileName));
			while(inFile.hasNext()) { //has.next()�� ������ ���ڰ� ����������
				String str=inFile.next();
				
				addWord(str);
			}
			inFile.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			e.printStackTrace();
			return;
		}
		
	}
	//���ذ� �߾ȵ�
	public static void addWord(String str) {
		int index=findWord(str);
		if(index !=-1) {
			count[index]++;
		}
		else {
			words[n]=str;
			count[n]=1;
			n++;
			
		}
	}
	public static int findWord(String str) {
		for(int i=0;i<n;i++) {
			if(words[i].equalsIgnoreCase(str)) 
				return i;
		}
		return -1;
 }
	


}
