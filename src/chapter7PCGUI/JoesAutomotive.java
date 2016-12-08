package chapter7PCGUI;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JoesAutomotive extends JFrame {
	JPanel panel;
	JLabel label;
	JTextField textfield;
	JButton calcBtn;
	ButtonGroup btnGroup;
	JCheckBox oilChange;
	JCheckBox lubeJob;
	JCheckBox radiatorFlush;
	JCheckBox transmissionFlush;
	JCheckBox inspection;
	JCheckBox mufflerReplacement;
	JCheckBox tireRotation;
	JSlider hoursSlider;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 400;
	int hour = 1;
	int labor = 20 * hour;
	public final double OIL_CHANGE = 26.00;
	public final double LUBE_JOB = 18.00;
	public final double RADIATOR_FLUSH = 30.00;
	public final double TRANSMISSION_FLUSH = 80.00;
	public final double INSPECTION = 15.00;
	public final double MUFFLER_REPLACEMENT = 100.00;
	public final double TIRE_ROTATION = 100.00;
	
	public JoesAutomotive(){
		setTitle("Welcome To Joe's Automotive");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Land's value");
		textfield = new JTextField("hours worked on vehicle",10);
		oilChange = new JCheckBox("Oil Change");
		lubeJob = new JCheckBox("Lube Job");
		radiatorFlush = new JCheckBox("Radiator Flush");
		transmissionFlush = new JCheckBox("Transmission Flush");
		inspection = new JCheckBox("Inspection");
		mufflerReplacement = new JCheckBox("Muffler Replacement");
		tireRotation = new JCheckBox("Tire Rotation");
		calcBtn = new JButton("Calculate cost of reparation");
		//hoursSlider = new JSlider(JSlider.HORIZONTAL, 1, 100);
		panel = new JPanel();
		panel.add(label, BorderLayout.NORTH);
		panel.add(textfield, BorderLayout.EAST);
		panel.add(oilChange, BorderLayout.WEST);
		panel.add(lubeJob);
		panel.add(radiatorFlush);
		panel.add(transmissionFlush);
		panel.add(inspection);
		panel.add(mufflerReplacement);
		panel.add(tireRotation);
		panel.add(calcBtn, BorderLayout.CENTER);
		panel.setBorder(BorderFactory.createTitledBorder("Maintenance Service"));
		calcBtn.addActionListener(new CalcButtonListener());
		
		add(panel);
		setVisible(true);
	}
	private class CalcButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			double total = 0.0;
			
		}
		
	}


	public static void main(String[] args) {
		new JoesAutomotive();

	}

}
