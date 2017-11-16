import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * Esta clase tiene como principal objetivo hacer la GUI para tomar las opciones
 * que el usuario elija (si es que su preferencia es comida de Dominos)
 * 
 * @author Mayra Silva 17276
 * @author Odalis Reyes 17032
 * @author Ivan Maldonado 17211
 * 
 * @file Dominos.java
 * @since 14/11/17
 */
public class Pedido extends JFrame {

	private JPanel contentPane;
	Manager controlador = new Manager();
	Localidades local=new Localidades();
	
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedido frame = new Pedido();
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
	public Pedido() {
		controlador.getMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/*
		 * labels
		 */
		JLabel lbtitulo = new JLabel("Â¡Escoge tu pizza favorita!");
		lbtitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbtitulo.setFont(new Font("Calibri", Font.BOLD, 20));
		lbtitulo.setBounds(6, 26, 509, 25);
		contentPane.add(lbtitulo);

		JLabel lblNewLabel = new JLabel("Especialidades de pizza");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 83, 144, 16);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Pizzas Premium");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 144, 144, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPizzaDeUn = new JLabel("Pizza de un ingrediente");
		lblPizzaDeUn.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblPizzaDeUn.setBounds(29, 207, 165, 16);
		contentPane.add(lblPizzaDeUn);
		
		JLabel lblNewLabel_2 = new JLabel("Don Calzzone");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(30, 268, 98, 16);
		contentPane.add(lblNewLabel_2);

		/*
		 * ComboBox
		 */
		JComboBox premiumCB = new JComboBox();
		premiumCB.setModel(new DefaultComboBoxModel(
		new String[] { "- Escoge una pizza premium -", "Carne y Tocino", "Extravaganza", "Churrazco" }));
		premiumCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		premiumCB.setBounds(19, 162, 216, 27);
		contentPane.add(premiumCB);
		
		JComboBox especialCB = new JComboBox();
		especialCB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				especialCB.getSelectedIndex();
				int total = especialCB.getSelectedIndex();
				
			}
		});
		especialCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		especialCB.setModel(new DefaultComboBoxModel(new String[] { "- Escoge una especialidad -", "5 Carnes",
		"Hawaiana", "Americana", "Deluxe", "Margarita", "Veggy" }));
		especialCB.setBounds(19, 102, 216, 27);
		contentPane.add(especialCB);

		JComboBox unoCB = new JComboBox();
		unoCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		unoCB.setModel(new DefaultComboBoxModel(
				new String[] { "- Escoge un tipo de pizza -", "Carne Molida", "Salami", "Pepperoni", "JamÃ³n" }));
		unoCB.setBounds(19, 224, 216, 27);
		contentPane.add(unoCB);

		JComboBox calzzoneCB = new JComboBox();
		calzzoneCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		calzzoneCB.setModel(new DefaultComboBoxModel(new String[] { "- Escoge un Don Calzzone -",
				"Don Calzzone Pollo Chipotle", "Don Calzzone Tex-Mex", "Don Calzzone Deluxe", "Don Calzzone Tropical",
				"Don Calzzone BBQ", "Don Calzzone Italian Chicken", "Don Calzzone Di Carne" }));
		calzzoneCB.setBounds(19, 286, 216, 27);
		contentPane.add(calzzoneCB);

		JLabel A = new JLabel("Alitas y costillas");
		A.setFont(new Font("Calibri", Font.PLAIN, 14));
		A.setBounds(30, 327, 164, 16);
		contentPane.add(A);

		JComboBox alitasCB = new JComboBox();
		alitasCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		alitasCB.setModel(new DefaultComboBoxModel(
				new String[] { "- Escoge una opcion -", "Bucket", "Alitas", "Costillas", "\t\t" }));
		alitasCB.setBounds(19, 345, 216, 27);
		contentPane.add(alitasCB);

		JLabel lblPostres = new JLabel("Postres");
		lblPostres.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblPostres.setBounds(30, 380, 61, 27);
		contentPane.add(lblPostres);

		JComboBox postreCB = new JComboBox();
		postreCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		postreCB.setModel(new DefaultComboBoxModel(new String[] { "- Escoge un postre -", "Cheesy Breads", "Canelitas",
				"Brownie", "Helado Fresa", "Helado Vanilla", "Helado Chocolate", "Don Calzzone Nutella Fresas" }));
		postreCB.setBounds(19, 406, 216, 27);
		contentPane.add(postreCB);

		JLabel lblExtras = new JLabel("Extras");
		lblExtras.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblExtras.setBounds(30, 445, 61, 26);
		contentPane.add(lblExtras);

		JComboBox extraCB = new JComboBox();
		extraCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		extraCB.setModel(new DefaultComboBoxModel(new String[] { "- Escoge un extra -", "Salsa Barbacoa",
				"Salsa Cayenne", "Dip Tropical", "Salsa Domino's", "Dulce de Leche", "Chips Lays" }));
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
		
		ButtonGroup grupo= new ButtonGroup();
		grupo.add(a1);
		grupo.add(a2);
		grupo.add(a3);
		grupo.add(a4);

		JComboBox bebidaCB = new JComboBox();
		bebidaCB.setModel(new DefaultComboBoxModel(new String[] { "- Escoge una bebida -", "Coca Cola", "Diet Coke",
				"Sprite", "Fanta Naranja", "Coca Cola ZERO", "Agua Pura" }));
		bebidaCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		bebidaCB.setBounds(19, 528, 216, 27);
		contentPane.add(bebidaCB);

		JButton comprarB = new JButton("Comprar");
		
		comprarB.setFont(new Font("Calibri", Font.PLAIN, 14));
		comprarB.setBounds(219, 588, 117, 29);
		contentPane.add(comprarB);
	

		
		comprarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total=0;
						
				int rand =(int)( Math.random()*100+1);
				if(a1.isSelected()) {
					total=total+1;
				}
				if(a2.isSelected()) {
					total=total+2;
				}
				if(a3.isSelected()) {
					total=total+3;
				}
				if(a4.isSelected()) {
					total=total+4;
				}
				total=total+rand;
				
				
				String txt="El total de su orden es: " + total + "\n" ;
				JOptionPane.showMessageDialog(null, txt);
				
			}
		});

	}


}
