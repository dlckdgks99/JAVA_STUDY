package java1_2;
//1~1000000 ������ �Ҽ��� ã�� ���
public class Code17 {

	public static void main(String[] args) {
		for(int i=2;i<100000;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(int k) {
		if(k<2) {
			return false;
		}
		for(int i=2;i*i<=k;i++) {
			if(k%i==0) {
				return false;
			}
		}
		return true;
	}
}
