package mensagens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Sucesso {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Sucesso() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sucesso window = new Sucesso();
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
	public Sucesso() {
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
		
		JLabel lblSucesso = new JLabel("Sucesso!");
		lblSucesso.setFont(new Font("Times New Roman", Font.PLAIN, 44));
		lblSucesso.setBounds(136, 30, 168, 140);
		frame.getContentPane().add(lblSucesso);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(181, 166, 57, 37);
		frame.getContentPane().add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Sucesso.frame.setVisible(false);
			}
		});
		
	}
}
