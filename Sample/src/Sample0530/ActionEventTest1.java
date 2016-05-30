package Sample0530;

import javax.swing.*;
import java.awt.event.*;

//class MyListener implements ActionListener {
//	public void actionPerformed(ActionEvent e) {
//		JButton button = (JButton) e.getSource();
//		button.setText("마침내 버튼이 눌려졌습니다.");
//		//label.setText("마침내 버튼이 눌려졌습니다.");				//레이블은 MyFrame클래스 안에 있어서 접근하기 어렵다.
//	}
//}

class MyFrame extends JFrame {
//class MyFrame extends JFrame implements ActionListener {
	
	private JButton button;
	//private JButton button2;								//button2만들기
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");
		//button2 = new JButton("버튼2를 누르시오");				//button2객체만들기
		label = new JLabel("아직 버튼이 눌려지지 않았습니다");
		//button.addActionListener(this);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					label.setText("마침내 버튼이 눌려졌습니다.");
				}
			}
		});
		//button.addActionListener(new MyListener());
		//button2.addActionListener(new MyListener());		//button2의 Listener만들기
		panel.add(button);
		//panel.add(button2);								//button2를 panel에 추가
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	//private class MyListener implements ActionListener {
		//public void actionPerformed(ActionEvent e) {
			//if(e.getSource() == button) {
				//label.setText("마침내 버튼이 눌려졌습니다.");
			//}
			//else if(e.getSource() == button2) {			//button2가 눌려지면
			//	label.setText("버튼2가 눌려졌습니다.");			//"버튼2가 눌려졌습니다."라는 라벨 출력
			//}
		}
	//}
//}

public class ActionEventTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame t = new MyFrame();
	}

}
