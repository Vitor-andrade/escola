package projEscola;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenosDeOito {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void MenosDeOito() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenosDeOito window = new MenosDeOito();
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
	public MenosDeOito() {
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
		
		JLabel lblErroORegisto = new JLabel("Erro! A matricula deve", SwingConstants.RIGHT);
		lblErroORegisto.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblErroORegisto.setVerticalAlignment(SwingConstants.TOP);
		lblErroORegisto.setFont(new Font("Arial", Font.PLAIN, 25));
		lblErroORegisto.setForeground(new Color(255, 0, 0));
		lblErroORegisto.setBounds(60, 63, 276, 49);
		frame.getContentPane().add(lblErroORegisto);
		
		JLabel lblConterDigitos = new JLabel("conter 8 digitos");
		lblConterDigitos.setFont(new Font("Arial", Font.PLAIN, 25));
		lblConterDigitos.setForeground(Color.RED);
		lblConterDigitos.setBounds(117, 90, 202, 54);
		frame.getContentPane().add(lblConterDigitos);
		
		JButton button = new JButton("Ok");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MenosDeOito.frame.setVisible(false);
			}
		});
		button.setBounds(180, 173, 51, 33);
		frame.getContentPane().add(button);
	}

}
