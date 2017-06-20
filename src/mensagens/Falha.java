package mensagens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Falha {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Falha() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Falha window = new Falha();
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
	public Falha() {
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
		
		JLabel lblFalha = new JLabel("Falha");
		lblFalha.setForeground(Color.RED);
		lblFalha.setFont(new Font("Arial", Font.PLAIN, 24));
		lblFalha.setBounds(170, 68, 125, 63);
		frame.getContentPane().add(lblFalha);
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Falha.frame.setVisible(false);
			}
		});
		btnOkay.setBounds(169, 178, 74, 47);
		frame.getContentPane().add(btnOkay);
	}
}
