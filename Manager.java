import com.mongodb.MongoClient;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
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
	/* atributos */
	private Datastore based;
	private ArrayList<Usuario> usuario;

	public Manager() {
		/* Constructor del ArrayList */
		usuario = new ArrayList<Usuario>();
		
		MongoClient mongo = new MongoClient();
		Morphia morphia = new Morphia();

		/* Clases a guardar */
		morphia.map(Usuario.class);

		/* Base de datos */
		based = morphia.createDatastore(mongo, "iOrder");

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
	public void crearUser(String user, String password, String nombre, String apellido, String tarjeta, int cvv,
			int mes, int ano) {
		Usuario bang = new Usuario(user, password, nombre, apellido, tarjeta, cvv, mes, ano);
		based.save(bang);
	}

	/**
	 * Verificacion para el ingreso de un usuario ya existente
	 * 
	 * @param usuario
	 *            un parametro de tipo usuario
	 * @return ask tipo boolean
	 */
	public boolean verificarUser(Usuario usuario) {
		boolean ask = false;
		/* Se crea un query con la clase de Usuario */
		Query<Usuario> query = based.createQuery(Usuario.class);
		/* se crea una lista usando query */
		List<Usuario> lista = query.asList();
		int cuenta = 0;
		/* se recorre la lista de tipo usuario y esta se agrega a un ArrayList */
		for (Usuario i : lista) {
			this.usuario.add(cuenta, i);
			cuenta++; 	}

		/*
		 * se recorre nuevamente la lista pero usando el array para verificar si el
		 * usuario ya existe o no
		 */
		for (Usuario k : this.usuario) {
			if (usuario.getUser().equals(k.getUser()) && usuario.getPassword().equals(k.getPassword())) {
				ask = true;
			} }

		return ask; }

}
