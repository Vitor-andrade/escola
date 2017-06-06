package mensagens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsuarioExistente {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void UsuarioExistente() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioExistente window = new UsuarioExistente();
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
	public UsuarioExistente() {
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
		
		JLabel lblUsurioJExuste = new JLabel("Matricula j\u00E1 utilizada");
		lblUsurioJExuste.setFont(new Font("Arial", Font.PLAIN, 24));
		lblUsurioJExuste.setForeground(Color.RED);
		lblUsurioJExuste.setBounds(110, 45, 232, 72);
		frame.getContentPane().add(lblUsurioJExuste);
		
		JButton btnNewButton = new JButton("Okay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UsuarioExistente.frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(168, 157, 96, 54);
		frame.getContentPane().add(btnNewButton);
	}
}
