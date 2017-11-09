/*
 * 
 * Esta clase contiene la matriz con los datos de cada restaurante con el fin de tener almacenados los datos sin tener que ingresarlos 
 * cada vez que comience el programa.
 * 
 * @Authors: Oliver Graf  17190
 * 			 Ivan Maldonado  17211
 * 			 Odalis Reyes  17032
 * 			 Mayra Silva  17276
 * @File name: Usuario.java
 * @Date and Project: Proyecto final de POO (20/09/2017)
 */
import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;  
public class DbConnection {
	MongoClient mongo;
	MongoDatabase database;
	MongoCollection<Document> estudiantes;
	public DbConnection() {
		try {
			mongo = new MongoClient( "localhost" , 27017 );
			database = mongo.getDatabase("iOrder");
			estudiantes = database.getCollection("Usuarios");
			System.out.println("Conexion establecida");
		}catch(Exception e) {
			System.out.println("Error en la conexion");
		}
			
	}
}
