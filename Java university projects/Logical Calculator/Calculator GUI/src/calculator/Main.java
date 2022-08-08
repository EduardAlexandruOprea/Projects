package calculator;

import calculator.gui.GUIForCalculator;

import javax.swing.JFrame;

public class Main
{
	public static void main(String[] args) 
	{
		GUIForCalculator myWindow = new GUIForCalculator();
		myWindow.setLocation(400, 200);
		myWindow.setVisible(true);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
