package chapter7PCGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MonthlySalesTax extends JFrame {
	
	JPanel panel;
	JTextField totalMonthlySales;
	JLabel label;
	double countyTaxRate = 0.02;
	double stateTaxRate = 0.04;
	double totalSalesTax;
	JButton calculateBtn;
	private final int WINDOW_WIDTH = 350;
	private final int WINDOW_HEIGHT = 200;
	
	public MonthlySalesTax(){
		setTitle("Monthly Sales Tax");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Monthly Sales");
		totalMonthlySales = new JTextField(10);
		calculateBtn = new JButton("Caculate Monthly Tax");
		calculateBtn.addActionListener(new CalculateBtnListener());
		panel = new JPanel();
		panel.add(label);
		panel.add(totalMonthlySales);
		panel.add(calculateBtn);
		
		
		//add panel to the content's pane/JFrame
		add(panel);
		
		setVisible(true);
		
	}
	private class CalculateBtnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String txtField = totalMonthlySales.getText();
			double parseTxtField = Double.parseDouble(txtField);
			totalSalesTax = parseTxtField * (countyTaxRate + stateTaxRate);
			
			JOptionPane.showMessageDialog(null, "The total sales of the month without "
					+ 							"taxes is: " + parseTxtField +
					                      		" And The total sales of the month with "
					                      		+ "taxes is: " + totalSalesTax);
						
			
		}
		
	}
	
	public static void main(String[] args){
		new MonthlySalesTax();
	}

}
