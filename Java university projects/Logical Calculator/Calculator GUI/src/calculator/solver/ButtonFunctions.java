package calculator.solver;

import calculator.exceptions.CalculatorExceptions;
import calculator.gui.GUIForCalculator;

import java.util.EmptyStackException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ButtonFunctions
{

	public static void clear()
		{

			for(int i = 0; i < GUIForCalculator.getPostfixArray().length; i++)
				GUIForCalculator.getPostfixArray()[i] = null;
			for(int j = 0; j < GUIForCalculator.getInfixArray().length; j++)
				GUIForCalculator.getInfixArray()[j]=null;
			

			GUIForCalculator.getTextField().setText("");
			GUIForCalculator.setElements("");
			GUIForCalculator.setButtonLabel("");
			GUIForCalculator.setInfixArrayCount(0);
			GUIForCalculator.setPostfixArrayCount(0);
		}
	
	// BACKSPACE BUTTON
	public static void backspace()
		{
		try	// if there are characters to be deleted it will delete the last one
			{
				String theText = GUIForCalculator.getTextField().getText();
				GUIForCalculator.getTextField().setText(theText.substring(0, theText.length()-2));

				GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()] =
				GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()].substring(0, GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()].length()-1);

				GUIForCalculator.setElements(GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()]);
			}

		catch(StringIndexOutOfBoundsException errorString )
			{
				try
					{
						GUIForCalculator.setInfixArrayCount(GUIForCalculator.getInfixArrayCount() - 1);

						GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()] =
						GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()].substring(0, GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()].length()-1);

						GUIForCalculator.setElements(GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()]);
					}

				catch(ArrayIndexOutOfBoundsException errorArray)
					{
						clear();
					}
			}

		catch(NullPointerException signError)
			{
				GUIForCalculator.setInfixArrayCount(GUIForCalculator.getInfixArrayCount() - 1);

				GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()] =
				GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()].substring(0, GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()].length()-1);
			}
		}
	

	public static void operandButton()
		{
			GUIForCalculator.setElements(GUIForCalculator.getElements() + GUIForCalculator.getButtonLabel());
			GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()] = GUIForCalculator.getElements();
		}
	
	// NEGATIVE button
	public static void negativeSign()
		{
			if(GUIForCalculator.getElements().equals(""))
				{
					GUIForCalculator.setElements(GUIForCalculator.getElements() + "-");
					GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()] = GUIForCalculator.getElements();
				}
			else
				{

					JOptionPane.showMessageDialog(new JFrame(), "You can not use the NEGATIVE sign for substraction!", "Calculation Error", JOptionPane.ERROR_MESSAGE);

					clear();
				}
		}

	// OPERATORS BUTTONS
	public static void operatorButton()
		{ 
			GUIForCalculator.setInfixArrayCount(GUIForCalculator.getInfixArrayCount() + 1);

			GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()] = GUIForCalculator.getButtonLabel();

			GUIForCalculator.setElements("");

			GUIForCalculator.setInfixArrayCount(GUIForCalculator.getInfixArrayCount() + 1);
		}
	
	// EQUAL BUTTON
	public static void equal()
		{
			if(GUIForCalculator.getInfixArray()[0]==null)
				{
						GUIForCalculator.getInfixArray()[0]="0";

						GUIForCalculator.getTextField().setText("0" + GUIForCalculator.getTextField().getText());
				}

			GUIForCalculator.setPostfixArrayCount(ArithmeticOperations.postfixStack(GUIForCalculator.getPostfixArray(), GUIForCalculator.getInfixArray(), GUIForCalculator.getInfixArrayCount()));
			try 
				{
					String total = ArithmeticOperations.result(GUIForCalculator.getPostfixArray(), GUIForCalculator.getPostfixArrayCount());
					

					if(ArithmeticOperations.theNumberIsADouble(total))
						{

							GUIForCalculator.getTextField().setText(total);

							GUIForCalculator.setInfixArrayCount(0);

							GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()] = total;
							

							try {
									if(Double.parseDouble(GUIForCalculator.getInfixArray()[0])==Double.POSITIVE_INFINITY || Double.parseDouble(GUIForCalculator.getInfixArray()[0])==Double.NEGATIVE_INFINITY
											||Double.isNaN(Double.parseDouble(GUIForCalculator.getInfixArray()[0])) )
										throw new CalculatorExceptions();
								}
							
							catch(CalculatorExceptions InfinityResult)
								{
									System.out.println("Division by 0, handeled"); // TEST - CONSOLE READING
								}
						}
					// BIG DECIMAL
					else if(ArithmeticOperations.isBigDecimal(total))
					{
							GUIForCalculator.getTextField().setText(total);
							GUIForCalculator.setInfixArrayCount(0);
							GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()] = total;
						}
					// INTEGER
					else
						{
							total = total.substring(0, total.indexOf('.'));
							GUIForCalculator.getTextField().setText(total);
							GUIForCalculator.setInfixArrayCount(0);
							GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()] = total;
						}
				}
			
			// INVALID INPUT
			catch(EmptyStackException tooManySymbols)
				{
					GUIForCalculator.getTextField().setText("Invalid input");
					JOptionPane.showMessageDialog(new JFrame(), "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);

					ButtonFunctions.clear();
				}

			catch(StringIndexOutOfBoundsException pressingEqualWithNoOP)
				{
					GUIForCalculator.getTextField().setText("Invalid input");
					JOptionPane.showMessageDialog(new JFrame(), "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);

					ButtonFunctions.clear();
				}
		}
	
	// MULTIPLE DECIMAL POINTS
	public static void checkDecimalPoint()
		{	
			if(GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()]!=null)
			{
					if(GUIForCalculator.getInfixArray()[GUIForCalculator.getInfixArrayCount()].contains("."))
						{
							String theText = GUIForCalculator.getTextField().getText();
							GUIForCalculator.getTextField().setText(theText.substring(0, theText.length()-1));
							System.out.println("Decimal point ignored"); // TEST - CONSOLE READING
						}
					else
						operandButton();
				}
			else
				{
					String theText = GUIForCalculator.getTextField().getText();
					GUIForCalculator.getTextField().setText(theText.substring(0, theText.length()-1));
					System.out.println("Decimal point ignored"); // TEST - CONSOLE READING
				}
		}
}