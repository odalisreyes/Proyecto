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
	private JSpinner spinnerLightAl;
	private JSpinner spinnerExtra;
	private JSpinner spinnerNenes;
	private JSpinner spinnerNah;
	private JComboBox comboNenes;
	private JComboBox comboExtras;
	private JComboBox comboHambreAlmuerzo;
	private JComboBox comboLightAlmuerzo;
	private JComboBox comboLight;
	private JComboBox comboHambre;
	private JComboBox comboBebidaDesayuno;
	private JSpinner spinnerLight;
	private JSpinner spinnerHambre;
	private JSpinner spinnerBebida;
	

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
		comboLight.setBounds(10, 35, 204, 30);
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
		comboHambre.setBounds(10, 102, 204, 30);
		panelDesayuno.add(comboHambre);
		
		JLabel lblNewLabel_3 = new JLabel("Escoge tu bebida:");
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 158, 174, 22);
		panelDesayuno.add(lblNewLabel_3);
		
		JComboBox comboBebidaDesayuno = new JComboBox();
		comboBebidaDesayuno.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboBebidaDesayuno.setBounds(10, 180, 204, 30);
		panelDesayuno.add(comboBebidaDesayuno);
		
		JSpinner spinnerLight = new JSpinner();
		spinnerLight.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerLight.setBounds(226, 39, 41, 20);
		panelDesayuno.add(spinnerLight);
		
		JSpinner spinnerBebida = new JSpinner();
		spinnerBebida.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerBebida.setBounds(226, 184, 41, 20);
		panelDesayuno.add(spinnerBebida);
		
		JSpinner spinnerHambre = new JSpinner();
		spinnerHambre.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerHambre.setBounds(226, 106, 41, 20);
		panelDesayuno.add(spinnerHambre);
		
		JButton btnEnviarOrden = new JButton("Enviar Orden");
		btnEnviarOrden.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnEnviarOrden.setBounds(71, 256, 151, 30);
		panelDesayuno.add(btnEnviarOrden);
		
		JPanel panel = new JPanel();
		panel.setBounds(332, 207, 434, 304);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("\u00BFDeseas algo light?");
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(20, 18, 154, 14);
		panel.add(lblNewLabel_4);
		
		JComboBox comboLightAlmuerzo = new JComboBox();
		comboLightAlmuerzo.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboLightAlmuerzo.setBounds(10, 35, 270, 30);
		panel.add(comboLightAlmuerzo);
		
		JLabel lblnahTengoHambre = new JLabel("\"Nah, tengo hambre\"");
		lblnahTengoHambre.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblnahTengoHambre.setBounds(20, 77, 154, 22);
		panel.add(lblnahTengoHambre);
		
		JComboBox comboHambreAlmuerzo = new JComboBox();
		comboHambreAlmuerzo.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboHambreAlmuerzo.setBounds(10, 98, 270, 30);
		panel.add(comboHambreAlmuerzo);
		
		JLabel lblNewLabel_5 = new JLabel("Extras:");
		lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(20, 152, 125, 14);
		panel.add(lblNewLabel_5);
		
		JComboBox comboExtras = new JComboBox();
		comboExtras.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboExtras.setBounds(10, 166, 135, 30);
		panel.add(comboExtras);
		
		JLabel lblNewLabel_6 = new JLabel("\u00BFY para los nenes?");
		lblNewLabel_6.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(207, 144, 135, 30);
		panel.add(lblNewLabel_6);
		
		JComboBox comboNenes = new JComboBox();
		comboNenes.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboNenes.setBounds(203, 166, 175, 30);
		panel.add(comboNenes);
		
		JButton orden2 = new JButton("Enviar orden");
		orden2.setFont(new Font("Calibri", Font.PLAIN, 14));
		orden2.setBounds(170, 240, 117, 29);
		panel.add(orden2);
		
		JSpinner spinnerLightAl = new JSpinner();
		spinnerLightAl.setBounds(323, 36, 42, 26);
		panel.add(spinnerLightAl);
		
		JSpinner spinnerNah = new JSpinner();
		spinnerNah.setBounds(323, 99, 42, 26);
		panel.add(spinnerNah);
		
		JSpinner spinnerExtra = new JSpinner();
		spinnerExtra.setBounds(148, 167, 42, 26);
		panel.add(spinnerExtra);
		
		JSpinner spinnerNenes = new JSpinner();
		spinnerNenes.setBounds(378, 167, 42, 26);
		panel.add(spinnerNenes);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(332, 90, 434, 93);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbldeseasAlgoDulce = new JLabel("¿Se te antoja algo dulce?");
		lbldeseasAlgoDulce.setFont(new Font("Calibri", Font.PLAIN, 14));
		lbldeseasAlgoDulce.setBounds(17, 17, 183, 16);
		panel_1.add(lbldeseasAlgoDulce);
		
		JComboBox comboPostre = new JComboBox();
		comboPostre.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboPostre.setBounds(6, 37, 194, 27);
		panel_1.add(comboPostre);
		
		JSpinner spinnerPostre = new JSpinner();
		spinnerPostre.setBounds(220, 36, 42, 26);
		panel_1.add(spinnerPostre);
		
		JButton orden3 = new JButton("Enviar orden");
		orden3.setFont(new Font("Calibri", Font.PLAIN, 14));
		orden3.setBounds(297, 36, 105, 29);
		panel_1.add(orden3);
	}
}
