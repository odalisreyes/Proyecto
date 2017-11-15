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




public class Matriz {
	/*
	 * Declaración del atributo comida (se especifica el tamaño de la matriz)
	 */
	private String[][] comida = new String [6][162];
	
	
	/*
	 * Es para obtener un objeto dentro de la matriz
	 */
	public String getObj(int i, int j) {
		return comida[i][j];
	}
	
	
	
	/*
	 * CONSTRUCTOR
	 * Se colocan los nombres para cada fila y columna de la matriz
	 */
	public Matriz () {
		this.comida [0][0] = "McDonald's";
		
		
		/*
		 * DESAYUNOS
		 */
		this.comida [0][1] = "Yogurt con frutas";
		this.comida [0][2] = "Avena Frutas y Maple";
		this.comida [0][3] = "Egg McMuffin";
		this.comida [0][4] = "McMuffin de Huevo y Salchicha";
		this.comida [0][5] = "McMuffin Chapin";
		this.comida [0][6] = "McMuffin de Tocino y Huevo";
		this.comida [0][7] = "McMuffin de Salchica";
		this.comida [0][8] = "Burritos de Desayuno";
		this.comida [0][9] = "Hot Cakes";
		this.comida [0][10] = "Desayuno Completo";
		this.comida [0][11] = "Desayuno Tradicional";
		this.comida [0][12] = "Desayuno Delux";
		this.comida [0][13] = "McWrap Ranchero";
		this.comida [0][14] = "McGriddle de Salchicha y Huevo";
		this.comida [0][15] = "McGriddle de Tocin y Huevo";
		this.comida [0][16] = "McGriddle de Salchicha";
		this.comida [0][17] = "Hash Brown";
			
		/*
		 * ALMUERZO Y CENA
		 */
		this.comida [0][18] = "Derretido con Jamón";
		this.comida [0][19] = "Derretido Clásico";
		this.comida [0][20] = "Derretido con Tocino";
		this.comida [0][21] = "Derretido con Tomate";
		this.comida [0][22] = "Big Mac";
		this.comida [0][23] = "Quesoburguesa Doble";
		this.comida [0][24] = "Quesoburguesa";
		this.comida [0][25] = "Hamburguesa";
		this.comida [0][26] = "Sandwich McPollo";
		this.comida [0][27] = "McNifica";
		this.comida [0][28] = "Pollo Frito McCrispy 2 Piezas";
		this.comida [0][29] = "Pollo Frito McCrispy 3 Piezas";
		this.comida [0][30] = "McNuggets";
		this.comida [0][31] = "Angus Premium Deluxe";
		this.comida [0][32] = "Angus Premium Tocino y Queso";
		this.comida [0][33] = "Big Tasty";
		this.comida [0][34] = "Big Tasty Bacon";
		this.comida [0][35] = "Big Tasty Grill";
		this.comida [0][36] = "Big Tasty Pollo Crispy";
		this.comida [0][37] = "POLLO SUPREME TOCINO";
		this.comida [0][38] = "POLLO SUPREME DELUXE";
		this.comida [0][39] = "POLLO SUPREME GUACAMOL";
		this.comida [0][40] = "McFiesta";
		this.comida [0][41] = "McWrap Clasico";
		this.comida [0][42] = "McWrap Tocino";
		this.comida [0][43] = "McWrap Guacamol";
		this.comida [0][44] = "Ensalada de Repollo";
		this.comida [0][45] = "Papas";
		this.comida [0][46] = "McPatatas";
			
		/*
		 * CAJITA FELIZ
		 */
		this.comida [0][47] = "Cajita Feliz Derretido";
		this.comida [0][48] = "Cajita Feliz Hot Cakes";
		this.comida [0][49] = "Cajita Feliz Muffin de Salchica";
		this.comida [0][50] = "Cajita Feliz Quesobuguesa";
		this.comida [0][51] = "Cajita Feliz Hamburguesa";
		this.comida [0][52] = "Cajita Feliz McNuggets";
		this.comida [0][53] = "Cajita Feliz Pollo Frito McCrispy";
				
		/*
		 * POSTRES
		 */
		this.comida [0][53] = "Pastel de Manzana";
		this.comida [0][54] = "Pastel de Piña";
		this.comida [0][55] = "Pastel de Queso";
		this.comida [0][56] = "McFlury de Oreo";
		this.comida [0][57] = "McFlury de M&M's";
		this.comida [0][58] = "Sundae de Fresa";
		this.comida [0][59] = "Sundae de Caramelo";
		this.comida [0][60] = "Sundae de Chocolate";
		this.comida [0][61] = "McCono de Vainilla";
		this.comida [0][62] = "McCono de Chocolate";
		this.comida [0][63] = "McCono Mixto";
			
		/*
		 * ENSALADAS
		 */
		this.comida [0][64] = "Ensalada de Atún";
		this.comida [0][65] = "Ensalada de Pollo Grill";
		this.comida [0][66] = "Ensalada de Pollo Crispy";
		this.comida [0][67] = "Side Salad";
				
		/*
		 * BEBIDAS
		 */
		this.comida [0][68] = "Té Lipton Limón";
		this.comida [0][69] = "Café";
		this.comida [0][70] = "Chocolate";
		this.comida [0][71] = "Jugo de Naranja";
		this.comida [0][72] = "Soda Coca-Cola";
		this.comida [0][73] = "Soda Coca-Cola Zero";
		this.comida [0][74] = "Soda Fanta";
		this.comida [0][75] = "Soda Sprite";
		this.comida [0][76] = "Nectar Fresa";
		this.comida [0][77] = "Nectar Mora";
		this.comida [0][78] = "Rosa de Jamaica";
		this.comida [0][79] = "Té Frío";
		this.comida [0][80] = "Agua Pura";
		
		this.comida [1][0] = "McDonald's Precios";
				
		/*
		 * PRECIO DE LOS DESAYUNOS
		 */
		this.comida [1][1] = "15";
		this.comida [1][2] = "18";
		this.comida [1][3] = "25";
		this.comida [1][4] = "30";
		this.comida [1][5] = "20";
		this.comida [1][6] = "25";
		this.comida [1][7] = "25";
		this.comida [1][8] = "25";
		this.comida [1][9] = "25";
		this.comida [1][10] = "30";
		this.comida [1][11] = "30";
		this.comida [1][12] = "35";
		this.comida [1][13] = "25";
		this.comida [1][14] = "25";
		this.comida [1][15] = "25";
		this.comida [1][16] = "25";
		this.comida [1][17] = "5";
			
		/*
		 * PRECIO DE ALMUERZO Y CENA
		 */
		this.comida [1][18] = "10";
		this.comida [1][19] = "10";
		this.comida [1][20] = "12";
		this.comida [1][21] = "12";
		this.comida [1][22] = "25";
		this.comida [1][23] = "25";
		this.comida [1][24] = "20";
		this.comida [1][25] = "20";
		this.comida [1][26] = "20";
		this.comida [1][27] = "20";
		this.comida [1][28] = "20";
		this.comida [1][29] = "25";
		this.comida [1][30] = "25";
		this.comida [1][31] = "25";
		this.comida [1][32] = "40";
		this.comida [1][33] = "25";
		this.comida [1][34] = "30";
		this.comida [1][35] = "30";
		this.comida [1][36] = "30";
		this.comida [1][37] = "30";
		this.comida [1][38] = "35";
		this.comida [1][39] = "35";
		this.comida [1][40] = "25";
		this.comida [1][41] = "25";
		this.comida [1][42] = "25";
		this.comida [1][43] = "25";
		this.comida [1][44] = "25";
		this.comida [1][45] = "5";
		this.comida [1][46] = "10";
		
		/*
		 * PRECIO CAJITA FELIZ
		 */
		this.comida [1][47] = "25";
		this.comida [1][48] = "25";
		this.comida [1][49] = "25";
		this.comida [1][50] = "25";
		this.comida [1][51] = "25";
		this.comida [1][52] = "25";
		this.comida [1][53] = "25";
		
		/*
		 * PRECIO DE LOS POSTRES
		 */
		this.comida [1][53] = "12";
		this.comida [1][54] = "12";
		this.comida [1][55] = "12";
		this.comida [1][56] = "15";
		this.comida [1][57] = "15";
		this.comida [1][58] = "10";
		this.comida [1][59] = "10";
		this.comida [1][60] = "10";
		this.comida [1][61] = "8";
		this.comida [1][62] = "8";
		this.comida [1][63] = "8";
		
		/*
		 * PRECIO ENSALADA
		 */
		this.comida [1][64] = "20";
		this.comida [1][65] = "25l";
		this.comida [1][66] = "25";
		this.comida [1][67] = "15";
		
		/*
		 * PRECIO BEBIDAS
		 */
		this.comida [1][68] = "9";
		this.comida [1][69] = "9";
		this.comida [1][70] = "9";
		this.comida [1][71] = "9";
		this.comida [1][72] = "9";
		this.comida [1][73] = "9";
		this.comida [1][74] = "9";
		this.comida [1][75] = "9";
		this.comida [1][76] = "9";
		this.comida [1][77] = "9";
		this.comida [1][78] = "9";
		this.comida [1][79] = "9";
		this.comida [1][80] = "8";
		
		
		
		
		/*
		 * BURGER KING
		 */
		this.comida [2][0] = "Burger King";
		
		/*
		 * CARNE
		 */
		this.comida [2][1] = "WHOPPER®";
		this.comida [2][2] = "WHOPPER® Con Queso";
		this.comida [2][2] = "WHOPPER® Doble";
		this.comida [2][3] = "WHOPPER® Doble Con Queso";
		this.comida [2][4] = "WHOPPER® Tejano";
		this.comida [2][5] = "WHOPPER® JR";
		this.comida [2][6] = "Quesoburguesa Doble";
		this.comida [2][7] = "Big King";
		this.comida [2][8] = "BK® Torito";
		this.comida [2][9] = "BK® Stacker Doble";
		this.comida [2][10] = "BK® Stacker Triple";
		this.comida [2][11] = "BK® Stacker Cuadruple";
		this.comida [2][12] = "Hamburguesa";
		this.comida [2][13] = "Quesoburguesa";
		
		/*
		 * POLLO Y OTROS
		 */
		this.comida [2][14] = "King de Pollo";
		this.comida [2][15] = "King de Pollo Americano";
		this.comida [2][16] = "King de Pollo Frances";
		this.comida [2][17] = "King de Pollo Italiano";
		this.comida [2][18] = "King de Jamon y Queso";
		this.comida [2][19] = "Tender Crispy";
		this.comida [2][20] = "TENDERGRILL®";
		this.comida [2][21] = "King Pescado";
		this.comida [2][22] = "4 BK® Nuggets";
		this.comida [2][23] = "10 BK® Nuggets";
		this.comida [2][24] = "35 BK® Nuggets";
		this.comida [2][25] = "Derretido";
		
		/*
		 * ENSALADAS
		 */
		this.comida [2][26] = "Shaker de Jamon";
		this.comida [2][27] = "Shaker de Pollo";
		this.comida [2][28] = "Ensalada Pollo";
		this.comida [2][29] = "Ensalada Jardinera";
		
		/*
		 * DESAYUNOS
		 */
		this.comida [2][30] = "Croissan Huevo Queso Jamon";
		this.comida [2][31] = "BK® Chapin con Salchicha";
		this.comida [2][32] = "Panqueques Jamon y Huevo";
		this.comida [2][33] = "BK® Muffin Huevo Queso Tocino";
		this.comida [2][34] = "Panqueques Plain";
		this.comida [2][35] = "Tostadas Francesas";
		
		/*
		 * SODAS
		 */
		this.comida [2][36] = "Soda Pepsi®";
		this.comida [2][37] = "Soda Pepsi®Dieta";
		this.comida [2][38] = "Soda 7-UP®";
		this.comida [2][39] = "Soda Mirinda®";
		this.comida [2][40] = "Soda Grapette®";
		this.comida [2][41] = "Agua Pura";
		this.comida [2][42] = "Café";
		this.comida [2][43] = "Chocolate Caliente";
		this.comida [2][44] = "Te Caliente";
		
		/*
		 * EXTRAS
		 */
		this.comida [2][45] = "Papas Fritas";
		this.comida [2][46] = "Aros de Cebolla";
		this.comida [2][47] = "Hash Browns";
		
		/*
		 * POSTRES
		 */
		this.comida [2][48] = "Tostadas Francesas";
		this.comida [2][49] = "HERSHEY'S® Sundae Pie";
		this.comida [2][50] = "REESE'S® Pie";
		this.comida [2][51] = "Pie Manzana";
		this.comida [2][52] = "Pie Queso";
		this.comida [2][53] = "Cinnamon Roll";
		this.comida [2][54] = "BK® Cookie Chocolate Chips";
		this.comida [2][55] = "BK® Cookie Macadamia";
		this.comida [2][56] = "Helado Cono";
		this.comida [2][57] = "Sundae";
		this.comida [2][58] = "Canasta Whafle";
		this.comida [2][59] = "Batido";
		
		/*
		 * KING JR
		 */
		this.comida [2][60] = "Quesoburguesa";
		this.comida [2][61] = "4 BK® Nuggets";
		this.comida [2][62] = "Derretido";
		this.comida [2][63] = "HAMBURGEUSA";
		
		this.comida [3][0] = "Burger King Precios";
		
		/*
		 * PRECIOS CARNE
		 */
		this.comida [3][1] = "20";
		this.comida [3][2] = "25";
		this.comida [3][2] = "25";
		this.comida [3][3] = "27";
		this.comida [3][4] = "27";
		this.comida [3][5] = "20";
		this.comida [3][6] = "25";
		this.comida [3][7] = "25";
		this.comida [3][8] = "25";
		this.comida [3][9] = "27";
		this.comida [3][10] = "29";
		this.comida [3][11] = "31";
		this.comida [3][12] = "20";
		this.comida [3][13] = "22";
		
		/*
		 * PRECIO POLLO Y OTROS
		 */
		this.comida [3][14] = "20";
		this.comida [3][15] = "25";
		this.comida [3][16] = "25";
		this.comida [3][17] = "25";
		this.comida [3][18] = "25";
		this.comida [3][19] = "25";
		this.comida [3][20] = "27";
		this.comida [3][21] = "22";
		this.comida [3][22] = "15";
		this.comida [3][23] = "20";
		this.comida [3][24] = "40";
		this.comida [3][25] = "10";
		
		/*
		 * PRECIO ENSALADA
		 */
		this.comida [3][26] = "20";
		this.comida [3][27] = "20";
		this.comida [3][28] = "20";
		this.comida [3][29] = "20";
		
		/*
		 * PRECIO DESAYUNOS
		 */
		this.comida [3][30] = "20";
		this.comida [3][31] = "20";
		this.comida [3][32] = "20";
		this.comida [3][33] = "20";
		this.comida [3][34] = "20";
		this.comida [3][35] = "15";
		this.comida [3][36] = "9";
		this.comida [3][37] = "9";
		this.comida [3][38] = "9";
		this.comida [3][39] = "9";
		this.comida [3][40] = "9";
		this.comida [3][41] = "8";
		this.comida [3][42] = "9";
		this.comida [3][43] = "9";
		this.comida [3][44] = "9";
		
		/*
		 * PRECIO EXTRAS
		 */
		this.comida [3][45] = "6";
		this.comida [3][46] = "6";
		this.comida [3][47] = "6";
		
		/*
		 * PRECIO POSTRES
		 */
		this.comida [3][48] = "15";
		this.comida [3][49] = "15";
		this.comida [3][50] = "15";
		this.comida [3][51] = "10";
		this.comida [3][52] = "10";
		this.comida [3][53] = "10";
		this.comida [3][54] = "9";
		this.comida [3][55] = "9";
		this.comida [3][56] = "8";
		this.comida [3][57] = "9";
		this.comida [3][58] = "9";
		this.comida [3][59] = "9";
		
		/*
		 * PRECIO KING JR
		 */
		this.comida [3][60] = "15";
		this.comida [3][61] = "15";
		this.comida [3][62] = "10";
		this.comida [3][63] = "15";
		
		
		
		
		/*
		 * DOMINOS PIZZA
		 */
		this.comida [4][0] = "Domino's Pizza";
		
		/*
		 * ESPECIALIDADES
		 */
		this.comida [4][1] = "5 Carnes";
		this.comida [4][2] = "Hawaiana";
		this.comida [4][3] = "Americana";
		this.comida [4][4] = "Deluxe";
		this.comida [4][5] = "Margarita";
		this.comida [4][6] = "Veggy";
		
		/*
		 * PREMIUM
		 */
		this.comida [4][7] = "Carne y Tocino";
		this.comida [4][8] = "Extravaganza";
		this.comida [4][9] = "Churrazco";
		
		/*
		 * FAVORITA (PIZZA DE 1 INGREDIENTE)
		 */
		this.comida [4][10] = "Carne Molida";
		this.comida [4][11] = "Salami";
		this.comida [4][12] = "Pepperoni";
		this.comida [4][13] = "Jamón";
		
		/*
		 * CALZZONE
		 */
		this.comida [4][14] = "Don Calzzone Pollo Chipotle";
		this.comida [4][15] = "Don Calzzone Tex-Mex";
		this.comida [4][16] = "Don Calzzone Deluxe";
		this.comida [4][17] = "Don Calzzone Tropical";
		this.comida [4][18] = "Don Calzzone BBQ";
		this.comida [4][19] = "Don Calzzone Italian Chicken";
		this.comida [4][20] = "Don Calzzone Di Carne";
		
		/*
		 * ALITAS Y COSTILLAS
		 */
		this.comida [4][21] = "Bucket";
		this.comida [4][22] = "Alitas";
		this.comida [4][23] = "Costillas";
		
		/*
		 * ADICIONAL
		 */
		this.comida [4][24] = "Cheesy Bread";
		
		/*
		 * BEBIDAS
		 */
		this.comida [4][25] = "Coca Cola®";
		this.comida [4][26] = "Diet Coke®";
		this.comida [4][27] = "Sprite®";
		this.comida [4][28] = "Fanta Naranja®";
		this.comida [4][29] = "Coca Cola® ZERO";
		this.comida [4][30] = "Agua Pura";
		
		/*
		 * POSTRES
		 */
		this.comida [4][31] = "Canelitas";
		this.comida [4][32] = "Brownie";
		this.comida [4][33] = "Helado Fresa";
		this.comida [4][34] = "Helado Vanilla";
		this.comida [4][35] = "Helado Chocolate";
		this.comida [4][36] = "Don Calzzone Nutella Fresas";
		
		/*
		 * EXTRAS
		 */
		this.comida [4][37] = "Salsa Barbacoa";
		this.comida [4][38] = "Salsa Cayenne";
		this.comida [4][39] = "Dip Tropical";
		this.comida [4][40] = "Salsa Domino's";
		this.comida [4][41] = "Dulce de Leche";
		this.comida [4][42] = "Chips Lays";
		
		this.comida [5][0] = "Precios Domino's Pizza";
		
		/*
		 * PRECIO ESPECIALIDADES
		 */
		this.comida [5][1] = "46";
		this.comida [5][2] = "46";
		this.comida [5][3] = "46";
		this.comida [5][4] = "46";
		this.comida [5][5] = "46";
		this.comida [5][6] = "46";
		
		/*
		 * PRECIOS PREMIUM
		 */
		this.comida [5][7] = "49";
		this.comida [5][8] = "49";
		this.comida [5][9] = "49";
		
		/*
		 * PRECIO FAVORITA (PIZZA DE 1 INGREDIENTE)
		 */
		this.comida [5][10] = "42";
		this.comida [5][11] = "113";
		this.comida [5][12] = "113";
		this.comida [5][13] = "42";
		
		/*
		 * PRECIO CALZZONE
		 */
		this.comida [5][14] = "32";
		this.comida [5][15] = "32";
		this.comida [5][16] = "32";
		this.comida [5][17] = "32";
		this.comida [5][18] = "32";
		this.comida [5][19] = "32";
		this.comida [5][20] = "32";
		
		/*
		 * PRECIOS ALITAS Y COSTILLAS
		 */
		this.comida [5][21] = "125";
		this.comida [5][22] = "41";
		this.comida [5][23] = "41";
		
		/*
		 * PRECIOS ADICIONAL
		 */
		this.comida [5][24] = "26";
		
		/*
		 * PRECIOS BEBIDAS
		 */
		this.comida [5][25] = "9";
		this.comida [5][26] = "9";
		this.comida [5][27] = "9";
		this.comida [5][28] = "9";
		this.comida [5][29] = "9";
		this.comida [5][30] = "8";
		
		/*
		 * PRECIOS POSTRES
		 */
		this.comida [5][31] = "15";
		this.comida [5][32] = "8";
		this.comida [5][33] = "15";
		this.comida [5][34] = "15";
		this.comida [5][35] = "15";
		this.comida [5][36] = "20";
		
		/*
		 * PRECIOS EXTRA
		 */
		this.comida [5][37] = "5";
		this.comida [5][38] = "5";
		this.comida [5][39] = "3";
		this.comida [5][40] = "5";
		this.comida [5][41] = "3";
		this.comida [5][42] = "0";
	}

}
