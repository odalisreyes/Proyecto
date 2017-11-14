
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
	MongoCollection<Document> personita;
	
	 */

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
			personita = database.getCollection("Usuarios");
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
	
	
	
	/**
	 * Metodo para hacer una consulta en la lista de usuarios de tipo Usuario
	 * @return usuarios
	 * 	public List<Usuario> Lista() {
		Query<Usuario> consulta = arjona.createQuery(Usuario.class);
		usuarios = consulta.asList();
		return usuarios;
	}
	 */

			
			
	}		
	
}
