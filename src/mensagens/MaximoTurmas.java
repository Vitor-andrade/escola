package mensagens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MaximoTurmas {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void MaximoTurmas() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaximoTurmas window = new MaximoTurmas();
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
	public MaximoTurmas() {
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
		
		JLabel lblVocJSelecionou = new JLabel("Voc\u00EA j\u00E1 selecionou seus ");
		lblVocJSelecionou.setFont(new Font("Arial", Font.PLAIN, 24));
		lblVocJSelecionou.setForeground(Color.RED);
		lblVocJSelecionou.setBounds(89, 30, 289, 66);
		frame.getContentPane().add(lblVocJSelecionou);
		
		JLabel lblCursos = new JLabel("5 cursos");
		lblCursos.setForeground(Color.RED);
		lblCursos.setFont(new Font("Arial", Font.PLAIN, 24));
		lblCursos.setBounds(169, 91, 154, 26);
		frame.getContentPane().add(lblCursos);
		
		JButton btnNewButton = new JButton("Okay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MaximoTurmas.frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(169, 160, 89, 58);
		frame.getContentPane().add(btnNewButton);
	}

}
