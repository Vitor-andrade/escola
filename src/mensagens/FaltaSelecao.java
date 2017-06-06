package mensagens;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FaltaSelecao {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void FaltaSelecao() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FaltaSelecao window = new FaltaSelecao();
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
	public FaltaSelecao() {
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
		
		JLabel lblFavorSelecionarUma = new JLabel("Favor selecionar uma op\u00E7\u00E3o");
		lblFavorSelecionarUma.setFont(new Font("Arial", Font.PLAIN, 24));
		lblFavorSelecionarUma.setForeground(Color.RED);
		lblFavorSelecionarUma.setBounds(65, 49, 302, 38);
		frame.getContentPane().add(lblFavorSelecionarUma);
		
		JLabel lblOuCriarUm = new JLabel("ou criar um curso/disciplina");
		lblOuCriarUm.setFont(new Font("Arial", Font.PLAIN, 24));
		lblOuCriarUm.setForeground(Color.RED);
		lblOuCriarUm.setBounds(65, 83, 294, 35);
		frame.getContentPane().add(lblOuCriarUm);
		
		JLabel lblNovo = new JLabel("novo");
		lblNovo.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNovo.setForeground(Color.RED);
		lblNovo.setBounds(169, 98, 153, 77);
		frame.getContentPane().add(lblNovo);
		
		JButton btnNewButton = new JButton("Okay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FaltaSelecao.frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(152, 180, 89, 47);
		frame.getContentPane().add(btnNewButton);
	}

}
