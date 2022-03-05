package java3_2;

public abstract class Event {
	public String title;
	
	public Event(String title) {
		this.title=title;
	}
	//추상 메서드란 
	//선언만 있고 구현이 없는 메서드 
	//추상 메서드를 포함한 클래스는 추상 클래스
	//추상메서드와 추상 클래스는 키워드 abstract로 표시
	//추상 클래스는 개게를 만들 수 없음. 따라서 서브 클래스를 만드는 용도로만 사용됨
	public abstract boolean isRelevant(MyDate date);

	
}
