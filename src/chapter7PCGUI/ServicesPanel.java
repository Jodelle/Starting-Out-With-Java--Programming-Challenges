package chapter7PCGUI;
import java.awt.GridLayout;

import javax.swing.*;
public class ServicesPanel extends JPanel {
	
	public final double OIL_CHANGE = 26.00;
	public final double LUBE_JOB = 18.00;
	public final double RADIATOR_FLUSH = 30.00;
	public final double TRANSMISSION_FLUSH = 80.00;
	public final double INSPECTION = 15.00;
	public final double MUFFLER_REPLACEMENT = 100.00;
	public final double TIRE_ROTATION = 20.00;
	
	JCheckBox oilChange;
	JCheckBox lubeJob;
	JCheckBox radiatorFlush;
	JCheckBox transmissionFlush;
	JCheckBox inspection;
	JCheckBox mufflerReplacement;
	JCheckBox tireRotation;
	
	public ServicesPanel(){
		setLayout(new GridLayout(4, 1));
		
		oilChange = new JCheckBox("Oil Change");
		lubeJob = new JCheckBox("Lube Job");
		radiatorFlush = new JCheckBox("Radiator Flush");
		transmissionFlush = new JCheckBox("Transmission Flush");
		inspection = new JCheckBox("Inspection");
		mufflerReplacement = new JCheckBox("Muffler Replacement");
		tireRotation = new JCheckBox("Tire Rotation");
		
		setBorder(BorderFactory.createTitledBorder("Maintenace Services"));
		add(oilChange);
		add(lubeJob);
		add(radiatorFlush);
		add(transmissionFlush);
		add(inspection);
		add(mufflerReplacement);
		add(tireRotation);
		
	}
	
	public double getServicesCost(){
		double servicesCost = 0.0;
		if(oilChange.isSelected())
			servicesCost += OIL_CHANGE;
		if(lubeJob.isSelected())
			servicesCost += LUBE_JOB;  
		if(radiatorFlush.isSelected())
			servicesCost += RADIATOR_FLUSH;  
		if(transmissionFlush.isSelected())
			servicesCost += TRANSMISSION_FLUSH;  
		if(inspection.isSelected())
			servicesCost += INSPECTION;  
		if(mufflerReplacement.isSelected())
			servicesCost += MUFFLER_REPLACEMENT;  
		if(tireRotation.isSelected())
			servicesCost += TIRE_ROTATION;  
		return servicesCost;
	}

}
