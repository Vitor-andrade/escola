package projEscola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class cadastroDeMatricula {

	private JFrame frame;
	private JTable disciplina;
	private JTable curso;
	private JTable Turma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroDeMatricula window = new cadastroDeMatricula();
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
	public cadastroDeMatricula() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 824, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(330, 145, 151, 233);
		frame.getContentPane().add(scrollPane);
		
		disciplina = new JTable();
		scrollPane.setViewportView(disciplina);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(588, 145, 151, 233);
		frame.getContentPane().add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(63, 145, 149, 231);
		frame.getContentPane().add(scrollPane_2);
		scrollPane_2.setToolTipText("oi\r\n");
		
		curso = new JTable();
		scrollPane_2.setViewportView(curso);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(692, 421, 106, 30);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(63, 114, 130, 15);
		frame.getContentPane().add(lblCurso);
		lblCurso.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JLabel lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setBounds(330, 114, 132, 15);
		frame.getContentPane().add(lblDisciplina);
		lblDisciplina.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JLabel label = new JLabel("Turma");
		label.setBounds(588, 114, 132, 15);
		frame.getContentPane().add(label);
		label.setFont(new Font("Arial", Font.PLAIN, 13));
		label.setLabelFor(scrollPane_1);
		
		try {
			Turma = new JTable(turma.buscaTurmaCadastro());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scrollPane_1.setViewportView(Turma);
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Arial", Font.BOLD, 20));
		lblCadastro.setBounds(332, 11, 216, 53);
		frame.getContentPane().add(lblCadastro);
	}
}
