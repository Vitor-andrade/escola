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

public class bemVindoProfessor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void bemVindoProfessor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bemVindoProfessor window = new bemVindoProfessor();
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
	public bemVindoProfessor() {
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
		lblDados.setBounds(47, 132, 171, 40);
		frame.getContentPane().add(lblDados);
		
		JLabel lblNewLabel = new JLabel("Turmas");
		lblNewLabel.setBounds(487, 145, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(47, 170, 171, 210);
		frame.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(487, 170, 171, 210);
		frame.getContentPane().add(scrollPane_1);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollPane_1.setRowHeaderView(scrollBar_1);
		
		Button button = new Button("Log Out");
		button.setForeground(Color.BLACK);
		button.setBounds(694, 417, 87, 22);
		frame.getContentPane().add(button);
		
		JLabel lblBemVindoProfessor = new JLabel("Bem Vindo, Professor!");
		lblBemVindoProfessor.setFont(new Font("Arial", Font.BOLD, 20));
		lblBemVindoProfessor.setBounds(244, 25, 244, 74);
		frame.getContentPane().add(lblBemVindoProfessor);
	}
}
