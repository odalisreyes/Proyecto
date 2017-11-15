import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;

public class Dominos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dominos frame = new Dominos();
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
	public Dominos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbtitulo = new JLabel("¡Escoge tu pizza favorita!");
		lbtitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbtitulo.setFont(new Font("Calibri", Font.BOLD, 20));
		lbtitulo.setBounds(6, 26, 509, 25);
		contentPane.add(lbtitulo);
		
		JLabel lblNewLabel = new JLabel("Especialidades de pizza");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 83, 144, 16);
		contentPane.add(lblNewLabel);
		
		JComboBox especialCB = new JComboBox();
		especialCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		especialCB.setModel(new DefaultComboBoxModel(new String[] {"- Escoge una especialidad -", "5 Carnes", "Hawaiana", "Americana", "Deluxe", "Margarita", "Veggy"}));
		especialCB.setBounds(19, 102, 216, 27);
		contentPane.add(especialCB);
		
		JLabel lblNewLabel_1 = new JLabel("Pizzas Premium");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 144, 144, 16);
		contentPane.add(lblNewLabel_1);
		
		JComboBox premiumCB = new JComboBox();
		premiumCB.setModel(new DefaultComboBoxModel(new String[] {"- Escoge una pizza premium -", "Carne y Tocino", "Extravaganza", "Churrazco"}));
		premiumCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		premiumCB.setBounds(19, 162, 216, 27);
		contentPane.add(premiumCB);
		
		JLabel lblPizzaDeUn = new JLabel("Pizza de un ingrediente");
		lblPizzaDeUn.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblPizzaDeUn.setBounds(29, 207, 165, 16);
		contentPane.add(lblPizzaDeUn);
		
		JComboBox unoCB = new JComboBox();
		unoCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		unoCB.setModel(new DefaultComboBoxModel(new String[] {"- Escoge un tipo de pizza -", "Carne Molida", "Salami", "Pepperoni", "Jamón"}));
		unoCB.setBounds(19, 224, 216, 27);
		contentPane.add(unoCB);
		
		JLabel lblNewLabel_2 = new JLabel("Don Calzzone");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(30, 268, 98, 16);
		contentPane.add(lblNewLabel_2);
		
		JComboBox calzzoneCB = new JComboBox();
		calzzoneCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		calzzoneCB.setModel(new DefaultComboBoxModel(new String[] {"- Escoge un Don Calzzone -", "Don Calzzone Pollo Chipotle", "Don Calzzone Tex-Mex", "Don Calzzone Deluxe", "Don Calzzone Tropical", "Don Calzzone BBQ", "Don Calzzone Italian Chicken", "Don Calzzone Di Carne"}));
		calzzoneCB.setBounds(19, 286, 216, 27);
		contentPane.add(calzzoneCB);
		
		JLabel A = new JLabel("Alitas y costillas");
		A.setFont(new Font("Calibri", Font.PLAIN, 14));
		A.setBounds(30, 327, 164, 16);
		contentPane.add(A);
		
		JComboBox alitasCB = new JComboBox();
		alitasCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		alitasCB.setModel(new DefaultComboBoxModel(new String[] {"- Escoge una opcion -", "Bucket", "Alitas", "Costillas", "\t\t"}));
		alitasCB.setBounds(19, 345, 216, 27);
		contentPane.add(alitasCB);
		
		JLabel lblPostres = new JLabel("Postres");
		lblPostres.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblPostres.setBounds(30, 380, 61, 27);
		contentPane.add(lblPostres);
		
		JComboBox postreCB = new JComboBox();
		postreCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		postreCB.setModel(new DefaultComboBoxModel(new String[] {"- Escoge un postre -", "Cheesy Breads", "Canelitas", "Brownie", "Helado Fresa", "Helado Vanilla", "Helado Chocolate", "Don Calzzone Nutella Fresas"}));
		postreCB.setBounds(19, 406, 216, 27);
		contentPane.add(postreCB);
		
		JLabel lblExtras = new JLabel("Extras");
		lblExtras.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblExtras.setBounds(30, 445, 61, 26);
		contentPane.add(lblExtras);
		
		JComboBox extraCB = new JComboBox();
		extraCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		extraCB.setModel(new DefaultComboBoxModel(new String[] {"- Escoge un extra -", "Salsa Barbacoa", "Salsa Cayenne", "Dip Tropical", "Salsa Domino's", "Dulce de Leche", "Chips Lays"}));
		extraCB.setBounds(19, 467, 216, 27);
		contentPane.add(extraCB);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(81, 0, 173, 21);
		contentPane.add(tabbedPane);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblCantidad.setBounds(278, 74, 212, 16);
		contentPane.add(lblCantidad);
		
		JRadioButton a4 = new JRadioButton("4");
		a4.setFont(new Font("Calibri", Font.PLAIN, 14));
		a4.setBounds(452, 102, 46, 23);
		contentPane.add(a4);
		
		JRadioButton a3 = new JRadioButton("3");
		a3.setFont(new Font("Calibri", Font.PLAIN, 14));
		a3.setBounds(394, 102, 46, 23);
		contentPane.add(a3);
		
		JRadioButton a2 = new JRadioButton("2");
		a2.setFont(new Font("Calibri", Font.PLAIN, 14));
		a2.setBounds(336, 102, 46, 23);
		contentPane.add(a2);
		
		JRadioButton a1 = new JRadioButton("1");
		a1.setFont(new Font("Calibri", Font.PLAIN, 14));
		a1.setBounds(278, 102, 46, 23);
		contentPane.add(a1);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblBebidas.setBounds(30, 510, 61, 16);
		contentPane.add(lblBebidas);
		
		JComboBox bebidaCB = new JComboBox();
		bebidaCB.setModel(new DefaultComboBoxModel(new String[] {"- Escoge una bebida -", "Coca Cola", "Diet Coke", "Sprite", "Fanta Naranja", "Coca Cola ZERO", "Agua Pura"}));
		bebidaCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		bebidaCB.setBounds(19, 528, 216, 27);
		contentPane.add(bebidaCB);
		
		JButton comprarB = new JButton("Comprar");
		comprarB.setFont(new Font("Calibri", Font.PLAIN, 14));
		comprarB.setBounds(219, 588, 117, 29);
		contentPane.add(comprarB);
		
		JRadioButton b1 = new JRadioButton("1");
		b1.setFont(new Font("Calibri", Font.PLAIN, 14));
		b1.setBounds(278, 162, 46, 23);
		contentPane.add(b1);
		
		JRadioButton b2 = new JRadioButton("2");
		b2.setFont(new Font("Calibri", Font.PLAIN, 14));
		b2.setBounds(336, 162, 46, 23);
		contentPane.add(b2);
		
		JRadioButton b3 = new JRadioButton("3");
		b3.setFont(new Font("Calibri", Font.PLAIN, 14));
		b3.setBounds(394, 162, 46, 23);
		contentPane.add(b3);
		
		JRadioButton radioButton = new JRadioButton("4");
		radioButton.setFont(new Font("Calibri", Font.PLAIN, 14));
		radioButton.setBounds(452, 162, 46, 23);
		contentPane.add(radioButton);
		
		JRadioButton c1 = new JRadioButton("1");
		c1.setFont(new Font("Calibri", Font.PLAIN, 14));
		c1.setBounds(278, 224, 46, 23);
		contentPane.add(c1);
		
		JRadioButton c2 = new JRadioButton("2");
		c2.setFont(new Font("Calibri", Font.PLAIN, 14));
		c2.setBounds(336, 224, 46, 23);
		contentPane.add(c2);
		
		JRadioButton c3 = new JRadioButton("3");
		c3.setFont(new Font("Calibri", Font.PLAIN, 14));
		c3.setBounds(394, 224, 46, 23);
		contentPane.add(c3);
		
		JRadioButton c4 = new JRadioButton("4");
		c4.setFont(new Font("Calibri", Font.PLAIN, 14));
		c4.setBounds(452, 224, 46, 23);
		contentPane.add(c4);
		
		JRadioButton d1 = new JRadioButton("1");
		d1.setFont(new Font("Calibri", Font.PLAIN, 14));
		d1.setBounds(278, 286, 46, 23);
		contentPane.add(d1);
		
		JRadioButton d2 = new JRadioButton("2");
		d2.setFont(new Font("Calibri", Font.PLAIN, 14));
		d2.setBounds(336, 286, 46, 23);
		contentPane.add(d2);
		
		JRadioButton d3 = new JRadioButton("3");
		d3.setFont(new Font("Calibri", Font.PLAIN, 14));
		d3.setBounds(394, 286, 46, 23);
		contentPane.add(d3);
		
		JRadioButton d4 = new JRadioButton("4");
		d4.setFont(new Font("Calibri", Font.PLAIN, 14));
		d4.setBounds(452, 286, 46, 23);
		contentPane.add(d4);
		
		JRadioButton e1 = new JRadioButton("1");
		e1.setFont(new Font("Calibri", Font.PLAIN, 14));
		e1.setBounds(278, 345, 46, 23);
		contentPane.add(e1);
		
		JRadioButton e2 = new JRadioButton("2");
		e2.setFont(new Font("Calibri", Font.PLAIN, 14));
		e2.setBounds(336, 345, 46, 23);
		contentPane.add(e2);
		
		JRadioButton e3 = new JRadioButton("3");
		e3.setFont(new Font("Calibri", Font.PLAIN, 14));
		e3.setBounds(394, 345, 46, 23);
		contentPane.add(e3);
		
		JRadioButton e4 = new JRadioButton("4");
		e4.setFont(new Font("Calibri", Font.PLAIN, 14));
		e4.setBounds(452, 345, 46, 23);
		contentPane.add(e4);
		
		JRadioButton f1 = new JRadioButton("1");
		f1.setFont(new Font("Calibri", Font.PLAIN, 14));
		f1.setBounds(278, 406, 46, 23);
		contentPane.add(f1);
		
		JRadioButton f2 = new JRadioButton("2");
		f2.setFont(new Font("Calibri", Font.PLAIN, 14));
		f2.setBounds(336, 406, 46, 23);
		contentPane.add(f2);
		
		JRadioButton f3 = new JRadioButton("3");
		f3.setFont(new Font("Calibri", Font.PLAIN, 14));
		f3.setBounds(394, 406, 46, 23);
		contentPane.add(f3);
		
		JRadioButton f4 = new JRadioButton("4");
		f4.setFont(new Font("Calibri", Font.PLAIN, 14));
		f4.setBounds(452, 406, 46, 23);
		contentPane.add(f4);
		
		JRadioButton g1 = new JRadioButton("1");
		g1.setFont(new Font("Calibri", Font.PLAIN, 14));
		g1.setBounds(278, 467, 46, 23);
		contentPane.add(g1);
		
		JRadioButton g2 = new JRadioButton("2");
		g2.setFont(new Font("Calibri", Font.PLAIN, 14));
		g2.setBounds(336, 467, 46, 23);
		contentPane.add(g2);
		
		JRadioButton g3 = new JRadioButton("3");
		g3.setFont(new Font("Calibri", Font.PLAIN, 14));
		g3.setBounds(394, 467, 46, 23);
		contentPane.add(g3);
		
		JRadioButton g4 = new JRadioButton("4");
		g4.setFont(new Font("Calibri", Font.PLAIN, 14));
		g4.setBounds(452, 467, 46, 23);
		contentPane.add(g4);
		
		JRadioButton h1 = new JRadioButton("1");
		h1.setFont(new Font("Calibri", Font.PLAIN, 14));
		h1.setBounds(278, 528, 46, 23);
		contentPane.add(h1);
		
		JRadioButton h2 = new JRadioButton("2");
		h2.setFont(new Font("Calibri", Font.PLAIN, 14));
		h2.setBounds(336, 528, 46, 23);
		contentPane.add(h2);
		
		JRadioButton h3 = new JRadioButton("3");
		h3.setFont(new Font("Calibri", Font.PLAIN, 14));
		h3.setBounds(394, 528, 46, 23);
		contentPane.add(h3);
		
		JRadioButton h4 = new JRadioButton("4");
		h4.setFont(new Font("Calibri", Font.PLAIN, 14));
		h4.setBounds(452, 528, 46, 23);
		contentPane.add(h4);
	}
}
