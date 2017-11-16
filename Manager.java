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
	private ArrayList<Menu> menu= new ArrayList<Menu>();
	Localidades localidades = new Localidades();
	
	

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
	public boolean verificarUser(String user) {
		boolean ask = false;
		this.usuario = new ArrayList<Usuario>();
		/* Se crea un query con la clase de Usuario */
		Query<Usuario> query = based.createQuery(Usuario.class);
		/* se crea una lista usando query */
		List<Usuario> lista = query.asList();
		int cuenta = 0;
		/* se recorre la lista de tipo usuario y esta se agrega a un ArrayList */
		for (Usuario i : lista) {
			this.usuario.add(cuenta, i);
			cuenta++;
		}

		/*
		 * se recorre nuevamente la lista pero usando el array para verificar si el
		 * usuario ya existe o no
		 */
		for (Usuario k : this.usuario) {
			if (user.equals(k.getUser())) {
				ask = true;
			
			}
		}

		return ask;
	}
	
	
	public boolean verificarMain(String user, String password) {
		boolean hey =  false;
		/* Se crea un query con la clase de Usuario */
		Query<Usuario> query = based.createQuery(Usuario.class);
		/* se crea una lista usando query */
		List<Usuario> lista = query.asList();
		int cuenta = 0;
		/* se recorre la lista de tipo usuario y esta se agrega a un ArrayList */
		for (Usuario i : lista) {
			this.usuario.add(cuenta, i);
			cuenta++;
		}
		
		for (Usuario h : this.usuario) {
			System.out.println(password + h.getPassword());
			if (user.equals(h.getUser()) && password.equals(h.getPassword())) {
				hey = true;
			}
		}
		
		return hey;
		
	}
<<<<<<< HEAD
<<<<<<< HEAD

	/**
	 * 
	 * @return todo el menu del restaurante
	 */
	public ArrayList<Menu> getMenu() {
		Menu m = new Menu();
		// Estas son las dos lineas de codigo que se deben replicar

		/**
		 * MC DONALDS
		 */
		m = new Menu("MacDonalds", "Desayuno", "Light", "Yogurt con frutas", 15);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "Light", "Avena Frutas y Maple", 18);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "mid", "Egg McMuffin", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "mid", "McMuffin de Huevo y Salchicha", 30);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "mid", "McMuffin Chapin", 20);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "mid", "McMuffin de Tocino y Huevo", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "mid", "McMuffin de Salchica", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "mid", "Burritos de Desayuno", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "mid", "Hot Cakes", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "completo", "Desayuno Completo", 30);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "completo", "Desayuno Tradicional", 30);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "completo", "Desayuno Delux", 35);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "mid", "McWrap Ranchero", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "mid", "McGriddle de Salchicha y Huevo", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "mid", "McGriddle de Tocin y Huevo", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "mid", "McGriddle de Salchicha", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Desayuno", "Light", "Hash Brown", 5);
		/*
		 * ALMUERZO
		 */
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "Refa", "Derretido con Jamón", 10);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "Refa", "Derretido Clásico", 10);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "Refa", "Derretido con Tocino", 12);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "Refa", "Derretido con Tomate", 12);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Big Mac", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Quesoburguesa Doble", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Quesoburguesa", 20);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Hamburguesa", 20);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Sandwich McPollo", 20);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "McNifica", 20);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Pollo Frito McCrispy 2 Piezas", 20);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Pollo Frito McCrispy 3 Piezas", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "McNuggets", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Angus Premium Deluxe", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Angus Premium Tocino y Queso", 40);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Big Tasty", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Big Tasty Bacon", 30);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Big Tasty Grill", 30);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Big Tasty Pollo Crispy", 30);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "POLLO SUPREME TOCINO", 30);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "POLLO SUPREME DELUXE", 35);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "McFiesta", 35);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "McWrap Clasico", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "McWrap Tocino", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "McWrap Guacamol", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "mid", "Ensalada de Repollo", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "Light", "Papas", 5);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "Light", "McPatatas", 10);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz Derretido", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz Hot Cakes", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz Muffin de Salchica", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz Quesobuguesa", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz Hamburguesa", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz McNuggets", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz Pollo Frito McCrispy", 25);
		menu.add(m);
		/*
		 * ALMUERZO, POSTRES
		 */
		m = new Menu("MacDonalds", "Almuerzo", "postre", "Pastel de Manzana", 12);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "postre", "Pastel de Piña", 12);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "postre", "Pastel de Queso", 12);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "postre", "McFlury de Oreo", 15);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "postre", "McFlury de M&M's", 15);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "postre", "Sundae de Fresa", 10);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "postre", "Sundae de Caramelo", 10);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "postre", "Sundae de Chocolate", 10);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "postre", "McCono de Vainilla", 8);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "postre", "McCono de Chocolate", 8);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "postre", "McCono Mixto", 8);
		menu.add(m);
		/*
		 * ALMUERZO, ENSALADA
		 */
		m = new Menu("MacDonalds", "Almuerzo", "Ensalada", "Ensalada de Atún", 20);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "Ensalada", "Ensalada de Pollo Grill", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "Ensalada", "Ensalada de Pollo Crispy", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "Ensalada", "Side Salad", 15);
		menu.add(m);
		/*
		 * ALMUERZO, BEBIDAS
		 */
		m = new Menu("MacDonalds", "Bebidas", "fria", "Té Lipton Limón", 9);
		menu.add(m);
		m = new Menu("MacDonalds", "Bebidas", "caliente", "Caf\u00e9", 9);
		menu.add(m);
		m = new Menu("MacDonalds", "Bebidas", "caliente", "Chocolate", 9);
		menu.add(m);
		m = new Menu("MacDonalds", "Bebidas", "fria", "Jugo de Naranja", 9);
		menu.add(m);
		m = new Menu("MacDonalds", "Bebidas", "fria", "Soda Coca-Cola", 9);
		menu.add(m);
		m = new Menu("MacDonalds", "Bebidas", "fria", "Soda Coca-Cola Zero", 9);
		menu.add(m);
		m = new Menu("MacDonalds", "Bebidas", "fria", "Soda Fanta", 9);
		menu.add(m);
		m = new Menu("MacDonalds", "Bebidas", "fria", "Soda Sprite", 9);
		menu.add(m);
		m = new Menu("MacDonalds", "Bebidas", "fria", "Nectar Fresa", 9);
		menu.add(m);
		m = new Menu("MacDonalds", "Bebidas", "fria", "Nectar Mora", 9);
		menu.add(m);
		m = new Menu("MacDonalds", "Bebidas", "fria", "Rosa de Jamaica", 9);
		menu.add(m);
		m = new Menu("MacDonalds", "Bebidas", "fria", "Te Frio", 9);
		menu.add(m);
		m = new Menu("MacDonalds", "Bebidas", "fria", "Agua Pura", 8);
		menu.add(m);

		/**
		 * BURGER KING
		 */
		/* Desayunos */
		m = new Menu("Burger King", "Desayuno", "normal", "Croissan Huevo Queso Jamon", 20);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "normal", "BK® Chapin con Salchicha", 20);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "normal", "Panqueques Jamon y Huevo", 20);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "normal", "BK® Muffin Huevo Queso Tocino", 20);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "normal", "Panqueques Plain", 20);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "normal", "Tostadas Francesas", 15);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "light", "Shaker de Jamon", 20);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "light", "Shaker de Pollo", 20);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "light", "Ensalada Pollo", 20);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "light", "Ensalada Jardinera", 20);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "beb", "Soda Pepsi", 9);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "beb", "Soda Pepsi Dieta", 9);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "beb", "Soda 7-UP", 9);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "beb", "Soda Mirinda", 9);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "beb", "Soda Grapette", 9);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "beb", "Agua Pura", 8);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "beb", "Café", 9);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "beb", "Chocolate Caliente", 9);
		menu.add(m);
		m = new Menu("Burger King", "Desayuno", "beb", "Te Caliente", 9);
		menu.add(m);

		/* Almuerzos */
		m = new Menu("Burger King", "Almuerzo", "ham", "WHOPPER", 20);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "WHOPPER Con Queso", 25);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "WHOPPER Doble", 25);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "WHOPPER Doble Con Queso", 27);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "WHOPPER Tejano", 27);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "WHOPPER JR", 20);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "Quesoburguesa Doble", 25);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "Big King", 25);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "BK Torito", 25);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "BK Stacker Doble", 27);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "BK Stacker Triple", 29);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "BK Stacker Cuadruple", 31);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "Hamburguesa", 20);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "ham", "Quesoburguesa", 22);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "pollo", "King de Pollo", 20);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "pollo", "King de Pollo Americano", 25);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "pollo", "King de Pollo Frances", 25);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "pollo", "King de Pollo Italiano", 25);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "pollo", "King de Jamon y Queso", 25);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "pollo", "Tender Crispy", 25);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "pollo", "TENDERGRILL", 27);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "pollo", "King Pescado", 22);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "pollo", "4 BK Nuggets", 15);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "pollo", "10 BK Nuggets", 20);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "pollo", "35 BK Nuggets", 40);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "pollo", "Derretido", 10);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "extras", "Papas Fritas", 6);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "extras", "Aros de Cebolla", 6);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "extras", "Hash Browns", 6);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "nene", "Quesoburguesa", 15);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "nene", "4 BK Nuggets", 15);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "nene", "Derretido", 10);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "nene", "Hamburguesa", 15);
		menu.add(m);

		/* Postres */
		m = new Menu("Burger King", "Almuerzo", "postre", "Tostadas Francesas", 15);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "postre", "HERSHEY'S Sundae Pie", 15);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "postre", "REESE'S Pie", 15);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "postre", "Pie Manzana", 10);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "postre", "Pie Queso", 10);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "postre", "Cinnamon Roll", 10);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "postre", "BK Cookie Chocolate Chips", 9);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "postre", "BK Cookie Macadamia", 9);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "postre", "Helado Cono", 8);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "postre", "Sundae", 9);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "postre", "Canasta Whafle", 9);
		menu.add(m);
		m = new Menu("Burger King", "Almuerzo", "postre", "Batido", 9);
		menu.add(m);

		/**
		 * DOMINOS PIZZA
		 */
		/* Pizzas */
		m = new Menu("Dominos Pizza", "Pizza", "espe", "5 Carnes", 46);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Pizza", "espe", "Hawaiana", 46);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Pizza", "espe", "Americana", 46);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Pizza", "espe", "Deluxe", 46);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Pizza", "espe", "Margarita", 46);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Pizza", "espe", "Veggy", 46);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Pizza", "premium", "Carne y Tocino", 49);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Pizza", "premium", "Extravaganza", 49);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Pizza", "premium", "Churrazco", 49);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Pizza", "uno", "Carne Molida", 42);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Pizza", "uno", "Salami", 113);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Pizza", "uno", "Pepperoni", 113);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Pizza", "uno", "Jamon", 42);
		menu.add(m);

		/* Extras */
		m = new Menu("Dominos Pizza", "Extras", "don", "Don Calzzone Pollo Chipotle", 32);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "don", "Don Calzzone Tex-Mex", 32);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "don", "Don Calzzone Deluxe", 32);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "don", "Don Calzzone Tropical", 32);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "don", "Don Calzzone BBQ", 32);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "don", "Don Calzzone Italian Chicken", 32);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "don", "Don Calzzone Di Carne", 32);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "ala", "Bucket", 125);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "ala", "Alitas", 41);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "ala", "Cheesy Bread", 26);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "otro", "Salsa Barbacoa", 5);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "otro", "Salsa Cayenne", 5);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "otro", "Dip Tropical", 3);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "otro", "Salsa Domino's", 5);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "otro", "Dulce de Leche", 3);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "otro", "Chips Lays", 0);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "bebi", "Coca Cola", 9);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "bebi", "Diet Coke", 9);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "bebi", "Sprite", 9);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "bebi", "Fanta Naranja", 9);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "bebi", "Coca Cola ZERO", 9);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "bebi", "Agua Pura", 8);
		menu.add(m);


		/* Postres */
		m = new Menu("Dominos Pizza", "Extras", "pos", "Canelitas", 15);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "pos", "Brownie", 8);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "pos", "Helado Fresa", 15);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "pos", "Helado Vanilla", 15);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "pos", "Helado Chocolate", 15);
		menu.add(m);
		m = new Menu("Dominos Pizza", "Extras", "pos", "Don Calzzone Nutella Fresas", 20);
		menu.add(m);

		// esto ba de ultimo
=======
=======
>>>>>>> master
	public ArrayList<Menu> getMenu(){
		Menu m=new Menu();
		//Estas son las dos lineas de codigo que se deben replicar
		m=new Menu("MacDonalds", "Desayuno", "Light", "Yogurt con frutas", 12);
		menu.add(m);
		
		
		
		
		
		
		
		
		//esto ba de ultimo
<<<<<<< HEAD
>>>>>>> master
=======
>>>>>>> master
		return menu;
		
	}
	
	
	
	
	
	/*
	 * Metodo para filtrar los datos por categoria
	 * @param menucito, categoria
	 */
	
	public  ArrayList<Menu> getMenuByCategory(ArrayList<Menu> menucito, String categoria){
		ArrayList<Menu> listaCategoria = new ArrayList<Menu>(); 
		for(Menu m : menu) {
			if(m.getCategoria().equals(categoria)) {
				listaCategoria.add(m);
			}
		}
		return listaCategoria;
	}
	/*
	 * Metodo para filtrar los datos por tipo de comida
	 * @param menucito, categoria
	 * @return: arraylist de objetos de tipo menu
	 */
	
	public  ArrayList<Menu> getMenuByType(ArrayList<Menu> menucito, String tipo){
		ArrayList<Menu> listaTipo = new ArrayList<Menu>(); 
		for(Menu m : menu) {
			if(m.getTipo().equals(tipo)) {
				listaTipo.add(m);
			}
		}
		return listaTipo;
	}
	/*
	 * Metodo para obtener un string de las comidas para luego setear en ellas
	 */

	public String[] getMenuByFood (ArrayList<Menu> menucito) {
		String[] tipos = new String[]{""};
		for (int i = 0; i < menucito.size(); i++) {
			Menu m = menucito.get(i);
			tipos[i] = m.getComida();
		}
		return tipos;
	}
	
	/*
	 * Metodo para obtener el precio total de la orden
	 * @param: menucito, index, cantidad
	 */
	
	
	public int PrecioTotal (ArrayList<Menu> menucito, int index, int cantidad) {
		int total= 0;
		
		total= menucito.get(index).getPrecio();
		if(cantidad!=0) {
			total=total*cantidad;
		} else {
			total=total;
		}
		return total;
		
	}
	
	
	
	

}
