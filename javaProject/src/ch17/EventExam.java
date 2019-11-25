package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventExam extends Frame{
	//이벤트 처리하는 방법
	//1.WindowListener익명내부클래스로 구현
	//2.WindowAdapter익명내부클래스로 구현
	//3.외부파일에서 구현
	public EventExam() {
		setSize(300, 300);//가로,세로
		setVisible(true);
		//이벤트소스.이벤트리스너(이벤트핸들러)
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		new EventExam();
	}

}
