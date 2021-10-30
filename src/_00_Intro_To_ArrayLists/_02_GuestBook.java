package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//SKIP

public class _02_GuestBook implements ActionListener {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	
	ArrayList<String> guestBook = new ArrayList<String>();
	JFrame frame;
	JPanel panel;
	JButton addButton;
	JButton viewButton;
	
	public static void main(String[] args) {
		
	}
	
	public void run() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("GuestBook");
		
		panel = new JPanel();
		frame.add(panel);
		
		addButton = new JButton();
		panel.add(addButton);
		addButton.setText("Add Name");
		addButton.addActionListener(this);
		
		viewButton = new JButton();
		panel.add(viewButton);
		viewButton.setText("View Names");
		viewButton.addActionListener(null);
		
		guestBook.add("Bob Banders");
		guestBook.add("Sandy Summers");
		guestBook.add("Greg Ganders");
		guestBook.add("Donny Doners");	
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	



}
