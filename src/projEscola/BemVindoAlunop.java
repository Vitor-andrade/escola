package projEscola;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ScrollPaneConstants;

public class BemVindoAlunop {

	private JFrame frame;
	private Aluno estudante;

	/**
	 * Launch the application.
	 * @param estudante 
	 */
	public static void BemVindoAlunop(Aluno estudante1) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BemVindoAlunop window = new BemVindoAlunop(estudante1);
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
	public BemVindoAlunop(Aluno estudante1) {
		estudante = estudante1;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 779, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(664, 383, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblDados = new JLabel("Dados");
		lblDados.setBounds(50, 100, 46, 14);
		frame.getContentPane().add(lblDados);
		
		JLabel lblNewLabel = new JLabel("Turmas");
		lblNewLabel.setBounds(556, 100, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(50, 125, 195, 207);
		frame.getContentPane().add(scrollPane);
		
		Vector<String> info = new Vector<String>();
		info.addElement("Nome do Aluno:");
		info.addElement(estudante.nome);
		info.addElement(" ");
		info.addElement("Matrícula:");
		info.addElement(estudante.getMatricula());
		JList<?> dados = new JList<Object>(info);
		scrollPane.setViewportView(dados);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(556, 125, 171, 207);
		frame.getContentPane().add(scrollPane_1);
		
		JList<?> turmas;
		try {
			turmas = new JList<Object>(Disciplina.getDisciplinas(estudante.getMatricula(), 1));
			scrollPane_1.setViewportView(turmas);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JLabel lblBemVindoAluno = new JLabel("Bem Vindo, Aluno!");
		lblBemVindoAluno.setFont(new Font("Arial", Font.BOLD, 20));
		lblBemVindoAluno.setBounds(275, 25, 218, 46);
		frame.getContentPane().add(lblBemVindoAluno);
	}
}
