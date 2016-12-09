package chapter7PCGUI;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class JoesAutomotive extends JFrame {
	private LabelPanel label;
	private ServicesPanel services;
	private NonRoutineServicesPanel nonroutineServices;
	private JPanel panel;
	private NonRoutineServicesPanel.HourSlider hourSlider;
	JTextField textfield;
	JButton calcBtn;
	JSlider hoursSlider;
	int labor = 20;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 400;

	
	public JoesAutomotive(){
		setTitle("Welcome To Joe's Automotive");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		label = new LabelPanel();
		services = new ServicesPanel();
		nonroutineServices = new NonRoutineServicesPanel();
		hourSlider = nonroutineServices.new HourSlider(); 
		//hoursSlider = new JSlider(JSlider.HORIZONTAL, 1, 100);
		
		buildPanel();
		add(label, BorderLayout.NORTH);
		add(services, BorderLayout.CENTER);
		//add(nonroutineServices, BorderLayout.WEST);
		add(panel, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	private void buildPanel(){
		panel = new JPanel();
		calcBtn = new JButton("Calculate cost of reparation");
		calcBtn.addActionListener(new CalcButtonListener());
		panel.add(calcBtn);
	}
	private class CalcButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent ae) {
			double total = 0.0;
			//int hours = nonroutineServices.numOfHours;
			//double nonroutineTotal = hours  * labor;
			total = services.getServicesCost();
			DecimalFormat dollar = new DecimalFormat("0.00");
			JOptionPane.showMessageDialog(null, "Your Total is $ " + dollar.format(total));
			
		}
		
	}


	public static void main(String[] args) {
		new JoesAutomotive();

	}

}
