package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//AWT : java + C 개발
//Swing :AWT를 향상시킨 버전, java로만 개발
public class FrameExam {
	public static void main(String[] args) {
		Frame f = new Frame("프레임 테스트");//프레임 생성 AWT
//		JFrame f = new JFrame("J프레임 테스트");//Swing
		f.setSize(500, 300);//프레임의 사이즈 설정
		f.setVisible(true);//프레임을 화면에 표시
		
		//이벤트 처리 
		//f.addWindowListener(new WindowListener())
		//이벤트소스.이벤트리스너(이벤트핸들러)
//		f.addWindowListener(new WindowListener() {//익명 클래스
//			@Override
//			public void windowOpened(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				//프로그램종료 및 화면창 닫기
//				System.exit(0);
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//			}
//		});
		//Listener보다  Adapter를 사용하면 비교적 코드가 간략해진다.
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//0:정상적인 종료, -1:비정상적인 종료
			}
		});
	}

}
