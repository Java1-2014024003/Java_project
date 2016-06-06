package Sample0606;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	BufferedImage img = null;
	int img_x = 0, img_y = 0;
	
	public MyPanel() {
		try {											//try문 안에 오류가 생기면
			img = ImageIO.read(new File("car.gif"));	//car.gif는 왼쪽 제일 위 파일의 속성에서 파일의 위치에 저장해야 한다.
		} catch (IOException e) {						//catch문에서 잡아준다.
			System.out.println("no image");
			System.exit(1);
		}
		//addMouseListener(new MouseListener() {
		addMouseListener(new MouseAdapter() {			//Adapter class이용
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
		//	public void mouseReleased(MouseEvent e) {}	//mousePressed만 사용할거지만 나머지도 모두 overriding해야 한다.
		//	public void mouseEntered(MouseEvent e) {}
		//	public void mouseExited(MouseEvent e) {}
		//	public void mouseClicked(MouseEvent e) {}
		});
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}
public class MyFrame extends JFrame {
	public MyFrame() {
		add(new MyPanel());
		setSize(300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
