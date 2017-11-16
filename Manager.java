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
	ArrayList<Menu> menu= new ArrayList<Menu>();
	

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
	public ArrayList<Menu> getMenu(){
		Menu m=new Menu();
		//Estas son las dos lineas de codigo que se deben replicar
		m= new Menu("MacDonalds", "Desayuno", "Light", "Yogurt con frutas", 15);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "Light", "Avena Frutas y Maple", 18);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "mid", "Egg McMuffin", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "mid", "McMuffin de Huevo y Salchicha", 30);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "mid", "McMuffin Chapin", 20);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "mid", "McMuffin de Tocino y Huevo", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "mid", "McMuffin de Salchica", 25);
		menu.add(m);
		m= new Menu ("MacDonalds", "Desayuno", "mid", "Burritos de Desayuno", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "mid", "Hot Cakes", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "completo", "Desayuno Completo", 30);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "completo", "Desayuno Tradicional", 30);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "completo", "Desayuno Delux", 35);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "mid", "McWrap Ranchero", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "mid", "McGriddle de Salchicha y Huevo", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "mid", "McGriddle de Tocin y Huevo", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "mid", "McGriddle de Salchicha", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Desayuno", "Light", "Hash Brown", 5);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "Refa", "Derretido con Jamón", 10);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "Refa", "Derretido Clásico",10);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "Refa", "Derretido con Tocino", 12);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "Refa", "Derretido con Tomate", 12);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Big Mac", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Quesoburguesa Doble", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Quesoburguesa", 20);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Hamburguesa", 20);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Sandwich McPollo", 20);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "McNifica", 20);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Pollo Frito McCrispy 2 Piezas", 20);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Pollo Frito McCrispy 3 Piezas", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid","McNuggets", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Angus Premium Deluxe", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Angus Premium Tocino y Queso", 40);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Big Tasty", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Big Tasty Bacon", 30);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Big Tasty Grill", 30);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Big Tasty Pollo Crispy", 30);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "POLLO SUPREME TOCINO", 30);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "POLLO SUPREME DELUXE", 35);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "McFiesta", 35);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "McWrap Clasico", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "McWrap Tocino", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "McWrap Guacamol", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "mid", "Ensalada de Repollo", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "Light", "Papas", 5);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "Light", "McPatatas", 10);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz Derretido", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz Hot Cakes", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz Muffin de Salchica", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz Quesobuguesa", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz Hamburguesa", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz McNuggets", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "kid", "Cajita Feliz Pollo Frito McCrispy", 25);
		menu.add(m);
		m = new Menu("MacDonalds", "Almuerzo", "postre", "Pastel de Manzana", 12);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "postre", "Pastel de Piña", 12);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "postre", "Pastel de Queso", 12);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "postre", "McFlury de Oreo",15);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "postre", "McFlury de M&M's", 15);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "postre", "Sundae de Fresa", 10);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "postre", "Sundae de Caramelo", 10);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "postre", "Sundae de Chocolate", 10);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "postre", "McCono de Vainilla", 8);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "postre", "McCono de Chocolate", 8);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "postre","McCono Mixto", 8);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "Ensalada", "Ensalada de Atún", 20);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "Ensalada", "Ensalada de Pollo Grill", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "Ensalada", "Ensalada de Pollo Crispy", 25);
		menu.add(m);
		m= new Menu("MacDonalds", "Almuerzo", "Ensalada", "Side Salad",15);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas", "fria", "Té Lipton Limón", 9);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas", "caliente", "Caf\u00e9", 9);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas", "caliente", "Chocolate", 9);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas", "fria", "Jugo de Naranja", 9);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas","fria", "Soda Coca-Cola", 9);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas","fria", "Soda Coca-Cola Zero", 9);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas","fria", "Soda Fanta", 9);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas","fria", "Soda Sprite", 9);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas","fria", "Nectar Fresa", 9);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas","fria", "Nectar Mora", 9);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas","fria", "Rosa de Jamaica", 9);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas","fria", "Te Frio", 9);
		menu.add(m);
		m= new Menu("MacDonalds", "Bebidas","fria", "Agua Pura", 8);
		menu.add(m);
		//esto ba de ultimo
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
