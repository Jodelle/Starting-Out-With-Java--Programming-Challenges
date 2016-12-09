package chapter7PCGUI;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class NonRoutineServicesPanel extends JPanel{
	public JSlider numOfHours;
	private JLabel labelHours;
	
	public NonRoutineServicesPanel(){
		labelHours = new JLabel("Hours worked on nonroutine Services");
		numOfHours = new JSlider(1, 24, 1);
		numOfHours.setMinorTickSpacing(1);
		numOfHours.setMajorTickSpacing(10);
		numOfHours.setPaintTicks(true);
		numOfHours.setPaintLabels(true);
		numOfHours.addChangeListener(new HourSlider());
		add(labelHours);
		add(numOfHours);
	}
	
	public class HourSlider implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			if(e.getSource() == numOfHours){
				labelHours.setToolTipText("How many worked " + numOfHours.getValue());
			}
		}
		
	}

}
