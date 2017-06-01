package mensagens;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import projEscola.Aluno;
import projEscola.BemVindoAlunop;
import projEscola.CadastroDeMatricula;
import projEscola.Turma;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ConfirmaTurmas {

	private static JFrame frame;
	private static List<String> escolhidos = new ArrayList<>();
	private Aluno estudante;
	private String selecionaCurso;

	/**
	 * Launch the application.
	 * @param escolhidos2 
	 * @param estudante1 
	 * @param selecionaCurso1 
	 */
	public static void ConfirmaTurmas(List<String> escolhidos2, Aluno estudante1, String selecionaCurso1) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmaTurmas window = new ConfirmaTurmas(escolhidos2, estudante1, selecionaCurso1);
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
	public ConfirmaTurmas(List<String> escolhidos2, Aluno estudante1, String selecionaCurso1) {
		escolhidos = escolhidos2;
		estudante = estudante1;
		selecionaCurso = selecionaCurso1;
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
				for(int i=0;i<escolhidos.size();i++){
					try {
						projEscola.Aluno.finalizaCadastro(Turma.getProfessor(escolhidos.get(i).substring(escolhidos.get(i).length()-1, escolhidos.get(i).length())), estudante.getMatricula(), selecionaCurso, escolhidos.get(i).substring(0, escolhidos.get(i).length()-1));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				CadastroDeMatricula.frame.setVisible(false);
				ConfirmaTurmas.frame.setVisible(false);
				BemVindoAlunop.BemVindoAlunop(estudante);
				Sucesso.Sucesso();
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
			um.setText(escolhidos.get(0).substring(0, escolhidos.get(0).length()-1));
			break;
		case 2:
			um.setText(escolhidos.get(0).substring(0, escolhidos.get(0).length()-1));
			dois.setText(escolhidos.get(1).substring(0, escolhidos.get(1).length()-1));
			break;
		case 3:
			um.setText(escolhidos.get(0).substring(0, escolhidos.get(0).length()-1));
			dois.setText(escolhidos.get(1).substring(0, escolhidos.get(1).length()-1));
			tres.setText(escolhidos.get(2).substring(0, escolhidos.get(2).length()-1));
			break;
		case 4:
			um.setText(escolhidos.get(0).substring(0, escolhidos.get(0).length()-1));
			dois.setText(escolhidos.get(1).substring(0, escolhidos.get(1).length()-1));
			tres.setText(escolhidos.get(2).substring(0, escolhidos.get(2).length()-1));
			quatro.setText(escolhidos.get(3).substring(0, escolhidos.get(3).length()-1));
			break;
		case 5:
			um.setText(escolhidos.get(0).substring(0, escolhidos.get(0).length()-1));
			dois.setText(escolhidos.get(1).substring(0, escolhidos.get(1).length()-1));
			tres.setText(escolhidos.get(2).substring(0, escolhidos.get(2).length()-1));
			quatro.setText(escolhidos.get(3).substring(0, escolhidos.get(3).length()-1));
			cinco.setText(escolhidos.get(4).substring(0, escolhidos.get(4).length()-1));
			break;
		}
		
	}
}
