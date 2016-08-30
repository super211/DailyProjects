package sg.com.java.jinjie.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class SwingTest2 {
	public static void createAndShowGUI() {
		JFrame frame = new JFrame("HelloWorld");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cp = frame.getContentPane();
		cp.setLayout(new GridLayout(0, 2));

		JButton button = new JButton("click me");
		JLabel label = new JLabel("OK");

		JPanel panel1 = new JPanel(new BorderLayout());
		JPanel panel2 = new JPanel(new BorderLayout());
		panel2.setBackground(Color.red);

		panel1.add(button, BorderLayout.CENTER);
		cp.add(panel1);
		panel2.add(label, BorderLayout.EAST);
		cp.add(panel2);
		
		String[] lines = {"a", "b", "c"};
		JList list = new JList(lines);
		cp.add(list);

		cp.add(new JCheckBox());

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
