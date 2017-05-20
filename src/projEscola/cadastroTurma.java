package projEscola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.Color;

public class cadastroTurma {

	private JFrame frame;
	private JTextField txtCadastroDeTurma;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroTurma window = new cadastroTurma();
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
	public cadastroTurma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 826, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtCadastroDeTurma = new JTextField();
		txtCadastroDeTurma.setFont(new Font("Arial", Font.BOLD, 20));
		txtCadastroDeTurma.setText("Cadastro de Turma");
		txtCadastroDeTurma.setBounds(333, 38, 191, 53);
		frame.getContentPane().add(txtCadastroDeTurma);
		txtCadastroDeTurma.setColumns(10);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Arial", Font.BOLD, 13));
		lblCurso.setBounds(68, 113, 46, 14);
		frame.getContentPane().add(lblCurso);
		
		JLabel lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setFont(new Font("Arial", Font.BOLD, 13));
		lblDisciplina.setBounds(619, 114, 62, 14);
		frame.getContentPane().add(lblDisciplina);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(67, 127, 168, 209);
		frame.getContentPane().add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(619, 127, 168, 209);
		frame.getContentPane().add(scrollPane_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollPane_1.setRowHeaderView(scrollBar_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(288, 163, 236, 1);
		frame.getContentPane().add(horizontalStrut);
		
		textField = new JTextField();
		textField.setBounds(68, 380, 168, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblOferecerCurso = new JLabel("Oferecer Curso Novo");
		lblOferecerCurso.setFont(new Font("Arial", Font.BOLD, 13));
		lblOferecerCurso.setBounds(68, 355, 167, 14);
		frame.getContentPane().add(lblOferecerCurso);
		
		textField_1 = new JTextField();
		textField_1.setBounds(619, 380, 168, 39);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Oferecer Disciplina Nova");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(619, 355, 168, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(Color.BLUE);
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setBounds(698, 446, 89, 23);
		frame.getContentPane().add(btnCadastrar);
	}
}