import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class Burger extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Burger frame = new Burger();
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
	public Burger() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblescogeTuComida = new JLabel("¡Escoge tu comida favorita!");
		lblescogeTuComida.setHorizontalAlignment(SwingConstants.CENTER);
		lblescogeTuComida.setFont(new Font("Calibri", Font.BOLD, 20));
		lblescogeTuComida.setBounds(6, 20, 509, 40);
		contentPane.add(lblescogeTuComida);
		
		JLabel lblHamburguesas = new JLabel("Hamburguesas de carne");
		lblHamburguesas.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblHamburguesas.setBounds(30, 83, 144, 16);
		contentPane.add(lblHamburguesas);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboBox.setBounds(19, 102, 228, 27);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"- Escoge comida de carne -",
				"WHOPPER®", "WHOPPER® Con Queso", "WHOPPER® Doble", "WHOPPER® Doble Con Queso",
				"WHOPPER® Tejano", "WHOPPER® JR", "Quesoburguesa Doble", "Big King", "BK® Torito",
				"BK® Stacker Doble", "BK® Stacker Triple", "BK® Stacker Cuadruple", "Hamburguesa",
				"Quesoburguesa"}));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Pollo y otros");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 144, 144, 16);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboBox_1.setBounds(19, 172, 228, 27);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"- Escoge comida de pollo/otros -", 
				"King de Pollo", "King de Pollo Americano", "King de Pollo Frances", "King de Pollo Italiano",
				"King de Jamon y Queso", "Tender Crispy", "TENDERGRILL®", "King Pescado", "4 BK® Nuggets",
				"10 BK® Nuggets", "35 BK® Nuggets", "Derretido"}));
		contentPane.add(comboBox_1);
		
		JLabel lblEnsaladas = new JLabel("Ensaladas");
		lblEnsaladas.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblEnsaladas.setBounds(30, 211, 61, 16);
		contentPane.add(lblEnsaladas);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboBox_2.setModel(new DefaultComboBoxModel(new String [] {"- Escoge tu ensalda favorita - ",
				"Shaker de Jamon", "Shaker de Pollo","Ensalada Pollo", "Ensalada Jardinera" }));
		comboBox_2.setBounds(19, 239, 228, 27);
		contentPane.add(comboBox_2);
		
		JLabel lblDesayunos = new JLabel("Desayunos");
		lblDesayunos.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblDesayunos.setBounds(30, 278, 61, 16);
		contentPane.add(lblDesayunos);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboBox_3.setModel(new DefaultComboBoxModel(new String [] {"- Escoge tu desayuno escencial -",
				"Croissan Huevo Queso Jamon", "BK® Chapin con Salchicha", "Panqueques Jamon y Huevo",
				"BK® Muffin Huevo Queso Tocino", "Panqueques Plain", "Tostadas Francesas" }));
		comboBox_3.setBounds(19, 306, 228, 27);
		contentPane.add(comboBox_3);
		
		JLabel lblSodas = new JLabel("Sodas");
		lblSodas.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblSodas.setBounds(30, 345, 61, 16);
		contentPane.add(lblSodas);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(19, 373, 228, 27);
		comboBox_4.setBounds(new DefaultComboBoxModel(new String[] {"- Escoge tu bebida -", "Soda Pepsi®"}));
		contentPane.add(comboBox_4);
	}
}
