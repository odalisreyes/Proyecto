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
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



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
	private JTextField txUbicacion;
	private int indice;
	Manager controlador = new Manager();

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
	
	public void setIndice(int indice) {
		this.indice=indice;
	}
	public int getIndice() {
		return indice;
	}

	/**
	 * Create the frame.
	 */
	public Restaurantes() {
		
		
		controlador.getMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 792, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00BFQue deseas comer?");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel.setBounds(197, 11, 305, 26);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnDesayuno = new JRadioButton("Desayuno");
		
		rdbtnDesayuno.setFont(new Font("Calibri", Font.PLAIN, 14));
		rdbtnDesayuno.setBounds(52, 50, 109, 23);
		contentPane.add(rdbtnDesayuno);
		rdbtnDesayuno.setVisible(false);
		
		JRadioButton rdbtnAlmuerzo = new JRadioButton("Almuerzo/ Cena");
		
		rdbtnAlmuerzo.setFont(new Font("Calibri", Font.PLAIN, 14));
		rdbtnAlmuerzo.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnAlmuerzo.setBounds(244, 50, 191, 23);
		contentPane.add(rdbtnAlmuerzo);
		rdbtnAlmuerzo.setVisible(false);
		
		JRadioButton rdbtnPostre = new JRadioButton("Postres");
		
		rdbtnPostre.setFont(new Font("Calibri", Font.PLAIN, 14));
		rdbtnPostre.setBounds(544, 50, 109, 23);
		contentPane.add(rdbtnPostre);
		
		rdbtnPostre.setVisible(false);
		
		//Se agrupa el radio button
		ButtonGroup grupo= new ButtonGroup();
		grupo.add(rdbtnDesayuno);
		grupo.add(rdbtnAlmuerzo);
		grupo.add(rdbtnPostre);
		
		JPanel panelDesayuno = new JPanel();
		panelDesayuno.setBounds(21, 90, 289, 297);
		contentPane.add(panelDesayuno);
		panelDesayuno.setLayout(null);
		panelDesayuno.setVisible(false);
		
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
		
		JPanel panelAlmuerzo = new JPanel();
		panelAlmuerzo.setBounds(332, 207, 434, 304);
		contentPane.add(panelAlmuerzo);
		panelAlmuerzo.setLayout(null);
		panelAlmuerzo.setVisible(false);
		
		JLabel lblNewLabel_4 = new JLabel("\u00BFDeseas algo light?");
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(20, 18, 154, 14);
		panelAlmuerzo.add(lblNewLabel_4);
		
		JComboBox comboLightAlmuerzo = new JComboBox();
		comboLightAlmuerzo.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboLightAlmuerzo.setBounds(10, 35, 270, 30);
		panelAlmuerzo.add(comboLightAlmuerzo);
		
		JLabel lblnahTengoHambre = new JLabel("\"Nah, tengo hambre\"");
		lblnahTengoHambre.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblnahTengoHambre.setBounds(20, 77, 154, 22);
		panelAlmuerzo.add(lblnahTengoHambre);
		
		JComboBox comboHambreAlmuerzo = new JComboBox();
		comboHambreAlmuerzo.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboHambreAlmuerzo.setBounds(10, 98, 270, 30);
		panelAlmuerzo.add(comboHambreAlmuerzo);
		
		JLabel lblNewLabel_5 = new JLabel("Extras:");
		lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(20, 152, 125, 14);
		panelAlmuerzo.add(lblNewLabel_5);
		
		JComboBox comboExtras = new JComboBox();
		comboExtras.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboExtras.setBounds(10, 166, 135, 30);
		panelAlmuerzo.add(comboExtras);
		
		JLabel lblNewLabel_6 = new JLabel("\u00BFY para los nenes?");
		lblNewLabel_6.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(207, 144, 135, 30);
		panelAlmuerzo.add(lblNewLabel_6);
		
		JComboBox comboNenes = new JComboBox();
		comboNenes.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboNenes.setBounds(203, 166, 175, 30);
		panelAlmuerzo.add(comboNenes);
		
		JButton orden2 = new JButton("Enviar orden");
		orden2.setFont(new Font("Calibri", Font.PLAIN, 14));
		orden2.setBounds(170, 240, 117, 29);
		panelAlmuerzo.add(orden2);
		
		JSpinner spinnerLightAl = new JSpinner();
		spinnerLightAl.setBounds(323, 36, 42, 26);
		panelAlmuerzo.add(spinnerLightAl);
		
		JSpinner spinnerNah = new JSpinner();
		spinnerNah.setBounds(323, 99, 42, 26);
		panelAlmuerzo.add(spinnerNah);
		
		JSpinner spinnerExtra = new JSpinner();
		spinnerExtra.setBounds(148, 167, 42, 26);
		panelAlmuerzo.add(spinnerExtra);
		
		JSpinner spinnerNenes = new JSpinner();
		spinnerNenes.setBounds(378, 167, 42, 26);
		panelAlmuerzo.add(spinnerNenes);
		
		JPanel panelPostre = new JPanel();
		panelPostre.setBounds(332, 90, 434, 93);
		contentPane.add(panelPostre);
		panelPostre.setLayout(null);
		panelPostre.setVisible(false);
		
		JLabel lbldeseasAlgoDulce = new JLabel("¿Se te antoja algo dulce?");
		lbldeseasAlgoDulce.setFont(new Font("Calibri", Font.PLAIN, 14));
		lbldeseasAlgoDulce.setBounds(17, 17, 183, 16);
		panelPostre.add(lbldeseasAlgoDulce);
		
		JComboBox comboPostre = new JComboBox();
		comboPostre.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboPostre.setBounds(6, 37, 194, 27);
		panelPostre.add(comboPostre);
		
		JSpinner spinnerPostre = new JSpinner();
		spinnerPostre.setBounds(220, 36, 42, 26);
		panelPostre.add(spinnerPostre);
		
		JButton orden3 = new JButton("Enviar orden");
		orden3.setFont(new Font("Calibri", Font.PLAIN, 14));
		orden3.setBounds(297, 36, 105, 29);
		panelPostre.add(orden3);
		
		JLabel lblNewLabel_7 = new JLabel("Ingresa tu ubicacion en el trafico:");
		lblNewLabel_7.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(52, 408, 226, 26);
		contentPane.add(lblNewLabel_7);
		
		txUbicacion = new JTextField();
		txUbicacion.setBounds(31, 437, 264, 20);
		contentPane.add(txUbicacion);
		txUbicacion.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Zona:");
		lblNewLabel_8.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(41, 477, 60, 26);
		contentPane.add(lblNewLabel_8);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 21, 1));
		spinner.setBounds(94, 480, 29, 20);
		contentPane.add(spinner);
		
		JButton btnLocalidad = new JButton("Ver localidad");
		btnLocalidad.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnLocalidad.setBounds(145, 468, 165, 43);
		contentPane.add(btnLocalidad);
		
		JComboBox comboBoxRestaurante = new JComboBox();
		
		comboBoxRestaurante.setModel(new DefaultComboBoxModel(new String[] {"McDonalds", "Burger King", "Dominos"}));
		comboBoxRestaurante.setFont(new Font("Calibri", Font.PLAIN, 14));
		comboBoxRestaurante.setBounds(383, 15, 165, 20);
		contentPane.add(comboBoxRestaurante);
		comboBoxRestaurante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxRestaurante.getSelectedIndex()==0) {
					controlador.getMenuByName(controlador.getMenu(), "McDonalds");
					
				}
			}
		});
		
		/*
		 * Action listener para ensenar el panel de desayuno
		 */
		
		rdbtnDesayuno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelDesayuno.setVisible(true);
			}
		});
		
		/*
		 * Action listener para ensenar el panel de almuerzo
		 */
		rdbtnAlmuerzo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAlmuerzo.setVisible(true);
			}
		});
		/*
		 * Action lisener para ensenar el panel postre
		 */
		rdbtnPostre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPostre.setVisible(true);
			}
		});
		/*
		 * Action listener de restaurante
		 */
		
		
		
		
		
		
		

	}
}

