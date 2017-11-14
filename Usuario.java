import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

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
	@Id
	public ObjectId id;
	public String user;
	public String password;
	public String nombre;
	public String apellido;
	public int tarjeta;
	public int cvv;
	public int mes;
	public int ano;
	public String idUsuario;

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
	 * @param mes
	 *            mes de la fecha de expiracion de la tarjeta
	 * @param ano
	 *            anio del mes de la fecha de expiracion de la tarjeta
	 * @param idUsuario
	 */
	public Usuario(String user, String password, String nombre, String apellido, int tarjeta, int cvv, int mes, int ano,
			String idUsuario) {
		this.user = user;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tarjeta = tarjeta;
		this.cvv = cvv;
		this.mes = mes;
		this.ano = ano;
		this.idUsuario = idUsuario;
	}

	public Usuario() {
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
	 * @return mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * @param mes
	 *            mes de la fecha de expiracion de la tarjeta
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * @return ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * @param ano
	 *            anio de la fecha de expiracion de la tarjeta
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * 
	 * @return idUsuario
	 */
	public String getId() {
		return idUsuario;
	}

}
