package calculator.gui;

import calculator.solver.ButtonFunctions;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUIForCalculator extends JFrame
{	
	// VARIABLES
	// text field
	private static JTextField textField;

	// buttons
	private JButton button;

	// panels;
	private JPanel forText;
	private JPanel mainButtons;
	private JPanel allButtons;
	private JPanel bigPanel;
	private JPanel space;

	// listeners
	private static String buttonLabel = "";
	private static String elements = "";
	
	private static int max = 100; // maximum number of elements input
	
	private static String[] infixArray = new String[getMax()];	// users input
	private static int infixArrayCount = 0;
	
	private static String[] postfixArray = new String[getMax()]; // POSTFIX RESULT
	private static int postfixArrayCount;

	// button listener
	private ButtonListener readLabel = new ButtonListener();

	// constructor GUI
	public GUIForCalculator()
		{
			super("calculator");

			// text field
			setForText(new JPanel());
			setTextField(new JTextField("", 25));

			getTextField().setHorizontalAlignment(JTextField.RIGHT);
			getTextField().setEditable(false);
			getTextField().setBackground(Color.white);
			getTextField().setFont(new Font("Arial", Font.BOLD, 12));
			
			
			getForText().setLayout(new GridLayout(1,1));
			getForText().add(getTextField());
			getForText().setPreferredSize(new Dimension(300,100));
		
			// all buttons
			setMainButtons(new JPanel());
			getMainButtons().setLayout(new GridLayout(6,4,1,1));
			// FIRST ROW
			setSpace(new JPanel());
			getMainButtons().add(getSpace());
			setSpace(new JPanel());
			getMainButtons().add(getSpace());
			setSpace(new JPanel());
			getMainButtons().add(getSpace());
			// delete button -> /u232b is the unicode for backspace symbol
			setButton(new JButton("\u232b"));		// adding the button after the 3 empty spaces
			getButton().addActionListener(getReadLabel());
			getMainButtons().add(getButton());
			getButton().setToolTipText("Backspace");
			getButton().setFont(getButton().getFont().deriveFont(15f));
			// END FIRST ROW			
			
			// adding the main buttons
			// clear button
			setButton(new JButton("C"));
			getButton().addActionListener(getReadLabel());
			getMainButtons().add(getButton());
			getButton().setToolTipText("Clear");
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// parentheses button
			setButton(new JButton("("));
			getButton().addActionListener(getReadLabel());
			getButton().setToolTipText("Open Parenthese");
			getMainButtons().add(getButton());
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// modular button
			setButton(new JButton(")"));
			getButton().addActionListener(getReadLabel());
			getMainButtons().add(getButton());
			getButton().setToolTipText("Close Parenthese");
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// division button
			setButton(new JButton("÷"));
			getButton().addActionListener(getReadLabel());
			getMainButtons().add(getButton());
			getButton().setToolTipText("Division");
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// 7 button
			setButton(new JButton("7"));
			getButton().addActionListener(getReadLabel());
			getButton().setBackground(Color.white);
			getMainButtons().add(getButton());
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// 8 button
			setButton(new JButton("8"));
			getButton().addActionListener(getReadLabel());
			getButton().setBackground(Color.white);
			getMainButtons().add(getButton());
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// 9 button
			setButton(new JButton("9"));
			getButton().addActionListener(getReadLabel());
			getButton().setBackground(Color.white);
			getMainButtons().add(getButton());
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// multiplication button
			setButton(new JButton("*"));
			getButton().addActionListener(getReadLabel());
			getMainButtons().add(getButton());
			getButton().setToolTipText("Multiplication");
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// 4 button
			setButton(new JButton("4"));
			getButton().addActionListener(getReadLabel());
			getButton().setBackground(Color.white);
			getMainButtons().add(getButton());
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// 5 button
			setButton(new JButton("5"));
			getButton().addActionListener(getReadLabel());
			getButton().setBackground(Color.white);
			getMainButtons().add(getButton());
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// 6 button
			setButton(new JButton("6"));
			getButton().addActionListener(getReadLabel());
			getButton().setBackground(Color.white);
			getMainButtons().add(getButton());
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// subtraction button
			setButton(new JButton("-"));
			getButton().addActionListener(getReadLabel());
			getMainButtons().add(getButton());
			getButton().setToolTipText("Subtraction");
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// 1 button
			setButton(new JButton("1"));
			getButton().addActionListener(getReadLabel());
			getButton().setBackground(Color.white);
			getMainButtons().add(getButton());
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// 2 button
			setButton(new JButton("2"));
			getButton().addActionListener(getReadLabel());
			getButton().setBackground(Color.white);
			getMainButtons().add(getButton());
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// 3 button
			setButton(new JButton("3"));
			getButton().addActionListener(getReadLabel());
			getButton().setBackground(Color.white);
			getMainButtons().add(getButton());
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// + button
			setButton(new JButton("+"));
			getButton().addActionListener(getReadLabel());
			getMainButtons().add(getButton());
			getButton().setToolTipText("Addition");
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// negative button
			setButton(new JButton("\u2212"));
			getButton().addActionListener(getReadLabel());
			getMainButtons().add(getButton());
			getButton().setToolTipText("Negative Number");
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// 0 button
			setButton(new JButton("0"));
			getButton().addActionListener(getReadLabel());
			getMainButtons().add(getButton());
			getButton().setBackground(Color.white);
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// decimal point button
			setButton(new JButton("."));
			getButton().addActionListener(getReadLabel());
			getMainButtons().add(getButton());
			getButton().setToolTipText("Decimal Point");
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// equal button
			setButton(new JButton("="));
			getButton().addActionListener(getReadLabel());
			getButton().setBackground(Color.gray);
			getMainButtons().add(getButton());
			getButton().setToolTipText("Equal");
			getButton().setFont(getButton().getFont().deriveFont(20f));
			// set the dimensions to the button's panel
			getMainButtons().setPreferredSize(new Dimension(300,300));
			


			// the panel for all panels with buttons
			setAllButtons(new JPanel());
			getAllButtons().setLayout(new BorderLayout());
			getAllButtons().add(getMainButtons(), BorderLayout.NORTH);

			// adding all panels to the main panel
			setBigPanel(new JPanel());
			getBigPanel().setLayout(new BorderLayout());
			getBigPanel().add(getForText(), BorderLayout.NORTH);
			getBigPanel().add(getAllButtons(), BorderLayout.SOUTH);
			
			// add the big panel to the frame;
			setLayout(new FlowLayout(FlowLayout.CENTER));
			add(getBigPanel());
			pack();
		} // end GUI

	public static String[] getInfixArray() {
		return infixArray;
	}

	public static void setInfixArray(String[] infixArray) {
		GUIForCalculator.infixArray = infixArray;
	}

	public static int getInfixArrayCount() {
		return infixArrayCount;
	}

	public static void setInfixArrayCount(int infixArrayCount) {
		GUIForCalculator.infixArrayCount = infixArrayCount;
	}

	public static String[] getPostfixArray() {
		return postfixArray;
	}

	public static void setPostfixArray(String[] postfixArray) {
		GUIForCalculator.postfixArray = postfixArray;
	}

	public static int getPostfixArrayCount() {
		return postfixArrayCount;
	}

	public static void setPostfixArrayCount(int postfixArrayCount) {
		GUIForCalculator.postfixArrayCount = postfixArrayCount;
	}

	public static JTextField getTextField() {
		return textField;
	}

	public static void setTextField(JTextField textField) {
		GUIForCalculator.textField = textField;
	}

	public static String getButtonLabel() {
		return buttonLabel;
	}

	public static void setButtonLabel(String buttonLabel) {
		GUIForCalculator.buttonLabel = buttonLabel;
	}

	public static String getElements() {
		return elements;
	}

	public static void setElements(String elements) {
		GUIForCalculator.elements = elements;
	}

	public static int getMax() {
		return max;
	}

	public static void setMax(int max) {
		GUIForCalculator.max = max;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public JPanel getForText() {
		return forText;
	}

	public void setForText(JPanel forText) {
		this.forText = forText;
	}

	public JPanel getMainButtons() {
		return mainButtons;
	}

	public void setMainButtons(JPanel mainButtons) {
		this.mainButtons = mainButtons;
	}

	public JPanel getAllButtons() {
		return allButtons;
	}

	public void setAllButtons(JPanel allButtons) {
		this.allButtons = allButtons;
	}

	public JPanel getBigPanel() {
		return bigPanel;
	}

	public void setBigPanel(JPanel bigPanel) {
		this.bigPanel = bigPanel;
	}

	public JPanel getSpace() {
		return space;
	}

	public void setSpace(JPanel space) {
		this.space = space;
	}

	public ButtonListener getReadLabel() {
		return readLabel;
	}

	public void setReadLabel(ButtonListener readLabel) {
		this.readLabel = readLabel;
	}

	// LISTENERS
	// listeners for number buttons
	class ButtonListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent readLabel) 
				{
					// getting the labels symbols from the buttons and print
					// them to the text field
					setButtonLabel(readLabel.getActionCommand());
					getTextField().setText(getTextField().getText() + getButtonLabel());
					
					// CLEAR button
					if(getButtonLabel().equals("C"))
						ButtonFunctions.clear();
					
					// BACKSPACE button
					if(getButtonLabel().equals("\u232b"))
						ButtonFunctions.backspace();
					
					// NUMBER buttons
					if(getButtonLabel().equals("0"))
						ButtonFunctions.operandButton();
															
					else if(getButtonLabel().equals("1"))
						ButtonFunctions.operandButton();
						
					else if(getButtonLabel().equals("2"))
						ButtonFunctions.operandButton();
						
					else if(getButtonLabel().equals("3"))
						ButtonFunctions.operandButton();
						
					else if(getButtonLabel().equals("4"))
						ButtonFunctions.operandButton();
			
					else if(getButtonLabel().equals("5"))
						ButtonFunctions.operandButton();
						
					else if(getButtonLabel().equals("6"))
						ButtonFunctions.operandButton();

					else if(getButtonLabel().equals("7"))
						ButtonFunctions.operandButton();

					else if(getButtonLabel().equals("8"))
						ButtonFunctions.operandButton();
							
					else if(getButtonLabel().equals("9"))
						ButtonFunctions.operandButton();
					// DECIMAL POINT
					else if(getButtonLabel().equals("."))
						ButtonFunctions.checkDecimalPoint();
					// NEGATIVE SIGN
					else if(getButtonLabel().equals("\u2212"))
						ButtonFunctions.negativeSign();
					// end NUMBERS
					
					// OPERATORS
					// DIVISION button
					if(getButtonLabel().equals("÷"))
						ButtonFunctions.operatorButton();
									
					// MULTIPLICATION button
					else if(getButtonLabel().equals("*"))
						ButtonFunctions.operatorButton();

					// MINUS button
					else if(getButtonLabel().equals("-"))
						ButtonFunctions.operatorButton();

					// PLUS button
					else if(getButtonLabel().equals("+"))
						ButtonFunctions.operatorButton();

					// OPEN parentheses button
					else if(getButtonLabel().equals("("))
						ButtonFunctions.operatorButton();

					// CLOSE parentheses button
					else if(getButtonLabel().equals(")"))
						ButtonFunctions.operatorButton();
					
					// EQUAL button
					else if(getButtonLabel().equals("="))
						ButtonFunctions.equal();

				}
		} // end LISTENTERS
}


