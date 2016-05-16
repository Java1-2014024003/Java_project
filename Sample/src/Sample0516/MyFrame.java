package Sample0516;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(300,200);
		setLocation(screenSize.width / 2, screenSize.height / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		
		setLayout(new FlowLayout());
		JButton button = new JButton("Button");
		this.add(button);										//this.add(button)²À Ãß°¡!!
		setVisible(true);
	}

}
