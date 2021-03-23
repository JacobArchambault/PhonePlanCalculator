package com.jacobarchambault.phoneplancalculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * This program demonstrates a solution to the Long Distance Calls programming
 * challenge.
 */
public class PhonePlanCalculator extends JFrame {
	/**
	 * CalcButtonListener is an action listener class for the calcButton component.
	 */
	private class CalcButtonListener implements ActionListener {
		/**
		 * actionPerformed method
		 * 
		 * @param e An ActionEvent object.
		 */
		@Override
		public void actionPerformed(
				ActionEvent e) {
			JOptionPane.showMessageDialog(
					null,
					String.format(
							"Total Charges: $%,.2f",
							minutesPanel.getCharges(
									ratePanel.getRate())));
		}
	} // End of inner class

	/**
	 * ExitButtonListener is an action listener class for the exitButton component.
	 */
	private class ExitButtonListener implements ActionListener {
		/**
		 * actionPerformed method
		 * 
		 * @param e An ActionEvent object.
		 */
		@Override
		public void actionPerformed(
				ActionEvent e) {
			System.exit(
					0);
		}
	} // End of inner class

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(
			String[] args) {
		new PhonePlanCalculator();

	}

	private JPanel buttonPanel; // A panel for the buttons
	private JButton calcButton; // Calculates everything

	private JButton exitButton; // Exits the application

	private MinutesPanel minutesPanel; // A panel for minutes

	private RatePanel ratePanel; // A panel for rates

	/**
	 * Constructor
	 */
	public PhonePlanCalculator() {
		// Display a title.
		setTitle(
				"Long Distance Charges");
		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(
				WindowConstants.EXIT_ON_CLOSE);
		// Create a RatePanel object.
		ratePanel = new RatePanel();
		// Create a MinutesPanel object.
		minutesPanel = new MinutesPanel();
		// Build the panel that contains the buttons.
		buildButtonPanel();
		// Add the panels to the content pane.
		add(
				ratePanel,
				BorderLayout.NORTH);
		add(
				minutesPanel,
				BorderLayout.CENTER);
		add(
				buttonPanel,
				BorderLayout.SOUTH);
		// Pack and display the window.
		pack();
		setVisible(
				true);
	}

	/**
	 * The buildButtonPanel method creates a panel containing buttons.
	 */
	private void buildButtonPanel() {
		// Create a button to calculate the charges.
		calcButton = new JButton(
				"Calculate Charges");
		// Add an action listener to the button.
		calcButton.addActionListener(
				new CalcButtonListener());
		// Create a button to exit the application.
		exitButton = new JButton(
				"Exit");
		// Add an action listener to the button.
		exitButton.addActionListener(
				new ExitButtonListener());
		// Put the buttons in their own panel.
		buttonPanel = new JPanel();
		buttonPanel.add(
				calcButton);
		buttonPanel.add(
				exitButton);
	}

}
