import java.util.ArrayList;
import org.mongodb.morphia.query.Query;



/**
 * Esta clase tiene como proposito realizar los metodos necesarios para unir la
 * base de datos con la clase Usuario e implementar los requisitos funcionales
 * 
 * @author Mayra Silva 17276
 * @author Odalis Reyes 17032
 * @author Ivan Maldonado 17211
 * 
 * @file Manager.java
 * @since 10/11/17
 */

public class Manager {
	/* ArrayList de la clase Usuario */
	ArrayList<Usuario> usuario = new ArrayList<Usuario>();
	private DbConnection osito = new DbConnection();
	
	public Manager () {
		/* Constructor del ArrayList*/
		usuario = new ArrayList<Usuario>();
	}
	
	/**
	 * Metodo para crear un usuario y guardarlo en la base de datos
	 *  
	 * @param user
	 *            nombre de usuario para la cuenta
	 * @param password
	 *            contrasena del usuario
	 * @param nombre
	 *            nombre del usuario
	 * @param apellido
	 *            aprellido del usuario
	 * @param tarjeta
	 *            numero de tarjeta del usuario
	 * @param cvv
	 *            cvv de la tarjeta
	 * @param mes
	 *            mes de la fecha de expiracion de la tarjeta
	 * @param ano
	 *            anio del mes de la fecha de expiracion de la tarjeta
	 * @param idUsuario
	 */
	public void crearUser(String user, String password, String nombre, String apellido, String tarjeta, int cvv, int mes,
			int ano) {
		DbConnection big = new DbConnection();
		Usuario bang = new Usuario(user, password, nombre, apellido, tarjeta, cvv, mes,
			ano);
		usuario.add(bang);
		big.based.save(usuario);
	}
	

	
	
	
	
}
