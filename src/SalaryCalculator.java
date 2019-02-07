import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SalaryCalculator {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame("My first frame");
		myFrame.setBounds(400,400,600,300);
		myFrame.setLayout(null);
		
		JLabel label1 = new JLabel("Hourly Rate: ");
		label1.setBounds(10,10,200,30);
		myFrame.add(label1);
		
		JLabel label2 = new JLabel("Hours/Week: ");
		label2.setBounds(10,75,200,30);
		myFrame.add(label2);
		
		JLabel salary = new JLabel("Annual Salary: $");
		salary.setBounds(130, 150, 300, 25);
		myFrame.add(salary);
		
		JTextField rate = new JTextField();
		rate.setBounds(100, 10, 200, 30);
		myFrame.add(rate);
		
		JTextField weeks = new JTextField();
		weeks.setBounds(100, 75, 200, 30);
		myFrame.add(weeks);
		
		JCheckBox box  = new JCheckBox("Full Time", false);
		box.setBounds(10, 120, 125, 25 );
		myFrame.add(box);
		
		
		
		JButton button1 = new JButton("Calculate");
		button1.setBounds(10,150, 100, 30);
		button1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if (box.isSelected())
						{
							double annualSal = Double.parseDouble(rate.getText()) * 40 * 52;
							NumberFormat formatter = NumberFormat.getCurrencyInstance();
							salary.setText("Annual Salary: " + formatter.format(annualSal));
							rate.setText("");
							weeks.setText("");
						}
						else
						{
							double annualSal = Double.parseDouble(rate.getText()) * Double.parseDouble(weeks.getText()) * 52;
							NumberFormat formatter = NumberFormat.getCurrencyInstance();
							salary.setText("Annual Salary: " + formatter.format(annualSal));
							rate.setText("");
							weeks.setText("");
						}
					}

				}); 
		buttonListener listener = new buttonListener();
		myFrame.add(button1);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
