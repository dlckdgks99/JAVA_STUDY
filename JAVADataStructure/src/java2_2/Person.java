package java2_2;

public class Person {
	String name;
	int age;
	Person(){
		
	}
	
	Person(String name){
		this(name,24);
	}
	Person(int age){
		this("��â��",age);
	}
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
}
