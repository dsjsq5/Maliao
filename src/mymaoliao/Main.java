package mymaoliao;

import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JFrame;

public class Main extends JFrame {
	private int height = 600;
	private int width = 800;
	
	
	void initialize(){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int screenHeight = toolkit.getScreenSize().height;
		int screenWidth = toolkit.getScreenSize().width;
		setSize(width, height);
		setLocation((screenWidth/2 - width/2), (screenHeight/2 - height/2 - 30));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.initialize();
	}
}
