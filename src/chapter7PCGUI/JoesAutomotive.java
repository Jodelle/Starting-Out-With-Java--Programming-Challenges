package chapter7PCGUI;
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
	JCheckBox muffleReplacement;
	JCheckBox tireRotation;
	int hour = 0;
	int laber = 20 * hour;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 400;
	
	public JoesAutomotive(){
		setTitle("Welcome To Joe's Automotive");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Land's value");
		textfield = new JTextField("hours worked on vehicle",10);
		calcBtn = new JButton("Calculate cost of reparation");
		panel = new JPanel();
		panel.add(label);
		panel.add(textfield);
		panel.add(calcBtn);
		
		add(panel);
		setVisible(true);
	}


	public static void main(String[] args) {
		new JoesAutomotive();

	}

}
