package java3_1;

//���

public class NoteBook extends Computer {

	public double screenSize;
	public double weight;
	
	
	//������
	public NoteBook(String man,String proc, int ram, int disk, double speed, double screen, double weight) {
		//
		super(man,proc,ram,disk,speed);
		manufacturer=man;
// super()�ȿ� �Ű������� �ִ� ���̹Ƿ� �Ʒ� �ڵ�� ������ �˴ϴ�.
//		processor=proc;
//		ramSize=ram;
//		diskSize=disk;
//		processorSpeed=speed;
//		screenSize=screen;
		//Ŭ������ ������ ����� �̸��� ������ �������� �̸��� ���� ��� this�� ��� 
		this.weight=weight;
	}
	public String toString() {
		String result = 
//						"Manufacturer: "+ manufacturer +
//						"\nCPU: " + processor +
//						"\nRAM: " +ramSize + " megabytes" +
//						"\nDisk: " + diskSize + " gigabytes" +
//						"\nProcessor speed: " + processorSpeed + " gigahertz"+
						super.toString()+
						"\nScreen Size: " +screenSize+" inches"+
						"\nWeight : "+weight+" kg";
						
		return result;
	}
	
	public static void main(String[] arg) {
		NoteBook test = new NoteBook("Dell","is" ,4,1000,3.2,15.6,1.2);

		
// 		�����ڿ� �־� �־��� ������ �� �ڵ�� �ʿ� ���� �ȴ�.
//		test.manufacturer="Dell";
//		test.processor="is";
//		test.ramSize=4;
//		test.diskSize=1000;
//		test.processorSpeed=3.2;
//		
//		test.screenSize=15.6;
//		test.weight=1.2;
		
		System.out.println(test.computerPower());
		System.out.println(test.toString());
	}
}
//��Ʈ�� Ŭ������ ��ǻ�� Ŭ�����̴�
//��ǻ�� Ŭ������ ��Ʈ�� Ŭ������ ���� Ŭ�����̴�
//��Ʈ�� Ŭ������ ��ǻ�� Ŭ������ ���� Ŭ�����̴�.

//�ڹٿ����� ��� Ŭ������ �ϳ� �̻��� �����ڸ� �������մϴ�(���??)-> �츮 �ڹٴ� �츮���� ������ ������ �˾Ƽ� �ڵ����� �����ڸ� �����մϴ�.
//�����ڰ� ���� ��� �ڵ����� no-parameter �����ڰ� ��������ϴ�.
