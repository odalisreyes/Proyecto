import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;


/**
 * 
 * @author Mayra Silva    17276
 * @author Odalis Reyes   17032
 * @author Ivan Maldonado 17211
 * 
 * @file Main.java
 * @since 10/11/17
 */
public class Main {

	private JFrame frame;
	private JTextField UsuarioTF;
	private JPasswordField PasswordTF;
	
	
	//Declaracion de variables globales
	Errores error;
	Manager controlador1;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		Manager controlador1= new Manager();

		Errores error = new Errores();

		frame = new JFrame();
		frame.setBounds(100, 100, 454, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel iOrder = new JLabel("iOrder");
		iOrder.setHorizontalAlignment(SwingConstants.CENTER);
		iOrder.setFont(new Font("Calibri", Font.BOLD, 23));
		iOrder.setBounds(6, 38, 438, 26);
		frame.getContentPane().add(iOrder);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario:");
		lblNombreDeUsuario.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblNombreDeUsuario.setBounds(134, 91, 135, 16);
		frame.getContentPane().add(lblNombreDeUsuario);
		
		/* TextField para ingresar el usuario */
		UsuarioTF = new JTextField();
		UsuarioTF.setFont(new Font("Calibri", Font.PLAIN, 14));
		UsuarioTF.setBounds(126, 111, 201, 26);
		frame.getContentPane().add(UsuarioTF);
		UsuarioTF.setColumns(10);

		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setFont(new Font("Calibri", Font.PLAIN, 14));
		lblContrasea.setBounds(134, 150, 135, 16);
		frame.getContentPane().add(lblContrasea);
		
		/* TextField para ingresar la contraseña */
		PasswordTF = new JPasswordField();
		PasswordTF.setFont(new Font("Calibri", Font.PLAIN, 14));
		PasswordTF.setBounds(126, 168, 201, 26);
		frame.getContentPane().add(PasswordTF);
		
		/* Boton para crear cuenta */
		JButton CrearB = new JButton("Crear cuenta");
		CrearB.setFont(new Font("Calibri", Font.PLAIN, 14));
		CrearB.setBounds(123, 223, 114, 29);
		frame.getContentPane().add(CrearB);
		
		/* Boton para ingresar al iOrder */
		JButton IngresarB = new JButton("Ingresar");
		
		IngresarB.setFont(new Font("Calibri", Font.PLAIN, 14));
		IngresarB.setBounds(238, 223, 89, 29);
		frame.getContentPane().add(IngresarB);
		
		
		/**
		 * action lsitener del boton crear
		 * lleva a otro JFrame para llenar los datos de un nuevo usuario
		 */
		CrearB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Second CrearTF = new Second();
				CrearTF.setVisible(true);
			}
		});
		
		//Metodo de action listener del boton ingresar
		IngresarB.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				//Si en este caso, el usuario no ingresa nada en el text field aparecera un error
				if(UsuarioTF.getText().equals("") || PasswordTF.getPassword().toString().equals("")) {
					JOptionPane.showMessageDialog(null, "Debe ingresar su nombre de usuario y/o  contrase�a");
					
					}
				else if(PasswordTF.getPassword().toString().equals("")) {
				JOptionPane.showMessageDialog(null, "Debe ingresar su nombre contrase�a");
			}
				
				
				
				
	
			}
		});
		
		
		
		
	}


	
	
	
}
