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
		
		textArea = new JTextArea(10, 30);	//�ؽ�Ʈ ������ ����.TextArea�� �ټ��� ĭ���� �������� �μ��� ������ ����. ���ڿ��� �μ��� �ָ� TextArea �����ÿ� �� ���ڿ��� ǥ�� ������ ��Ÿ��
		JScrollPane scrollPane = new JScrollPane(textArea);
		add(scrollPane, BorderLayout.CENTER);
		textArea.setEditable(false);
		
		add(textField, BorderLayout.NORTH);
		//add(textArea, BorderLayout.CENTER);				//��ũ�� ������ ���̸� �� ���� ����� ��. textArea�� �ι� ���̴� ���̶�. �߿�!!!!!
		
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evt) {		//�ؽ�Ʈ �ʵ忡�� �ؽ�Ʈ�� �о �ؽ�Ʈ ������ �߰�. �Է��� ���ϰ� �ϱ� ���� �ؽ�Ʈ �ʵ忡 �ִ� �ؽ�Ʈ�� ��� ����.
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

