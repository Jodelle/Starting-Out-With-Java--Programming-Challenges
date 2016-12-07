package chapter7PCGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PropertyTax extends JFrame {
	JPanel panel;
	JLabel label;
	JTextField textfield;
	JButton calcBtn;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 400;
	double assessmentValue = 0.60;
	//the property tax is $0.64 for each $100
	int valueOfTheLand = 0;
	
	
	public PropertyTax(){
		setTitle("Property Tax");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Land's value");
		textfield = new JTextField(10);
		calcBtn = new JButton("Calculate tax and assessment value");
		panel = new JPanel();
		panel.add(label);
		panel.add(textfield);
		panel.add(calcBtn);
		
		calcBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				valueOfTheLand = Integer.parseInt(textfield.getText());
				double propertyTax = 0.0;
				propertyTax = 0.64 * ((valueOfTheLand *  assessmentValue)/ 100);
				JOptionPane.showMessageDialog(null, "Assessment value is $" + (int)(valueOfTheLand * assessmentValue) +
											  " And the Property Tax is " + propertyTax);
				
				//System.exit(0);
				
			}
			
		});
				
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new PropertyTax();
	}

}
