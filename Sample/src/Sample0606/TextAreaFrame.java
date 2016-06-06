package Sample0606;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaFrame extends JFrame implements ActionListener {
	protected JTextField textField;
	protected JTextArea textArea;
	
	public TextAreaFrame() {
		setTitle("Text Area Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea = new JTextArea(10, 30);	//텍스트 영역을 생성.TextArea의 줄수와 칸수는 생성자의 인수로 지정이 가능. 문자열을 인수로 주면 TextArea 생성시에 그 문자열이 표시 영역에 나타남
		JScrollPane scrollPane = new JScrollPane(textArea);
		add(scrollPane, BorderLayout.CENTER);
		textArea.setEditable(false);
		
		add(textField, BorderLayout.NORTH);
		//add(textArea, BorderLayout.CENTER);				//스크롤 페인을 붙이면 이 줄은 없어야 해. textArea를 두번 붙이는 꼴이라서. 중요!!!!!
		
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evt) {		//텍스트 필드에서 텍스트를 읽어서 텍스트 영역에 추가. 입력을 편하게 하기 위해 텍스트 필드에 있는 텍스트를 모두 선택.
		String text = textField.getText();
		textArea.append(text + "\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaFrame();
	}
}

