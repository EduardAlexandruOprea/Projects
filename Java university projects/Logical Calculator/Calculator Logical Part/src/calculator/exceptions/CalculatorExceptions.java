package calculator.exceptions;

import calculator.solver.ButtonFunctions;
import calculator.gui.GUIForCalculator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CalculatorExceptions extends Exception
{
	public CalculatorExceptions() 
	{
		super();

		ButtonFunctions.clear();

		GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()]=null;

		JOptionPane.showMessageDialog(new JFrame(), "The denominator cannot be 0!", "Error", JOptionPane.ERROR_MESSAGE);
	}
}

