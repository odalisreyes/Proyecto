
import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;


/**
 * Esta clase tiene como proposito realizar la conexión a la base de datos
 * 
 * @author Mayra Silva    17276
 * @author Odalis Reyes   17032
 * @author Ivan Maldonado 17211
 * 
 * @file DbConnection.java
 * @since 10/11/17
 */

public class DbConnection {
	
	Datastore based;
	
	/*private Datastore arjona;
	 * 	private List<Usuario> usuarios;
	MongoClient mongo;
	MongoDatabase database;
<<<<<<< Updated upstream
	MongoCollection<Document> personita;
	
<<<<<<< Updated upstream
	 */

=======
	
=======
	MongoCollection<Document> usuarios;
>>>>>>> Stashed changes
>>>>>>> Stashed changes
	public DbConnection() {
		
		MongoClient mongo = new MongoClient();
		Morphia morphia = new Morphia();
		
		/* Clases a guardar */
		morphia.map(Usuario.class);
		
		/* Base de datos */
		based = morphia.createDatastore(mongo, "iOrder");
		
		
		/**
		 * try {
			mongo = new MongoClient( "localhost" , 27017 );
<<<<<<< Updated upstream
=======
			database = mongo.getDatabase("iOrder");
<<<<<<< Updated upstream
>>>>>>> Stashed changes
			personita = database.getCollection("Usuarios");
=======
			usuarios = database.getCollection("Usuarios");
>>>>>>> Stashed changes
			System.out.println("Conexion establecida");
		} catch(Exception e) {
			System.out.println("Error en la conexion");
		}}

		 */
		
	
			
	/**
	 * Metodo para guardar los objetos de tipo Usuario en la base de datos
	 * @param a
	 * public void Save(Usuario a) {
		arjona.save(a); 
	}
	 */
	
	
<<<<<<< Updated upstream
	
	/**
	 * Metodo para hacer una consulta en la lista de usuarios de tipo Usuario
	 * @return usuarios
	 * 	public List<Usuario> Lista() {
		Query<Usuario> consulta = arjona.createQuery(Usuario.class);
		usuarios = consulta.asList();
		return usuarios;
	}
	 */


	//Creacion de metodo para llenar base de datos
	public void addUsuario(Usuario user){
		
		Document nuevo = new Document("title", "") 
			      .append("Nombre", user.getNombre())
			      .append("Tarjeta", user.getTarjeta()) 
			      .append("CVV", user.getCvv()) 
			      .append("FechaExpiracion", user.getFechaExp());
		
		this.usuarios.insertMany(user); 
	
		
	}
>>>>>>> Stashed changes
>>>>>>> Stashed changes
	
}
