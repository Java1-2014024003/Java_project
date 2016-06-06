package Sample0606;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class RadoiButtonFrame extends JFrame implements ActionListener {
	
	private JRadioButton small, medium, large;
	private JLabel text;
	private JPanel topPanel, sizePanel, resultPanel;
	
	public RadoiButtonFrame() {
		setTitle("라디오 버튼 테스트");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		small = new JRadioButton("Small Size");						//라디오 버튼 생성
		medium = new JRadioButton("Medium Size");					//라디오 버튼 생성
		large = new JRadioButton("Large Size");						//라디오 버튼 생성
		
		ButtonGroup size = new ButtonGroup();						//버튼 그룹을 생성하고 여기에 라디오 버튼을 추가
		size.add(small);
		size.add(medium);
		size.add(large);
		small.addActionListener(this);								//버튼에 액션 리스너를 등록
		medium.addActionListener(this);
		large.addActionListener(this);
		sizePanel.add(small);										//버튼 그룹을 생성하고 여기에 라디오 버튼을 추가
		sizePanel.add(medium);
		sizePanel.add(large);
		add(sizePanel, BorderLayout.CENTER);
		
		resultPanel = new JPanel();
		text = new JLabel("크기가 선택되지 않았습니다.");
		text.setForeground(Color.red);
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {					//라디오 버튼이 눌려지면 호출. 레이블에서 선택 결과를 출력.
		if (e.getSource() == small) {
			text.setText("Small 크기가 선택되었습니다.");
		}
		if (e.getSource() == medium) {
			text.setText("Medium 크기가 선택되었습니다.");
		}
		if (e.getSource() == large) {
			text.setText("Large 크기가 선택되었습니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadoiButtonFrame();
	}
}
