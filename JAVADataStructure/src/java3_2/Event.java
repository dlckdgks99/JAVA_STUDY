package java3_2;

public abstract class Event {
	public String title;
	
	public Event(String title) {
		this.title=title;
	}
	//�߻� �޼���� 
	//���� �ְ� ������ ���� �޼��� 
	//�߻� �޼��带 ������ Ŭ������ �߻� Ŭ����
	//�߻�޼���� �߻� Ŭ������ Ű���� abstract�� ǥ��
	//�߻� Ŭ������ ���Ը� ���� �� ����. ���� ���� Ŭ������ ����� �뵵�θ� ����
	public abstract boolean isRelevant(MyDate date);

	
}
