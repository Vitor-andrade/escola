package projEscola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BemVindoProfessor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void BemVindoProfessor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BemVindoProfessor window = new BemVindoProfessor();
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
	public BemVindoProfessor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 20));
		frame.setBounds(100, 100, 807, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDados = new JLabel("Dados");
		lblDados.setBounds(48, 88, 171, 40);
		frame.getContentPane().add(lblDados);
		
		JLabel lblNewLabel = new JLabel("Turmas");
		lblNewLabel.setBounds(488, 101, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 126, 171, 210);
		frame.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(488, 126, 171, 210);
		frame.getContentPane().add(scrollPane_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollPane_1.setRowHeaderView(scrollBar_1);
		
		JLabel lblBemVindoProfessor = new JLabel("Bem Vindo, Professor!");
		lblBemVindoProfessor.setFont(new Font("Arial", Font.BOLD, 20));
		lblBemVindoProfessor.setBounds(244, 25, 244, 74);
		frame.getContentPane().add(lblBemVindoProfessor);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setBounds(522, 397, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Nova Turma");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroTurma.CadastroTurma();
			}
		});
		btnNewButton_1.setBounds(80, 397, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
