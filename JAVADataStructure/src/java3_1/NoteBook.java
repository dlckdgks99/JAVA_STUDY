package java3_1;

//상속

public class NoteBook extends Computer {

	public double screenSize;
	public double weight;
	
	
	//생성자
	public NoteBook(String man,String proc, int ram, int disk, double speed, double screen, double weight) {
		//
		super(man,proc,ram,disk,speed);
		manufacturer=man;
// super()안에 매개변수를 넣는 것이므로 아래 코드는 지워도 됩니다.
//		processor=proc;
//		ramSize=ram;
//		diskSize=disk;
//		processorSpeed=speed;
//		screenSize=screen;
		//클래스의 데이터 멤버의 이름과 데이터 생성자의 이름이 같을 경우 this를 사용 
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

		
// 		생성자에 넣어 주었기 때문에 이 코드는 필요 없게 된다.
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
//노트북 클래스는 컴퓨터 클래스이다
//컴퓨터 클래스는 노트북 클래스의 상위 클래스이다
//노트북 클래스는 컴퓨터 클래스의 하위 클래스이다.

//자바에서는 모든 클래스는 하나 이상의 생성자를 가져야합니다(모순??)-> 우리 자바는 우리눈에 보이지 않지만 알아서 자동으로 생성자를 생성합니다.
//생성자가 없을 경우 자동으로 no-parameter 생성자가 만들어집니다.
