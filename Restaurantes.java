import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;



/**
 * @author Mayra Silva    17276
 * @author Odalis Reyes   17032
 * @author Ivan Maldonado 17211
 * 
 * @file Restaurantes.java
 * @since 15/11/17
 */
public class Restaurantes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurantes frame = new Restaurantes();
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
	public Restaurantes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00A1Elije tu McMenu favorito!");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel.setBounds(197, 11, 305, 26);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnDesayuno = new JRadioButton("Desayuno");
		rdbtnDesayuno.setFont(new Font("Calibri", Font.PLAIN, 14));
		rdbtnDesayuno.setBounds(52, 50, 109, 23);
		contentPane.add(rdbtnDesayuno);
		
		JRadioButton rdbtnAlmuerzo = new JRadioButton("Almuerzo/ Cena");
		rdbtnAlmuerzo.setFont(new Font("Calibri", Font.PLAIN, 14));
		rdbtnAlmuerzo.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnAlmuerzo.setBounds(244, 50, 191, 23);
		contentPane.add(rdbtnAlmuerzo);
		
		JRadioButton rdbtnPostre = new JRadioButton("Postres");
		rdbtnPostre.setFont(new Font("Calibri", Font.PLAIN, 14));
		rdbtnPostre.setBounds(544, 50, 109, 23);
		contentPane.add(rdbtnPostre);
		
		JPanel panelDesayuno = new JPanel();
		panelDesayuno.setBounds(21, 90, 289, 421);
		contentPane.add(panelDesayuno);
		panelDesayuno.setLayout(null);
		
		JComboBox comboLight = new JComboBox();
		comboLight.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboLight.setBounds(20, 36, 160, 30);
		comboLight.setModel(new DefaultComboBoxModel(new String[] {"Yogurt con frutas", "Avena, frutas y Maple"}));
		panelDesayuno.add(comboLight);
		
		JLabel lblNewLabel_1 = new JLabel("\u00BFDeseas algo light para desayunar?");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 11, 222, 14);
		panelDesayuno.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u00BFAmaneciste con hambre?");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 77, 204, 30);
		panelDesayuno.add(lblNewLabel_2);
		
		JComboBox comboHambre = new JComboBox();
		comboHambre.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboHambre.setModel(new DefaultComboBoxModel(new String[] {"Egg McMuffin", "McMuffin de Salchicha y huevo", "McMuffin Chapin", "McMuffin de Tocino", "McMuffin de Salchicha", "Burritos", "Hot Cakes", "Desayuno completo", "Desayuno tradicional", "Desayuno Deluxe", "McWrap Ranchero", "McGriddle de Salchicha", "McGriddle de Tocino", "McGriddle de Salchicha y huevo", "Hash Brown"}));
		comboHambre.setBounds(20, 118, 204, 30);
		panelDesayuno.add(comboHambre);
		
		JLabel lblNewLabel_3 = new JLabel("Escoge tu bebida:");
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(20, 164, 174, 22);
		panelDesayuno.add(lblNewLabel_3);
		
		JComboBox comboBebidaDesayuno = new JComboBox();
		comboBebidaDesayuno.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboBebidaDesayuno.setModel(new DefaultComboBoxModel(new String[] {"Te Lipton de Limon", "Cafe", "Chocolate", "Juego de Naranja"}));
		comboBebidaDesayuno.setBounds(20, 197, 202, 30);
		panelDesayuno.add(comboBebidaDesayuno);
		
		JSpinner spinnerLight = new JSpinner();
		spinnerLight.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerLight.setBounds(237, 41, 29, 20);
		panelDesayuno.add(spinnerLight);
		
		JSpinner spinnerBebida = new JSpinner();
		spinnerBebida.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerBebida.setBounds(237, 202, 29, 20);
		panelDesayuno.add(spinnerBebida);
		
		JSpinner spinnerHambre = new JSpinner();
		spinnerHambre.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerHambre.setBounds(237, 123, 29, 20);
		panelDesayuno.add(spinnerHambre);
		
		JButton btnEnviarOrden = new JButton("Enviar Orden");
		btnEnviarOrden.setFont(new Font("Calibri", Font.BOLD, 14));
		btnEnviarOrden.setBounds(63, 268, 151, 23);
		panelDesayuno.add(btnEnviarOrden);
		
		JPanel panel = new JPanel();
		panel.setBounds(332, 207, 434, 304);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("\u00BFDeseas algo light?");
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(10, 11, 154, 14);
		panel.add(lblNewLabel_4);
		
		JComboBox comboLightAlmuerzo = new JComboBox();
		comboLightAlmuerzo.setModel(new DefaultComboBoxModel(new String[] {"McWrap Clasico", "McWrap de Tocino", "McWrap de Guacamol", "Ensalada de Pollo"}));
		comboLightAlmuerzo.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboLightAlmuerzo.setBounds(10, 36, 135, 30);
		panel.add(comboLightAlmuerzo);
		
		JLabel lblnahTengoHambre = new JLabel("\"Nah, tengo hambre\"");
		lblnahTengoHambre.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblnahTengoHambre.setBounds(10, 77, 135, 22);
		panel.add(lblnahTengoHambre);
		
		JComboBox comboHambreAlmuerzo = new JComboBox();
		comboHambreAlmuerzo.setModel(new DefaultComboBoxModel(new String[] {"Derretido con Jamon", "Derretido clasico", "Derretido con Tocino", "Derretido con Tomate", "Big Mac", "Quesoburguesa Doble", "Quesoburguesa", "Hamburguesa", "Sandwich McPollo", "McNifica", "Pollo Frito McCrispy Picante", "Pollo Frito McCrispy", "McNuggets", "Angus Premium Deluxe", "Angus Premium Tocino", "Big Tasty", "Big Tasty Bacon", "Big Tasty Grill", "Big Tasty Pollo Crispy", "Pollo Supreme Tocino", "Pollo Supreme Deluxe", "Pollo Supreme Guacamole", "McFiesta"}));
		comboHambreAlmuerzo.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboHambreAlmuerzo.setBounds(10, 110, 246, 30);
		panel.add(comboHambreAlmuerzo);
		
		JLabel lblNewLabel_5 = new JLabel("Extras:");
		lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(20, 160, 125, 14);
		panel.add(lblNewLabel_5);
		
		JComboBox comboExtras = new JComboBox();
		comboExtras.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboExtras.setModel(new DefaultComboBoxModel(new String[] {"Papas fritas", "McPatatas"}));
		comboExtras.setBounds(10, 185, 115, 30);
		panel.add(comboExtras);
		
		JLabel lblNewLabel_6 = new JLabel("\u00BFY para los nenes?");
		lblNewLabel_6.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(213, 152, 135, 30);
		panel.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cajita Feliz Derretido", "Cajita Feliz Hot Cakes", "Cajita Feliz Muffin", "Cajita Feliz Quesoburguesa", "Cajita Feliz Hamburguesa", "Cajita Feliz McNuggets", "Cajita Feliz Pollo Frito"}));
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboBox.setBounds(213, 190, 107, 20);
		panel.add(comboBox);
	}
}
