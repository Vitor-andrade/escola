package mensagens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JaFoiSelecionado {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void JaFoiSelecionado() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JaFoiSelecionado window = new JaFoiSelecionado();
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
	public JaFoiSelecionado() {
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
		
		JLabel lblEsteCursoJ = new JLabel("Este curso j\u00E1 foi selecionado");
		lblEsteCursoJ.setFont(new Font("Arial", Font.PLAIN, 24));
		lblEsteCursoJ.setForeground(Color.RED);
		lblEsteCursoJ.setBounds(62, 59, 312, 54);
		frame.getContentPane().add(lblEsteCursoJ);
		
		JButton btnNewButton = new JButton("Okay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JaFoiSelecionado.frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(166, 160, 98, 54);
		frame.getContentPane().add(btnNewButton);
	}

}
