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
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.ScrollPaneConstants;

public class CadastroTurma {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroTurma window = new CadastroTurma();
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
	public CadastroTurma() {
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
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Arial", Font.BOLD, 13));
		lblCurso.setBounds(68, 113, 46, 14);
		frame.getContentPane().add(lblCurso);
		
		JLabel lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setFont(new Font("Arial", Font.BOLD, 13));
		lblDisciplina.setBounds(576, 113, 62, 14);
		frame.getContentPane().add(lblDisciplina);
		
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
		textField_1.setBounds(576, 380, 168, 39);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Oferecer Disciplina Nova");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(576, 355, 168, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(Color.LIGHT_GRAY);
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setBounds(371, 446, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JLabel lblCadastroDeTurma = new JLabel("Cadastro de Turma");
		lblCadastroDeTurma.setFont(new Font("Arial", Font.BOLD, 20));
		lblCadastroDeTurma.setBounds(332, 26, 206, 85);
		frame.getContentPane().add(lblCadastroDeTurma);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(68, 141, 168, 203);
		frame.getContentPane().add(scrollPane);
		
		JList curso = new JList();
		scrollPane.setViewportView(curso);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(576, 138, 168, 203);
		frame.getContentPane().add(scrollPane_1);
		
		JList disciplina = new JList();
		scrollPane_1.setViewportView(disciplina);
	} 
}
