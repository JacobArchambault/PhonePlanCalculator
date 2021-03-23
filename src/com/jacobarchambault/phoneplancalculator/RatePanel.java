package com.jacobarchambault.phoneplancalculator;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RatePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private final ButtonGroup bg = new ButtonGroup();
	private final double DAYTIME_RATE = 0.07;
	private final JRadioButton daytime = new JRadioButton(
			String.format(
					"Daytime ($%,.2f) per minute",
					DAYTIME_RATE),
			true);
	private final double EVENING_RATE = 0.12;
	private final JRadioButton evening = new JRadioButton(
			String.format(
					"Evening ($%,.2f) per minute",
					EVENING_RATE));
	private final double OFF_PEAK_RATE = 0.05;
	private final JRadioButton offPeak = new JRadioButton(
			String.format(
					"Off-Peak ($%,.2f) per minute",
					OFF_PEAK_RATE));

	public RatePanel() {
		bg.add(
				daytime);
		bg.add(
				evening);
		bg.add(
				offPeak);
		setLayout(
				new GridLayout(
						3,
						1));
		setBorder(
				BorderFactory.createTitledBorder(
						"Select a Rate Category"));
		add(
				daytime);
		add(
				evening);
		add(
				offPeak);
	}

	/**
	 * The getRate method returns the rate for the selected rate category.
	 *
	 * @return One of the constants DAYTIME_RATE, EVENING_RATE, or OFF_PEAK_RATE.
	 */
	public double getRate() {
		var rate = 0.0;
		if (daytime.isSelected()) {
			rate = DAYTIME_RATE;
		} else if (evening.isSelected()) {
			rate = EVENING_RATE;
		} else if (offPeak.isSelected()) {
			rate = OFF_PEAK_RATE;
		}
		return rate;
	}

}
