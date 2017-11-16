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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Esta clase tiene como principal objetivo guardar los datos del usuario. 
 * Se creó el constructor, junto con los getters y setters de cada atributo 
 * (no contiene métodos ni toString). En esta clase se crea el @Entity para
 * hacer la conexión con la base de datos. 
 * 
 * @author Mayra Silva 17276
 * @author Odalis Reyes 17032
 * @author quiebres
 *
 *@since 12/11/2017
 */
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
		
		
		JLabel lblNewLabel = new JLabel("Elige un restaurante");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(143, 98, 161, 16);
		contentPane.add(lblNewLabel);
		
		JComboBox restaurante = new JComboBox();
		restaurante.setFont(new Font("Calibri", Font.PLAIN, 14));
		restaurante.setModel(new DefaultComboBoxModel(new String[] {"Burger King", "McDonald�s", "Dominos Pizza"}));
		restaurante.setBounds(132, 119, 172, 27);
		contentPane.add(restaurante);
		
		JButton continuar = new JButton("Continuar");
		continuar.setFont(new Font("Calibri", Font.PLAIN, 14));
		continuar.setBounds(162, 177, 117, 29);
		contentPane.add(continuar);
		
		JLabel iOrder = new JLabel("iOrder");
		iOrder.setHorizontalAlignment(SwingConstants.CENTER);
		iOrder.setFont(new Font("Calibri", Font.BOLD, 23));
		iOrder.setBounds(6, 38, 438, 26);
		contentPane.add(iOrder);
		
		
		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Dominos dominos = new Dominos();
				dominos.setVisible(true);
			}
			
		});
		
	}
}
