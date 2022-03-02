package java2_2;

public class Example {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="유진환";
		p1.age=20;
		
		System.out.print(p1.name);
		System.out.println(p1.age);
		
		Person p2=new Person("김진철",31);
		System.out.print(p2.name);
		System.out.println(p2.age);
				
		System.out.println("======================");
		Person p3=new Person("강바람");
		System.out.println(p3.name);
		System.out.println(p3.age);
		
		Person p4 =new Person(22);
		System.out.println(p4.name);
		System.out.println(p4.age);
	}

}
//this : 객체 자신의 레퍼런스(메모리 주소)
//this. : 이 객체의 멤버 변수 또는 메서드
//this() : (생성자 내부에서) 다른 생성자 호출