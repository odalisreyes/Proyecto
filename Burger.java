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
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"- Escoge una opci\u00f3n -", 
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
		comboBox_4.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboBox_4.setBounds(19, 373, 228, 27);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"- Escoge tu bebida -", "Soda Pepsi®", 
				"Soda Pepsi®Dieta", "Soda 7-UP®", "Soda Mirinda®", "Soda Grapette®", "Agua Pura",
				"Café", "Chocolate Caliente", "Te Caliente"}));
		contentPane.add(comboBox_4);
		
		JLabel lblExtras = new JLabel("Extras");
		lblExtras.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblExtras.setBounds(30, 412, 61, 16);
		contentPane.add(lblExtras);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboBox_5.setBounds(19, 437, 228, 27);
		comboBox_5.setModel(new DefaultComboBoxModel(new String [] {"- Escoge algo extra -", "Papas Fritas",
				"Aros de Cebolla", "Hash Browns"}));
		contentPane.add(comboBox_5);
		
		JLabel lblPostres = new JLabel("Postres");
		lblPostres.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblPostres.setBounds(30, 476, 61, 16);
		contentPane.add(lblPostres);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboBox_6.setBounds(19, 504, 228, 27);
		comboBox_6.setModel(new DefaultComboBoxModel(new String [] {"- Endulzate la vida con -", "Tostadas Francesas",
				"HERSHEY'S® Sundae Pie", "REESE'S® Pie", "Pie Manzana", "Pie Queso", "Cinnamon Roll", "BK® Cookie Chocolate Chips",
				"BK® Cookie Macadamia", "Helado Cono", "Sundae", "Canasta Whafle", "Batido"}));
		contentPane.add(comboBox_6);
		
		JLabel lblHamburguesasParaNinos = new JLabel("Opciones para ni\u00f1os");
		lblHamburguesasParaNinos.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblHamburguesasParaNinos.setBounds(30, 543, 152, 16);
		contentPane.add(lblHamburguesasParaNinos);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(19, 571, 228, 27);
		comboBox_7.setModel(new DefaultComboBoxModel(new String [] {"- Escoge una opci\u00f3n -", "Quesoburguesa",
				"4 BK® Nuggets", "Derretido", "HAMBURGEUSA"}));
		contentPane.add(comboBox_7);
	}
}
