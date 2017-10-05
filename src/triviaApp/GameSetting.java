package triviaApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameSetting {

	private JFrame Gamesetting;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameSetting window = new GameSetting();
					window.Gamesetting.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameSetting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Gamesetting = new JFrame();
		Gamesetting.setTitle("GameSetting");
		Gamesetting.setBounds(100, 100, 623, 489);
		Gamesetting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Gamesetting.getContentPane().setLayout(null);
		
		Clock clock = new Clock();
		clock.setSize(198, 61);
		clock.setLocation(77, 10);
		clock.setPeriot(1);
		clock.setStopLong(10);
		
		Gamesetting.getContentPane().add(clock);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clock.doStart();
			}
		});
		btnStart.setBounds(102, 325, 141, 35);
		Gamesetting.getContentPane().add(btnStart);
	}
}
