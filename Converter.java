//Bilal Sayed Project 3 7/7/18
import java.awt.event.*;
import javax.swing.*;

class Converter extends JPanel implements ActionListener{
	
	JLabel label;
	JTextField text;
	JButton button;
	JLabel output;
	 
    Converter() {
    	setLayout(null);
    	
    	label = new JLabel("Enter Temperature:");
    	label.setBounds(20, 10, 150, 20);
    	
    	text = new JTextField();
    	text.setBounds(20, 30, 115, 20);
    	
    	button = new JButton("Convert");
    	button.setBounds(20, 60, 115, 30);
    	
    	output = new JLabel();
    	output.setBounds(20, 80, 150, 50);
    	
    	add(label);
        add(text);
        add(button);
        add(output);
        button.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent Convert) {
    	
    	 if (Convert.getSource() == button) {
    		 int textValue = Integer.parseInt(text.getText());
    		 String outputValue = String.valueOf(((textValue) - 32) * 5/9) + " degrees Celcius";
    		 output.setText(String.valueOf(outputValue));
    	 }
    	
    }
}