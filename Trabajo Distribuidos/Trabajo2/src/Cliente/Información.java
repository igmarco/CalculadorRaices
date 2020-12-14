package Cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Font;

public class Informaci�n extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Informaci�n frame = new Informaci�n();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Informaci�n() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Informaci�n.class.getResource("/Imagenes/iconoRefachero.png")));
		setTitle("Informaci\u00F3n");
		setBounds(100, 100, 382, 270);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BlackLynx Studio");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel.setBounds(23, 21, 221, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblIgnacioMarcoPrez = new JLabel("Ignacio Marco P\u00E9rez");
		lblIgnacioMarcoPrez.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblIgnacioMarcoPrez.setBounds(33, 144, 259, 26);
		contentPane.add(lblIgnacioMarcoPrez);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pablo Ascorbe Fern\u00E1ndez");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(33, 66, 259, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("paascorb@unirioja.es");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.ITALIC, 15));
		lblNewLabel_1_1_1.setBounds(141, 107, 189, 26);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("igmarco@unirioja.es");
		lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.ITALIC, 15));
		lblNewLabel_1_1_2.setBounds(141, 181, 189, 26);
		contentPane.add(lblNewLabel_1_1_2);
	}
}
