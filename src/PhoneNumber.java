

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Phonenumber");
		frame.setBounds(400,400,600,300);
		frame.setLayout(null);
		
		JTextField name = new JTextField();
		name.setBounds(300,50,200,30);
		frame.add(name);
		
		JTextField number = new JTextField();
		number.setBounds(300,150,200,30);
		frame.add(number);
		
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(10,50,200,30);
		frame.add(nameLabel);
		
		JLabel numLabel = new JLabel("Number:");
		numLabel.setBounds(10,150,200,30);
		frame.add(numLabel);
		
		JButton submit = new JButton("Submit:");
		submit.setBounds(300,90,200,50);
		frame.add(submit);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameLabel.setText("Name: " + name.getText());
				numLabel.setText("Number: " + number.getText());
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
