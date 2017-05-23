package projEscola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class cadastroUsuario {

	private JFrame frame;
	private JPasswordField senha;
	private JTextField nome;
	private JTextField matricula;

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
		
		senha = new JPasswordField();
		senha.setBackground(Color.WHITE);
		senha.setBounds(115, 148, 195, 23);
		frame.getContentPane().add(senha);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSenha.setBounds(115, 133, 74, 14);
		frame.getContentPane().add(lblSenha);
		
		JLabel lblNewLabel = new JLabel("Matr\u00EDcula");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel.setBounds(115, 84, 74, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNome.setBounds(115, 36, 74, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblCadastroDeUsurio = new JLabel("Cadastro de Usu\u00E1rio");
		lblCadastroDeUsurio.setForeground(Color.BLACK);
		lblCadastroDeUsurio.setBackground(Color.LIGHT_GRAY);
		lblCadastroDeUsurio.setFont(new Font("Arial", Font.BOLD, 20));
		lblCadastroDeUsurio.setBounds(105, 11, 205, 14);
		frame.getContentPane().add(lblCadastroDeUsurio);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					aluno.setAluno(matricula.getText(), senha.getText(), nome.getText());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(164, 284, 108, 23);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 13));
		frame.getContentPane().add(btnNewButton);
		
		nome = new JTextField();
		nome.setBounds(115, 53, 195, 20);
		frame.getContentPane().add(nome);
		nome.setColumns(10);
		
		matricula = new JTextField();
		matricula.setBounds(115, 102, 195, 20);
		frame.getContentPane().add(matricula);
		matricula.setColumns(10);
		
		JRadioButton professor = new JRadioButton("Professor");
		professor.setBounds(103, 223, 109, 23);
		frame.getContentPane().add(professor);
		
		JRadioButton aluno = new JRadioButton("Aluno");
		aluno.setBounds(214, 223, 109, 23);
		frame.getContentPane().add(aluno);
		
		if (professor.isSelected()){
			aluno.setEnabled(false);
		}
		
		if (aluno.isSelected()){
			professor.setEnabled(false);
		}
		
		JLabel lblSelecioneSeuTipo = new JLabel("Selecione seu tipo de usu\u00E1rio");
		lblSelecioneSeuTipo.setFont(new Font("Arial", Font.BOLD, 12));
		lblSelecioneSeuTipo.setBounds(105, 202, 167, 14);
		frame.getContentPane().add(lblSelecioneSeuTipo);
	}
}
