package Sample0530;

import javax.swing.*;
import java.awt.event.*;

//class MyListener implements ActionListener {
//	public void actionPerformed(ActionEvent e) {
//		JButton button = (JButton) e.getSource();
//		button.setText("��ħ�� ��ư�� ���������ϴ�.");
//		//label.setText("��ħ�� ��ư�� ���������ϴ�.");				//���̺��� MyFrameŬ���� �ȿ� �־ �����ϱ� ��ƴ�.
//	}
//}

class MyFrame extends JFrame {
//class MyFrame extends JFrame implements ActionListener {
	
	private JButton button;
	//private JButton button2;								//button2�����
	private JLabel label;
	
	public MyFrame() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel panel = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		//button2 = new JButton("��ư2�� �����ÿ�");				//button2��ü�����
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�");
		//button.addActionListener(this);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					label.setText("��ħ�� ��ư�� ���������ϴ�.");
				}
			}
		});
		//button.addActionListener(new MyListener());
		//button2.addActionListener(new MyListener());		//button2�� Listener�����
		panel.add(button);
		//panel.add(button2);								//button2�� panel�� �߰�
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	//private class MyListener implements ActionListener {
		//public void actionPerformed(ActionEvent e) {
			//if(e.getSource() == button) {
				//label.setText("��ħ�� ��ư�� ���������ϴ�.");
			//}
			//else if(e.getSource() == button2) {			//button2�� ��������
			//	label.setText("��ư2�� ���������ϴ�.");			//"��ư2�� ���������ϴ�."��� �� ���
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
