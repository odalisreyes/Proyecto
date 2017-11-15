import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Tercero extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tercero frame = new Tercero();
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
	public Tercero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Esoge un restaurante");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(143, 98, 161, 16);
		contentPane.add(lblNewLabel);
		
		JComboBox restaurante = new JComboBox();
		restaurante.setFont(new Font("Calibri", Font.PLAIN, 14));
		restaurante.setModel(new DefaultComboBoxModel(new String[] {"Burger King", "McDonald’s", "Dominos Pizza"}));
		restaurante.setBounds(132, 119, 172, 27);
		contentPane.add(restaurante);
		
		JButton btnListo = new JButton("Continuar");
		btnListo.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnListo.setBounds(162, 177, 117, 29);
		contentPane.add(btnListo);
		
		JLabel iOrder = new JLabel("iOrder");
		iOrder.setHorizontalAlignment(SwingConstants.CENTER);
		iOrder.setFont(new Font("Calibri", Font.BOLD, 23));
		iOrder.setBounds(6, 38, 438, 26);
		contentPane.add(iOrder);
		
		
	}
}
