//package java1_2;
//
//import java.util.Arrays;
//
//public class Code21 {
//
//	public static void main(String[] args) {
//		int[][]arr= {{6,6,3,1},{2,8,0,5},{1,6,5,4},{5,0,7,3}};
//		
//		for(int x=0;x<n;x++) {
//			for(int y=0;y<n;y++) {
//				for(int dir=0;dir<8;dir++) {
//					for(int length=1;length<=n;length++) {
//						int value=computeValue(x,y,dir,length);
//						if(value!=-1&&isPrime(value)) {
//							System.out.println(value);
//						}
//					}
//				}
//			}
//		
//		}
//	}
//	public static boolean isPrime(int k) {
//		if(k<2) {
//			return false;
//		}
//		for(int i=2;i*i<=k;i++) {
//			if(k%i==0) {
//				return false;
//			}
//		}
//		return true;
//	}
//	public static int computeValue(int x,int y,int dir,int len) {
//		int value=0;
//		for(int i=0;i<len;i++) {
//			int digit=getDigit(x,y,dir,i);
//			if(digit==-1) {
//				return -1;
//			}
//		}
//		return value;
//	}
//	public static int getDigit(int x,int y,int dir,int k) {
//		int newX=x,newY=y;
//		switch(dir) {
//		case 0:newY-=k;break;
//		case 1:newX+=k;newY-=k;break;
//		case 2:newX+=k;break;
//		case 3:newX+=k;newY+=k;break;
//		case 4:newY-=k;newY+=k;break;
//		case 5:newX-=k;newY+=k;break;
//		case 6:newX-=k;break;
//		case 7:newX-=k;newY-=k;break;
//		}
//		
//	}
//
//}
