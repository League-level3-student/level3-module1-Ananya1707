package _05_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
    /* 
     * Crate a HashMap of Integers for the keys and Strings for the values.
     * Create a GUI with three buttons. 
     * Button 1: Add Entry
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      After an ID is entered, use another input dialog to ask the user
     *      to enter a name. Add this information as a new entry to your
     *      HashMap.
     * 
     * Button 2: Search by ID
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      If that ID exists, display that name to the user.
     *      Otherwise, tell the user that that entry does not exist.
     * 
     * Button 3: View List
     *      When this button is clicked, display the entire list in a message
     *      dialog in the following format:
     *      ID: 123  Name: Harry Howard
     *      ID: 245  Name: Polly Powers
     *      ID: 433  Name: Oliver Ortega
     *      etc...
     * 
     * When this is complete, add a fourth button to your window.
     * Button 4: Remove Entry
     *      When this button is clicked, prompt the user to enter an ID using
     *      an input dialog.
     *      If this ID exists in the HashMap, remove it. Otherwise, notify the
     *      user that the ID is not in the list. 
     */
	
    HashMap<Integer, String> rosterOfIDs = new HashMap<Integer, String>();
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	
	public static void main(String[] args) {
		_02_LogSearch l = new _02_LogSearch();
		l.run();
	}
	
	public void run(){
		frame = new JFrame();
		frame.setVisible(true);
		
		panel = new JPanel();
		frame.add(panel);
		
		button1 = new JButton();
		panel.add(button1);
		button1.addActionListener(this);
		button1.setText("Add Entry");
		
		button2 = new JButton();
		panel.add(button2);
		button2.addActionListener(this);
		button2.setText("Search by ID");
		
		button3 = new JButton();
		panel.add(button3);
		button3.addActionListener(this);
		button3.setText("View List");
		
		button4 = new JButton();
		panel.add(button4);
		button4.addActionListener(this);
		button4.setText("Remove Entry");
		
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			String ID = JOptionPane.showInputDialog(null, "Enter an ID number:");
			String name = JOptionPane.showInputDialog(null, "Enter a name:");
			
			rosterOfIDs.put(Integer.parseInt(ID),name);
			
		}
		
		if(e.getSource() == button2) {
			String numID = JOptionPane.showInputDialog(null, "Enter an ID number:");
			int intID = Integer.parseInt(numID);

	        if(rosterOfIDs.containsKey(intID)) {
	        	JOptionPane.showMessageDialog(null, rosterOfIDs.get(intID));
	        }	
	        else {
	        	JOptionPane.showMessageDialog(null, "entry does not exist" );
	        }
		}
		
		if(e.getSource() == button3) {
			String string = "";
			for(Integer i : rosterOfIDs.keySet()){
	            string = string + "ID: " + i + "  Name: " + rosterOfIDs.get(i) + "\n";
	        }
			
			JOptionPane.showMessageDialog(null, string);
	        	
		}
		
		if(e.getSource() == button4) {
			String removeID = JOptionPane.showInputDialog(null, "Enter an ID number:");
			int id = Integer.parseInt(removeID);

	        if(rosterOfIDs.containsKey(id)) {
	        	rosterOfIDs.remove(id);
	        	JOptionPane.showMessageDialog(null, "ID: " + id + " was removed" );

	        }	
	        else {
	        	JOptionPane.showMessageDialog(null, "entry does not exist" );
	        }
	        	
		}
		
	}

}
