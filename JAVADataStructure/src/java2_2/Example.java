package java2_2;

public class Example {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="����ȯ";
		p1.age=20;
		
		System.out.print(p1.name);
		System.out.println(p1.age);
		
		Person p2=new Person("����ö",31);
		System.out.print(p2.name);
		System.out.println(p2.age);
				
		System.out.println("======================");
		Person p3=new Person("���ٶ�");
		System.out.println(p3.name);
		System.out.println(p3.age);
		
		Person p4 =new Person(22);
		System.out.println(p4.name);
		System.out.println(p4.age);
	}

}
//this : ��ü �ڽ��� ���۷���(�޸� �ּ�)
//this. : �� ��ü�� ��� ���� �Ǵ� �޼���
//this() : (������ ���ο���) �ٸ� ������ ȣ��