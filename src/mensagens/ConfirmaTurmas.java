package mensagens;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import projEscola.Aluno;
import projEscola.CadastroDeMatricula;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfirmaTurmas {

	private static JFrame frame;
	private static List<String> escolhidos = new ArrayList<>();

	/**
	 * Launch the application.
	 * @param escolhidos2 
	 */
	public static void ConfirmaTurmas(List<String> escolhidos2) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmaTurmas window = new ConfirmaTurmas(escolhidos2);
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
	public ConfirmaTurmas(List<String> escolhidos2) {
		escolhidos = escolhidos2;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel um = new JLabel();
		um.setHorizontalAlignment(SwingConstants.CENTER);
		um.setBounds(31, 27, 393, 20);
		frame.getContentPane().add(um);
		
		JLabel dois = new JLabel();
		dois.setHorizontalAlignment(SwingConstants.CENTER);
		dois.setBounds(31, 57, 393, 20);
		frame.getContentPane().add(dois);
		
		JLabel tres = new JLabel();
		tres.setHorizontalAlignment(SwingConstants.CENTER);
		tres.setBounds(31, 87, 393, 20);
		frame.getContentPane().add(tres);
		
		JLabel quatro = new JLabel();
		quatro.setHorizontalAlignment(SwingConstants.CENTER);
		quatro.setBounds(31, 117, 393, 20);
		frame.getContentPane().add(quatro);
		
		JLabel cinco = new JLabel();
		cinco.setHorizontalAlignment(SwingConstants.CENTER);
		cinco.setBounds(31, 147, 393, 20);
		frame.getContentPane().add(cinco);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//projEscola.Aluno.finalizaCadastro(matriculaP, matriculaA, curso, disciplina);
				ConfirmaTurmas.frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(82, 197, 97, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConfirmaTurmas.frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(261, 197, 106, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		switch (escolhidos.size()){
		case 1:
			um.setText(escolhidos.get(0));
			break;
		case 2:
			um.setText(escolhidos.get(0));
			dois.setText(escolhidos.get(1));
			break;
		case 3:
			um.setText(escolhidos.get(0));
			dois.setText(escolhidos.get(1));
			tres.setText(escolhidos.get(2));
			break;
		case 4:
			um.setText(escolhidos.get(0));
			dois.setText(escolhidos.get(1));
			tres.setText(escolhidos.get(2));
			quatro.setText(escolhidos.get(3));
			break;
		case 5:
			um.setText(escolhidos.get(0));
			dois.setText(escolhidos.get(1));
			tres.setText(escolhidos.get(2));
			quatro.setText(escolhidos.get(3));
			cinco.setText(escolhidos.get(4));
			break;
		}
		
	}
}
