package sg.com.java.jinjie.gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest {
	public static void createAndShowGUI(){
		JFrame frame = new JFrame("HelloWorld");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("click me");
		JButton b2 = new JButton("shit");
		
		cp.add(b1);
		cp.add(b2);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		Runnable tr = new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		};
		javax.swing.SwingUtilities.invokeLater(tr);
	}
}
