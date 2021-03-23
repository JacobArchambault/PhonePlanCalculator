package com.jacobarchambault.phoneplancalculator;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The MinutesPanel class for use with the Long Distance Calls programming
 * challenge.
 */
public class MinutesPanel extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private final JTextField minutes = new JTextField(
			10); // To get minutes

	/**
	 * Constructor
	 */
	public MinutesPanel() {
		// Create a GridLayout manager.
		setLayout(
				new GridLayout(
						1,
						2));
		// Create a border.
		setBorder(
				BorderFactory.createTitledBorder(
						"Time of Call"));
		// Add the labels and text fields to this panel.
		add(
				new JLabel(
						"Minutes:"));
		add(
				minutes);
	}

	/**
	 * The getCharges method uses the specified rate to calculate the charges for
	 * the number of minutes entered.
	 *
	 * @param rate The per-minute rate.
	 * @return The charges for the number of minutes used.
	 */
	public double getCharges(
			final double rate) {
		return Double.parseDouble(
				minutes.getText()) * rate;
	}
}
