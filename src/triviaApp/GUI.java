package triviaApp;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {
	
	private JFrame StartFrame;
	private JTextField txtTrivia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.StartFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		StartFrame = new JFrame();
		StartFrame.setBounds(100, 100, 659, 497);
		StartFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StartFrame.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStart.setBounds(139, 295, 98, 26);
		StartFrame.getContentPane().add(btnStart);
		
		JButton btnRules = new JButton("Rules");
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			RulesText rules = new RulesText();
			rules.setVisible(true);
			}
		});
		btnRules.setBounds(371, 295, 98, 26);
		StartFrame.getContentPane().add(btnRules);
		
		txtTrivia = new JTextField();
		txtTrivia.setHorizontalAlignment(SwingConstants.CENTER);
		txtTrivia.setFont(new Font("Courier New", Font.BOLD, 30));
		txtTrivia.setText("Trivia");
		txtTrivia.setBounds(229, 59, 137, 32);
		StartFrame.getContentPane().add(txtTrivia);
		txtTrivia.setColumns(10);
	}
}
