import org.mongodb.morphia.annotations.Entity;

/**
 * Esta clase tiene como principal objetivo guardar los datos del usuario y los
 * datos del vehículo que usa el usuario. Se creó el constructor, junto con los
 * getters y setters de cada atributo.
 * 
 * @author odalisreyes
 * @author Mayra Silva 17276
 * @author Odalis Reyes 17032
 * @author Ivan Maldonado 17211
 * 
 * @file Usuario.java
 * @since 20/09/17
 */


@Entity
public class Usuario {

	/* Se declaran los atributos necesarios para la clase Usuario */
	private String user;
	private String password;
	private String nombre;
	private String apellido;
	private int tarjeta;
	private int cvv;
	private String fechaExp;

	/**
	 * Constructor. Se crea el constructor, con la inicialización de cada atributo
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
	 * @param fechaExp
	 *            fecha de expiracion de la tarjeta
	 */
	public Usuario(String user, String password, String nombre, String apellido, int tarjeta, int cvv,
			String fechaExp) {
		this.user = user;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tarjeta = tarjeta;
		this.cvv = cvv;
		this.fechaExp = fechaExp;
	}

	/**
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *            nombre de usuario de la cuenta
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            la contrasena
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            nombre del usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 *            apellido del usuario
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return tarjeta
	 */
	public int getTarjeta() {
		return tarjeta;
	}

	/**
	 * @param tarjeta
	 *            numero de tarjeta
	 */
	public void setTarjeta(int tarjeta) {
		this.tarjeta = tarjeta;
	}

	/**
	 * @return cvv
	 */
	public int getCvv() {
		return cvv;
	}

	/**
	 * @param cvv
	 *            cvv de la tarjeta
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	/**
	 * @return fechaExp
	 */
	public String getFechaExp() {
		return fechaExp;
	}

	/**
	 * @param fechaExp
	 *            fecha de expiracion de la tarjeta
	 */
	public void setFechaExp(String fechaExp) {
		this.fechaExp = fechaExp;
	}

}

