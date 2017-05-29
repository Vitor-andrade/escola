package projEscola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class BemVindoAlunop {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void BemVindoAlunop() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BemVindoAlunop window = new BemVindoAlunop();
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
	public BemVindoAlunop() {
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
		scrollPane.setBounds(50, 125, 195, 207);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(556, 125, 171, 207);
		frame.getContentPane().add(scrollPane_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane_1.setRowHeaderView(scrollBar);
		
		JLabel lblBemVindoAluno = new JLabel("Bem Vindo, Aluno!");
		lblBemVindoAluno.setFont(new Font("Arial", Font.BOLD, 20));
		lblBemVindoAluno.setBounds(275, 25, 218, 46);
		frame.getContentPane().add(lblBemVindoAluno);
	}
}
