package chapter7PCGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RetailPrice extends JFrame {
	JPanel panel;
	JButton calcBtn;
	JLabel labelWholeSale;
	JLabel labelMarkupPercentage;
	JTextField txtCost;
	JTextField txtPercentage;
	int retailPrice;
	
	private final static int WINDOW_WIDTH = 400;
	private final static int WINDOW_HEIGHT = 400;
	
	public RetailPrice(){
		setTitle("Retail Price Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		//centers the frame window
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		labelWholeSale = new JLabel("Item Wholesale cost");
		txtCost = new JTextField(10);
		labelMarkupPercentage = new JLabel("Item Markup Percentage");
		txtPercentage = new JTextField(10);
		
		calcBtn = new JButton("Calculate Retail Price");
		calcBtn.addActionListener(new CalculateBtnListener());
		panel = new JPanel();
		panel.add(labelWholeSale);
		panel.add(txtCost);
		panel.add(labelMarkupPercentage);
		panel.add(txtPercentage);
		panel.add(calcBtn);
		add(panel);
		setVisible(true);
		
	}
	private class CalculateBtnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int wholesaleSaleCost = Integer.parseInt(txtCost.getText());
			double markupPercentage = Double.parseDouble(txtPercentage.getText())/100;
			//need to double check the formula below
			retailPrice = (int) (wholesaleSaleCost * markupPercentage) * 2;
			
			JOptionPane.showMessageDialog(null, "Retail Price is : $ " + retailPrice);
			
		}
		
	}

	public static void main(String[] args) {
		new RetailPrice();

	}

}
