package chapter7PCGUI;
import javax.swing.*;
public class LabelPanel extends JPanel {
	JLabel label;
	
	public LabelPanel(){
		label = new JLabel("Welcome To Joe's Automotive");
		add(label);
	}

}
