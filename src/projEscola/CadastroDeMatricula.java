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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class CadastroDeMatricula {

	private JFrame frame;
	private String[] escolhidos;
	private int ajudante;

	/**
	 * Launch the application.
	 */
	public static void CadastroDeMatricula() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroDeMatricula window = new CadastroDeMatricula();
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
	public CadastroDeMatricula() {
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
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(486, 421, 106, 30);
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
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		
		try {
			JList<?> curso = new JList<Object>(Curso.getCursos());
        	JList<?> disciplina = new JList<Object>();
        	JList<?> turmaa = new JList<Object>();
			scrollPane_2.setViewportView(curso);
			scrollPane.setViewportView(disciplina);
			scrollPane_1.setViewportView(turmaa);
			curso.addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent e) {
		        	String selecionaCurso = curso.getSelectedValue().toString();
		        	try {
						disciplina.setListData(Disciplina.getDisciplinas(selecionaCurso));
						turmaa.setEnabled(false);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		            
		        }
		    });
			disciplina.addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent e) {
		        	String selecionaDisciplina = disciplina.getSelectedValue().toString();
		        	try {
		        		turmaa.setListData(Turma.getTurmas(selecionaDisciplina));
		        		turmaa.setEnabled(true);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		            
		        }
		    });
			turmaa.addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent e) {
		        	String selecionaTurma = turmaa.getSelectedValue().toString();
		        	escolhidos[escolhidos.length] = selecionaTurma;
		        }
		    });
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setFont(new Font("Arial", Font.BOLD, 20));
		lblCadastro.setBounds(332, 11, 216, 53);
		frame.getContentPane().add(lblCadastro);
		
		JButton btnNewButton_1 = new JButton("Adicionar Disciplina");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConfirmaTurmas.ConfirmaTurmas(escolhidos);
			}
		});
		btnNewButton_1.setBounds(200, 421, 151, 30);
		frame.getContentPane().add(btnNewButton_1);
	}
}
