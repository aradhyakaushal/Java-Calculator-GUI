package calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorApplication {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApplication window = new CalculatorApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorApplication() {
		initialize();
	}
	
	double num1, num2, result;
	String oper, ans;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setBounds(100, 100, 294, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 255, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		JButton addButton = new JButton("+");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "+";
			}
		});
		addButton.setBounds(205, 43, 60, 45);
		frame.getContentPane().add(addButton);
		
		JButton subButton = new JButton("-");
		subButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "-";
			}
		});
		subButton.setBounds(205, 93, 60, 45);
		frame.getContentPane().add(subButton);
		
		JButton mulButton = new JButton("×");
		mulButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "*";
			}
		});
		mulButton.setBounds(205, 143, 60, 45);
		frame.getContentPane().add(mulButton);
		
		JButton divButton = new JButton("÷");
		divButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oper = "/";
			}
		});
		divButton.setBounds(206, 193, 60, 45);
		frame.getContentPane().add(divButton);
		
		JButton equButton = new JButton("=");
		equButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(textField.getText());
				
				switch (oper) {
				case "+":
					result = num1 + num2;
					ans = String.valueOf(result);
					textField.setText(ans);
					break;
				
				case "-":
					result = num1 - num2;
					ans = String.valueOf(result);
					textField.setText(ans);
					break;
					
				case "*":
					result = num1 * num2;
					ans = String.valueOf(result);
					textField.setText(ans);
					break;
					
				case "/":
					result = num1 / num2;
					ans = String.valueOf(result);
					textField.setText(ans);
					break;
				}
			}
		});
		equButton.setBounds(206, 243, 60, 45);
		frame.getContentPane().add(equButton);
		
		JButton backButton = new JButton("←");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace = str.toString();
					textField.setText(backspace);
				}
			}
		});
		backButton.setBounds(140, 43, 60, 45);
		frame.getContentPane().add(backButton);
		
		JButton clrButton = new JButton("C");
		clrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		clrButton.setBounds(75, 43, 60, 45);
		frame.getContentPane().add(clrButton);
		
		JButton nineButton = new JButton("9");
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+nineButton.getText();
				textField.setText(number);
			}
		});
		nineButton.setBounds(140, 93, 60, 45);
		frame.getContentPane().add(nineButton);
		
		JButton eightButton = new JButton("8");
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+eightButton.getText();
				textField.setText(number);
			}
		});
		eightButton.setBounds(75, 93, 60, 45);
		frame.getContentPane().add(eightButton);
		
		JButton sevenButton = new JButton("7");
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+sevenButton.getText();
				textField.setText(number);
			}
		});
		sevenButton.setBounds(10, 93, 60, 45);
		frame.getContentPane().add(sevenButton);
		
		JButton sixButton = new JButton("6");
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+sixButton.getText();
				textField.setText(number);
			}
		});
		sixButton.setBounds(140, 143, 60, 45);
		frame.getContentPane().add(sixButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+fiveButton.getText();
				textField.setText(number);
			}
		});
		fiveButton.setBounds(75, 143, 60, 45);
		frame.getContentPane().add(fiveButton);
		
		JButton fourButton = new JButton("4");
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+fourButton.getText();
				textField.setText(number);
			}
		});
		fourButton.setBounds(10, 143, 60, 45);
		frame.getContentPane().add(fourButton);
		
		JButton threeButton = new JButton("3");
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+threeButton.getText();
				textField.setText(number);
			}
		});
		threeButton.setBounds(140, 193, 60, 45);
		frame.getContentPane().add(threeButton);
		
		JButton twoButton = new JButton("2");
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+twoButton.getText();
				textField.setText(number);
			}
		});
		twoButton.setBounds(75, 193, 60, 45);
		frame.getContentPane().add(twoButton);
		
		JButton oneButton = new JButton("1");
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+oneButton.getText();
				textField.setText(number);
			}
		});
		oneButton.setBounds(10, 193, 60, 45);
		frame.getContentPane().add(oneButton);
		
		JButton deciButton = new JButton(".");
		deciButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+deciButton.getText();
				textField.setText(number);
			}
		});
		deciButton.setBounds(140, 243, 60, 45);
		frame.getContentPane().add(deciButton);
		
		JButton zeroButton = new JButton("0");
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+zeroButton.getText();
				textField.setText(number);
			}
		});
		zeroButton.setBounds(75, 243, 60, 45);
		frame.getContentPane().add(zeroButton);
	}
}
