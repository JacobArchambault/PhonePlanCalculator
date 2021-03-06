package com.jacobarchambault.phoneplancalculator;

import java.awt.BorderLayout;

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
	 *
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel buttonPanel = new JPanel(); // A panel for the buttons
	private final JButton calcButton = new JButton(
			"Calculate Charges"); // Calculates everything
	private final MinutesPanel minutesPanel = new MinutesPanel(); // A panel for minutes
	private final RatePanel ratePanel = new RatePanel(); // A panel for rates

	/**
	 * Constructor
	 */
	public PhonePlanCalculator(
			final String title) {
		super(
				title);
		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(
				WindowConstants.EXIT_ON_CLOSE);
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
		// Add an action listener to the button.
		calcButton.addActionListener(
				e -> JOptionPane.showMessageDialog(
						null,
						String.format(
								"Total Charges: $%,.2f",
								minutesPanel.getCharges(
										ratePanel.getRate()))));
		// Put the buttons in their own panel.
		buttonPanel.add(
				calcButton);
	}

}
