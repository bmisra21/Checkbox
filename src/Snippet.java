
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class Snippet implements ActionListener
{
	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame("My first frame");
		myFrame.setBounds(400,400,600,300);
		myFrame.setLayout(null);
		
		JLabel label1 = new JLabel("Name: ");
		label1.setBounds(10,10,200,30);
		myFrame.add(label1);
		
		JLabel label2 = new JLabel("Number: ");
		label2.setBounds(10,75,200,30);
		myFrame.add(label2);
		
		JTextField name = new JTextField();
		name.setBounds(230, 10, 200, 30);
		myFrame.add(name);
		
		JTextField num = new JTextField();
		num.setBounds(230, 75, 200, 30);
		myFrame.add(num);
		
		
		JButton button1 = new JButton("Pull info");
		button1.setBounds(10,110, 100, 30);
		button1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						label1.setText("Name: " +  name.getText());
						label2.setText("Number: " + num.getText());
						name.setText("");
						num.setText("");
					}

				}); 
		buttonListener listener = new buttonListener();
		myFrame.add(button1);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
