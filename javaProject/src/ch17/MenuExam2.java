package ch17;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuExam2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuExam2 frame = new MenuExam2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuExam2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("파일(F)");
		menuBar.add(menuFile);
		
		JMenuItem miNewFile = new JMenuItem("새로만들기(N)");
		menuFile.add(miNewFile);
		
		JMenuItem miOpen = new JMenuItem("열기(O)");
		menuFile.add(miOpen);
		
		JMenuItem misave = new JMenuItem("저장(S)");
		menuFile.add(misave);
		
		JMenuItem miAnother = new JMenuItem("다른 이름으로 저장(A)");
		menuFile.add(miAnother);
		
		JMenuItem miUser = new JMenuItem("페이지 설정(U)");
		menuFile.add(miUser);
		
		JMenuItem miPrint = new JMenuItem("인쇄(P)");
		menuFile.add(miPrint);
		
		JMenuItem miExit = new JMenuItem("끝내기(X)");
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(MenuExam2.this, "종료할까요?");
				if(a == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(MenuExam2.this, "종료되었습니다.");
				System.exit(0);
				}
			}
		});
		menuFile.add(miExit);
		
		JMenu menuEdit = new JMenu("편집(E)");
		menuBar.add(menuEdit);
		
		JMenuItem miUturn = new JMenuItem("실행 취소(U)");
		menuEdit.add(miUturn);
		
		JMenuItem miCut = new JMenuItem("잘라내기(T)");
		menuEdit.add(miCut);
		
		JMenuItem miCopy = new JMenuItem("복사(C)");
		menuEdit.add(miCopy);
		
		JMenuItem miPage = new JMenuItem("붙여넣기(P)");
		menuEdit.add(miPage);
		
		JMenuItem miDelete = new JMenuItem("삭제(L)");
		menuEdit.add(miDelete);
		
		JMenuItem miLook = new JMenuItem("찾기(F)");
		menuEdit.add(miLook);
		
		JMenuItem miNext = new JMenuItem("다음 찾기(N)");
		menuEdit.add(miNext);
		
		JMenuItem miChange = new JMenuItem("바꾸기(R)");
		menuEdit.add(miChange);
		
		JMenuItem miMove = new JMenuItem("이동(G)");
		menuEdit.add(miMove);
		
		JMenuItem miAll = new JMenuItem("모두선택(A)");
		menuEdit.add(miAll);
		
		JMenuItem miDate = new JMenuItem("시간/날짜(D)");
		menuEdit.add(miDate);
		
		JMenu menusource = new JMenu("서식(O)");
		menuBar.add(menusource);
		
		JMenuItem miAuto = new JMenuItem("자동 줄바꿈(W)");
		menusource.add(miAuto);
		
		JMenuItem miFont = new JMenuItem("글꼴(F)");
		menusource.add(miFont);
		
		JMenu menuView = new JMenu("보기(V)");
		menuBar.add(menuView);
		
		JMenuItem miState = new JMenuItem("상태 표시줄(S)");
		menuView.add(miState);
		
		JMenu menuhelp = new JMenu("도움말(H)");
		menuBar.add(menuhelp);
		
		JMenuItem miHelp = new JMenuItem("도움말 보기(H)");
		menuhelp.add(miHelp);
		
		JMenuItem miMemoIn = new JMenuItem("메모장 정보(A)");
		menuhelp.add(miMemoIn);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
