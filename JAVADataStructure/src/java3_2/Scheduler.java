package java3_2;

import java.util.Scanner;

public class Scheduler {
	//
//	OneDayEvent [] onedays =new OneDayEvent [100];
//	DurationEvent [] durations=new DurationEvent[100];
//	DeadlinedEvent [] deadlines=new DeadlinedEvent [100];
// 	int n1=0,n2=0,n3=0;
	public Event [] events=new Event[100];	
	public int n=0;
	private Scanner kb;
	
	public void processComand() {
		kb=new Scanner(System.in);
		while(true){
			System.out.print("$");
			String command=kb.next();
			if(command.equals("addevent")){
				String type=kb.next();
				if(type.equalsIgnoreCase("oneday")) {
					handleAddoneDayEvent();
				}
				else if(type.equalsIgnoreCase("duration")){
					handleAddDurationEvent();
				}
				else if(type.equalsIgnoreCase("deadline")) {
					handleAddDeadlineEvent();
				}
					
			}
			else if(command.equals("list")){
				handleList();
			}
			else if(command.equals("show")){
				handleShow();
			}
			else if(command.equals("exit")){
				break;
			}
		}
		kb.close();
	}
	private void handleShow() {
		String dateString=kb.next();
		MyDate theDate=parseDateString(dateString);
		for(int i=0;i<n;i++) {
			//test if events[i] is relevant to the date, then print it;
			if(events[i].isRelevant(theDate)) {
				System.out.println(events[i].toString());
			}
		}
	}
	private void handleList() {
		for(int i=0;i<n;i++) {
			System.out.println("  "+events[i].toString() );
		}
		
		
	}
	private void handleAddDeadlineEvent() {
		// TODO Auto-generated method stub
		
	}
	private void handleAddDurationEvent() {
		// TODO Auto-generated method stub
		
	}
	
	private void handleAddoneDayEvent() {
		System.out.print(" When : ");
		String dateString = kb.next();

		System.out.print(" title : ");
		String title=kb.next();
		
		MyDate date = parseDateString(dateString);
		
		OneDayEvent ev=new OneDayEvent(title,date);

		events[n++]=ev;
	}
	
	private MyDate parseDateString(String dateString) {
		String[] tokens=dateString.split("/");
		
		int year=Integer.parseInt(tokens[0]);
		int month=Integer.parseInt(tokens[1]);
		int day=Integer.parseInt(tokens[2]);
		
		MyDate d=new MyDate(year,month,day);
		return d;
	}
	
	public static void main(String[] args) {
		Scheduler app=new Scheduler();
		app.processComand();
	}

}


//split
//특정 문자를 뺴서 배열에 넣는 클래스