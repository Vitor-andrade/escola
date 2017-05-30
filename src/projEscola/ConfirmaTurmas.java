package projEscola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ConfirmaTurmas {

	private JFrame frame;
	private String[] escolhidos;

	/**
	 * Launch the application.
	 * @param escolhidos 
	 */
	public static void ConfirmaTurmas(String[] escolhidos) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmaTurmas window = new ConfirmaTurmas();
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
	public ConfirmaTurmas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	}
}
