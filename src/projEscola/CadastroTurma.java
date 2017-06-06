package projEscola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroTurma {

	private static JFrame frame;
	private JTextField textCurso;
	private JTextField textDisciplina;
	private JList curso;
	private JList disciplina;
	private Professor teacher;

	/**
	 * Launch the application.
	 * @param teacher 
	 */
	public static void CadastroTurma(Professor teacher1) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroTurma window = new CadastroTurma(teacher1);
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
	public CadastroTurma(Professor teacher1) {
		teacher = teacher1;
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
		
		textCurso = new JTextField();
		textCurso.setBounds(68, 380, 168, 39);
		frame.getContentPane().add(textCurso);
		textCurso.setColumns(10);
		textCurso.setText("");
		
		JLabel lblOferecerCurso = new JLabel("Oferecer Curso Novo");
		lblOferecerCurso.setFont(new Font("Arial", Font.BOLD, 13));
		lblOferecerCurso.setBounds(68, 355, 167, 14);
		frame.getContentPane().add(lblOferecerCurso);
		
		textDisciplina = new JTextField();
		textDisciplina.setBounds(576, 380, 168, 39);
		frame.getContentPane().add(textDisciplina);
		textDisciplina.setColumns(10);
		textDisciplina.setText("");
		
		JLabel lblNewLabel = new JLabel("Oferecer Disciplina Nova");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(576, 355, 168, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(Professor.getQtd(teacher.getMatricula())==8){
						mensagens.MaximoTurmas.MaximoTurmas();
					} else {
						if(textCurso.getText().equals("")&&textDisciplina.getText().equals("")){
							Professor.cadastraTurma(teacher.getMatricula(), curso.getSelectedValue().toString(), disciplina.getSelectedValue().toString());
							mensagens.Sucesso.Sucesso();
						} else if(!textCurso.getText().equals("")&&textDisciplina.getText().equals("")){
							Professor.cadastraTurma(teacher.getMatricula(), textCurso.getText(), disciplina.getSelectedValue().toString());
							mensagens.Sucesso.Sucesso();
						} else if(textCurso.getText().equals("")&&!textDisciplina.getText().equals("")){
							Professor.cadastraTurma(teacher.getMatricula(), curso.getSelectedValue().toString(), textDisciplina.getText());
							mensagens.Sucesso.Sucesso();
						} else if(!textCurso.getText().equals("")&&!textDisciplina.getText().equals("")){
							Professor.cadastraTurma(teacher.getMatricula(), textCurso.getText(), textDisciplina.getText());
							mensagens.Sucesso.Sucesso();
						}
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					mensagens.FaltaSelecao.FaltaSelecao();
					e.printStackTrace();
				}
			}
		});
		btnCadastrar.setBackground(Color.LIGHT_GRAY);
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setBounds(361, 446, 99, 23);
		frame.getContentPane().add(btnCadastrar);
		
		JLabel lblCadastroDeTurma = new JLabel("Cadastro de Turma");
		lblCadastroDeTurma.setFont(new Font("Arial", Font.BOLD, 20));
		lblCadastroDeTurma.setBounds(332, 26, 206, 85);
		frame.getContentPane().add(lblCadastroDeTurma);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(68, 141, 168, 203);
		frame.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(576, 138, 168, 203);
		frame.getContentPane().add(scrollPane_1);
		
		try {
			curso = new JList(Curso.getCursos());
			scrollPane.setViewportView(curso);
        	disciplina = new JList(Disciplina.getDisciplinas("%%", 0));
			scrollPane_1.setViewportView(disciplina);
			
			JButton voltar = new JButton("Voltar");
			voltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CadastroTurma.frame.setVisible(false);
					BemVindoProfessor.frame.setVisible(true);
				}
			});
			voltar.setBounds(68, 446, 89, 23);
			frame.getContentPane().add(voltar);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
}
