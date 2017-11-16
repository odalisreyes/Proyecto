import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



/**
 * 
 * @author Mayra Silva    17276
 * @author Odalis Reyes   17032
 * @author Ivan Maldonado 17211
 * 
 * @since 10/11/17
 */
public class Second extends JFrame {

	private JPanel contentPane;
	private JTextField nombreTF;
	private JTextField apellidoTF;
	private JTextField usernameTF;
	private JPasswordField numTarTF;
	private JTextField cvvTF;
	private JPasswordField pssTF;
	
	
	
	//Declaracion de variables globales.
	Errores error;
	String mensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second frame = new Second();
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
	public Second() {
		Errores error= new Errores();
		Manager x = new Manager();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		/*
		 * labels
		 */
		JLabel lblNmeroDeCvv = new JLabel("Número de CVV");
		lblNmeroDeCvv.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNmeroDeCvv.setBounds(245, 272, 142, 16);
		contentPane.add(lblNmeroDeCvv);
		
		JLabel lblFechaDeExpiracin = new JLabel("Fecha de expiración de la tarjeta");
		lblFechaDeExpiracin.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblFechaDeExpiracin.setBounds(60, 341, 208, 16);
		contentPane.add(lblFechaDeExpiracin);
		
		JLabel lblNmeroDeTarjeta = new JLabel("Número de tarjeta");
		lblNmeroDeTarjeta.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNmeroDeTarjeta.setBounds(60, 272, 130, 16);
		contentPane.add(lblNmeroDeTarjeta);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblContrasea.setBounds(60, 204, 99, 16);
		contentPane.add(lblContrasea);
		
		JLabel lblCreaTuCuenta = new JLabel("¡Crea tu cuenta!");
		lblCreaTuCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreaTuCuenta.setFont(new Font("Calibri", Font.BOLD, 22));
		lblCreaTuCuenta.setBounds(6, 26, 442, 26);
		contentPane.add(lblCreaTuCuenta);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNombre.setBounds(60, 76, 65, 16);
		contentPane.add(lblNombre); 
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblApellido.setBounds(245, 76, 61, 16);
		contentPane.add(lblApellido);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario");
		lblNombreDeUsuario.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNombreDeUsuario.setBounds(60, 141, 130, 16);
		contentPane.add(lblNombreDeUsuario);

		
		/*
		 * TextFields, ComboBox y boton
		 */
		/* Contrasena PasswordField */
		numTarTF = new JPasswordField();
		numTarTF.setFont(new Font("Calibri", Font.PLAIN, 14));
		numTarTF.setBounds(52, 293, 153, 26);
		contentPane.add(numTarTF);
		
		/* nombre de la persona TextField */
		nombreTF = new JTextField();
		nombreTF.setFont(new Font("Calibri", Font.PLAIN, 14));
		nombreTF.setToolTipText("");
		nombreTF.setBounds(52, 97, 153, 26);
		contentPane.add(nombreTF);
		nombreTF.setColumns(10);
		
		/* apellido de la persona TextField */
		apellidoTF = new JTextField();
		apellidoTF.setFont(new Font("Calibri", Font.PLAIN, 14));
		apellidoTF.setBounds(234, 97, 153, 26);
		contentPane.add(apellidoTF);
		apellidoTF.setColumns(10);
		
		
		
		/* Nombre de usuario TextField */
		usernameTF = new JTextField();
		usernameTF.setFont(new Font("Calibri", Font.PLAIN, 14));
		usernameTF.setBounds(52, 159, 335, 26);
		contentPane.add(usernameTF);
		usernameTF.setColumns(10);
		
		/* CVV TextField */
		cvvTF = new JTextField();
		cvvTF.setFont(new Font("Calibri", Font.PLAIN, 14));
		cvvTF.setBounds(234, 293, 153, 26);
		contentPane.add(cvvTF);
		cvvTF.setColumns(10);
		
		
		/* Contrasena TextField */
		pssTF = new JPasswordField();
		pssTF.setFont(new Font("Calibri", Font.PLAIN, 14));
		pssTF.setBounds(52, 225, 335, 26);
		contentPane.add(pssTF);
		
		/* ComboBox del mes */
		JComboBox mesCB = new JComboBox();
		mesCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		mesCB.setModel(new DefaultComboBoxModel(new String[] {"- Mes -", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		mesCB.setBounds(52, 363, 99, 27);
		contentPane.add(mesCB);
		
		/* ComboBox del ano */
		JComboBox anoCB = new JComboBox();
		anoCB.setFont(new Font("Calibri", Font.PLAIN, 14));
		anoCB.setModel(new DefaultComboBoxModel(new String[] {"- Año -", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025"}));
		anoCB.setBounds(163, 363, 92, 27);
		contentPane.add(anoCB);
		
		/* Boton para crear la cuenta */
		JButton createB = new JButton("Crear");
		createB.setFont(new Font("Calibri", Font.PLAIN, 14));
		createB.setBounds(260, 421, 117, 29);
		contentPane.add(createB);
		
		JButton regresarB = new JButton("Regresar");
		regresarB.setFont(new Font("Calibri", Font.PLAIN, 14));
		regresarB.setBounds(88, 421, 117, 29);
		contentPane.add(regresarB);
		
		
		/**
		 * action listener del boton crear
		 */
		createB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/* errores por si dejan espacios vacios */
				if(nombreTF.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");
				}
				if(apellidoTF.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Debe ingresar un apellido");
				}
				if(pssTF.equals("")) {
					JOptionPane.showMessageDialog(null, "Debe ingresar una contrase\u00f1a");
				}
				if(usernameTF.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Debe ingresar un nombre de usuario");
				}
				if(numTarTF.equals("")) {
					JOptionPane.showMessageDialog(null, "Debe ingresar un n\u00famero de tarjeta");
				}
				if(cvvTF.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Debe ingresar un n\u00famero de CVV");
				}
				if(mesCB.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "«- Mes -» no es una opci\u00f3n v\u00e1lida. Eliga un mes correcto");
				}
				if(anoCB.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "«- A\u00f1o -» no es una opci\u00f3n v\u00e1lida. Eliga un a\u00f1o correcto");
				}

				
				if(error.verificarString(usernameTF.getText())==false) {
					JOptionPane.showMessageDialog(null, "Debe ingresar solo letras");
				}
				

				/*
				 * error para String nombre
				 */
				
				if(error.verificarString(nombreTF.getText())==false) {
					mensaje = "¡Debe de ingresar solamente letras!" + "\n" + "Ingrese los datos nuevamente.";
					JOptionPane.showMessageDialog(null, mensaje);
				}
				
				/*
				 * error para String apellido
				 */
				
				if(error.verificarString(apellidoTF.getText())==false) {
					mensaje = "¡Debe de ingresar solamente letras!" + "\n" + "Ingrese los datos nuevamente.";
					JOptionPane.showMessageDialog(null, mensaje);
				}
				
				if(error.verificarInt(cvvTF.getText())==false) {
					mensaje = "¡Debe de ingresar solamente letras!" + "\n" + "Ingrese los datos nuevamente.";
					JOptionPane.showMessageDialog(null, mensaje);
				}
				/**
				 * String numeroTarjeta=String.valueOf(numTarTF);
				if(error.verificarInt(numeroTarjeta)==false) {
					JOptionPane.showMessageDialog(null, "Debe ingresar solo n\u00fameros");
				}
				 */
				
				
				
				
			
				
				
				/**
				 * verificacion de un usuario ya existente 
				 */
				Manager nuevoM = new Manager();
				if (nuevoM.verificarUser(usernameTF.getText()) == true) {
					JOptionPane.showMessageDialog(null, "Nombre de usuario ya existente. Cree un nuevo usuario");
					
				}
				else if (nuevoM.verificarUser(usernameTF.getText()) == false){
					nuevoM.crearUser(usernameTF.getText(), new String(pssTF.getPassword()), nombreTF.getText(), apellidoTF.getText(), numTarTF.getPassword().toString(), Integer.parseInt(cvvTF.getText()), mesCB.getSelectedIndex(), anoCB.getSelectedIndex());
					/* regresa al main */
					setVisible(false);
				}
				
			}
		});
		
		
		regresarB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
	}
}
