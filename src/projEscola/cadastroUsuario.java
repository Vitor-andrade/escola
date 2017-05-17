package projEscola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class cadastroUsuario {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void cadastraUsuario() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroUsuario window = new cadastroUsuario();
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
	public cadastroUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 357);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(171, 264, 89, 23);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setBounds(116, 205, 195, 23);
		frame.getContentPane().add(passwordField);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSenha.setBounds(116, 190, 74, 14);
		frame.getContentPane().add(lblSenha);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(116, 156, 195, 23);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Matr\u00EDcula");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel.setBounds(116, 141, 74, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setBounds(116, 108, 195, 22);
		frame.getContentPane().add(textArea_1);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNome.setBounds(116, 93, 74, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblCadastroDeUsurio = new JLabel("Cadastro de Usu\u00E1rio");
		lblCadastroDeUsurio.setForeground(Color.BLACK);
		lblCadastroDeUsurio.setBackground(Color.LIGHT_GRAY);
		lblCadastroDeUsurio.setFont(new Font("Arial", Font.BOLD, 20));
		lblCadastroDeUsurio.setBounds(116, 35, 205, 14);
		frame.getContentPane().add(lblCadastroDeUsurio);
	}
}
