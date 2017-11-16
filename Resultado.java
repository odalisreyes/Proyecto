import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Resultado extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resultado frame = new Resultado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Resultado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroDeOrden = new JLabel("Numero de orden");
		lblNumeroDeOrden.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroDeOrden.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNumeroDeOrden.setBounds(6, 30, 438, 16);
		contentPane.add(lblNumeroDeOrden);
		
		JLabel label = new JLabel("1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Calibri", Font.BOLD, 26));
		label.setBounds(6, 58, 438, 26);
		contentPane.add(label);
		
		JLabel lblElTotalDe = new JLabel("El total de su orden es de: ");
		lblElTotalDe.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblElTotalDe.setBounds(23, 111, 158, 16);
		contentPane.add(lblElTotalDe);
		
		JLabel lblQ = new JLabel("Q");
		lblQ.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblQ.setBounds(176, 111, 61, 16);
		contentPane.add(lblQ);
		
		JLabel lblenQueZona = new JLabel("¿En que zona se encuentra? ");
		lblenQueZona.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblenQueZona.setBounds(23, 139, 175, 16);
		contentPane.add(lblenQueZona);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 14));
		textField.setBounds(192, 134, 45, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnMostrar.setBounds(249, 134, 117, 29);
		contentPane.add(btnMostrar);
		
		JLabel lblLocaldad = new JLabel("Localdad");
		lblLocaldad.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblLocaldad.setBounds(23, 171, 404, 16);
		contentPane.add(lblLocaldad);
		
		JLabel lblRecomendacionMusical = new JLabel("Recomendacion musical: ");
		lblRecomendacionMusical.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblRecomendacionMusical.setBounds(23, 221, 214, 16);
		contentPane.add(lblRecomendacionMusical);
		
		JLabel lblLink = new JLabel("link");
		lblLink.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblLink.setBounds(176, 221, 61, 16);
		contentPane.add(lblLink);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnFinalizar.setBounds(176, 273, 117, 29);
		contentPane.add(btnFinalizar);
	}
}
