package java1_2;

import java.util.Arrays;
import java.util.Scanner;

//����ڷκ��� n���� ������ �Է¹��� �� ������������ ����(sort)�Ͽ� ����ϴ� �ڵ�
public class Code18 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();		
		int []data=new int[n];
		for(int i=0;i<n;i++) {
			data[i]=kb.nextInt();
		}
		kb.close();
		sorting(n,data);
		System.out.println(Arrays.toString(data));
	}

	public static void sorting(int n,int [] data) {
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(data[j]>data[j+1]) {
					int tmp=data[j];
					data[j]=data[j+1];
					data[j+1]=tmp;
				}
			}
		}
	}

}
