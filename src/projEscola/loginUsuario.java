package projEscola;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class loginUsuario {

	static JFrame frame;
	private JTextField txtsdgadsfh;
	private JPasswordField passwordField;
	private JLabel lblRegistroAcadmico;
	private JLabel lblSenha;
	private JLabel lblLoginDeUsurio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginUsuario window = new loginUsuario();
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
	public loginUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 492, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					if(Pessoa.validaSenha(txtsdgadsfh.getText(), passwordField.getText())){
						if(Pessoa.getPerfilUsuario(txtsdgadsfh.getText())==1){
							// Professor autorizado
							bemVindoProfessor.bemVindoProfessor();
						} else if(Pessoa.getPerfilUsuario(txtsdgadsfh.getText())==2){
							// Aluno autorizado
							if(aluno.validaUsuario(txtsdgadsfh.getText())){
								BemVindoAlunop.BemVindoAlunop();
							}else{
								cadastroDeMatricula.cadastroDeMatricula();
							}
						} else if(Pessoa.getPerfilUsuario(txtsdgadsfh.getText())==3){
							// Adminitrador Autorizado
							cadastroUsuario.cadastraUsuario();
						}
						loginUsuario.frame.setVisible(false);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		txtsdgadsfh = new JTextField();
		txtsdgadsfh.setBackground(Color.LIGHT_GRAY);
		txtsdgadsfh.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.LIGHT_GRAY);
		
		lblRegistroAcadmico = new JLabel("Registro Acad\u00EAmico");
		lblRegistroAcadmico.setFont(new Font("Arial", Font.PLAIN, 13));
		
		lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSenha.setForeground(Color.BLACK);
		
		lblLoginDeUsurio = new JLabel("Login de Usu\u00E1rio");
		lblLoginDeUsurio.setFont(new Font("Arial", Font.BOLD, 20));
		lblLoginDeUsurio.setBackground(Color.LIGHT_GRAY);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(181)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(134)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSenha)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(134)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtsdgadsfh, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
								.addComponent(lblLoginDeUsurio)
								.addComponent(lblRegistroAcadmico))))
					.addContainerGap(145, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(39)
					.addComponent(lblLoginDeUsurio)
					.addGap(67)
					.addComponent(lblRegistroAcadmico)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtsdgadsfh, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(lblSenha)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(59)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
