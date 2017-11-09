
public class Matriz2 {
	/*
	 * Declaración del atributo comida (se especifica el tamaño de la matriz)
	 */
	private String[][] localidad = new String [3][5];
	
	/*
	 * Es para obtener un objeto dentro de la matriz
	 */
	public String getObj(int i, int j) {
		return localidad[i][j];
	}
		
		/*
		 * CONSTRUCTOR
		 * Se colocan los nombres para cada fila y columna de la matriz
		 */
		public Matriz2 () {
			//Localidades de McDonald's
			this.localidad [0][0] = "McDonald's";
			this.localidad [0][1] = " McDonald's Mix 5ta Avenida 3-05 Sector A-3 San Cristobal zona 8 de Mixco Centro Comercial Mix Local 27";
			this.localidad [0][2] = "McDonald's Eskala Km 13.8 Calzada Roosevelt zona 3 de Mixco Centro Comercial Eskala Local Isla 2";
			this.localidad [0][3] = "McDonald's Florida Calzada San Juan 1-83 zona 19 Centro Comercial Plaza Florida.";
			this.localidad [0][4] = "McDonald's Multimart 5ta. Ave. 1-04 Nueva Montserrat";
			this.localidad [0][5] = "McDonald's Bosques 41 Ave. 4-98 zona 4 de Mixco Plaza San Nicolás";
			this.localidad [0][6] = "McDonald's Montserrat Calzada San Juan 16-91 zona 4 de Mixco";
			this.localidad [0][7] = "McDonald's Hiper Roosevelt Calzada Roosevelt 26-95 zona 11 Hiper Paiz Roosevelt";
			this.localidad [0][8] = "McDonald's Tikalito Calzada Roosevelt 22-43. zona 11. Centro Comercial Tikal Futura. 1er. Nivel.";
			this.localidad [0][9] = "McDonald's Miraflores 21 av. 4-32 zona 11 Centro Comercial Galerias Miraflores Nivel 3 Local FC311";
			this.localidad [0][10] = "McDonald's Roosevelt-Sn Juan Calzada San Juan 8-89 zona 7";
			this.localidad [0][11] = "McDonald's Roosevelt-Sn Juan Calzada San Juan 8-89 zona 7";
			this.localidad [0][12] = "McDonald's Naranjo 10a. Ave. y 17 calle Alameda Norte Condado el Naranjo zona 4 de Mixco";
			this.localidad [0][13] = "McDonald's Bolívar 32-62 Avenida Bolivar";
			this.localidad [0][14] = "McDonald's Ciudad Real 51 calle y Avenida Petapa 20-11 zona 12 a la par del Centro Comercial Atanazio Tzul";
			this.localidad [0][15] = "McDonald's Metrosur Calzada Aguilar Batres 44-22 zona 11";
			this.localidad [0][16] = "McDonald's Petapa Ave. Petapa 31-89 zona 12 Petapa";
			this.localidad [0][17] = "McDonald's Utatlán Calzada Roosevelt Diagonal 12 31-55 zona 11 Colonia Utatlán";
			this.localidad [0][18] = "McDonald's El Zapote Anillo Periférico y 3a. Ave. 3-57 zona 2";
			this.localidad [0][19] = "McDonald's Calle Martí Calle Martí 14-23 zona 6";
			this.localidad [0][20] = "McDonald's Portales Km. 4.5 Carretera al Atlántico 3-20 zona 17 Centro Comercial Portales Nivel 3 Local FC-11 y N3-1";
			this.localidad [0][21] = "McDonald's Los Alamos Km 4.5 Carrt. Al Atlántico Centro Comercial Los Alamos zona 18";
			this.localidad [0][22] = "McDonald's Atlántico Km.7 Carretera al Atlántico zona17 (antes de entrar a Colonia San Rafael)";
			this.localidad [0][23] = "McDonald's Metronorte Km.5 Carretera al Atlántico zona17 Centro Comercial Metro Norte Local 2";
			this.localidad [0][24] = "McDonald's Catedral 9 Ave. 7-81 zona 1 Catedral";
			this.localidad [0][25] = "McDonald's Zona 1 6a. Ave. 10-46 zona 1";
			this.localidad [0][26] = "McDonald's Concordia/Gomez Carrillo 6a. Ave. 14-43 zona 1 Concordia";
			this.localidad [0][27] = "McDonald's 18 Calle 18 calle 7-60 zona 1";
			this.localidad [0][28] = "McDonald's Zona 4 7a. Ave. 1-34 zona 4";
			this.localidad [0][29] = "McDonald's Zona 5 Diagonal 14 22-27 zona 5";
			this.localidad [0][30] = "McDonald's Tívoli 6a. Ave. 5-06 zona 9 Tívoli";
			this.localidad [0][31] = "McDonald's Bancos 7a. Ave. 8-02 zona 9";
			this.localidad [0][32] = "McDonald's Zona 10 6 Ave. 8-34 zona 10 Frente Hospitales";
			this.localidad [0][33] = "McDonald's Cayala Diagonal 35 y Boulevard Austriaco 16-25";
			this.localidad [0][34] = "McDonald's Zona 10 6 Ave. 8-34 zona 10 Frente Hospitales";
			this.localidad [0][35] = "McDonald's Zona Viva 2a Ave. 12-74 zona 10";
			this.localidad [0][36] = "McDonald's Oakland Mall Diagonal 6 13-01 zona 10 Centro Comercial Oakland Mall";
			this.localidad [0][37] = "McDonald's Próceres 16 calle 2-00 zona 10 Centro Comercial Los Próceres 4to Nive";
			this.localidad [0][38] = "McDonald's Américas 10a. calle 00-25 zona 14 Ave. Las Américas";
			this.localidad [0][39] = "McDonald's Pradera 18 calle 25-42 zona 10 Pradera";
			this.localidad [0][40] = "McDonald's Arkadia 18 calle Boulevard Los Proceres 26-21 zona 10 CC Arkadia Shopping Local 304";
			this.localidad [0][41] = "McDonald's Vista Hermosa Boulevard Vista Hermosa 20-88 zona 15";
			this.localidad [0][42] = "McDonald's Cayala Diagonal 35 y Boulevard Austriaco 16-25";
			//Localidades de Burger King
			this.localidad [1][0] = "Burger King";
			this.localidad [1][1] = "6A. AVE 14-84, ZONA 9";
			this.localidad [1][2] = "10 CALLE 6-11, ZONA 1";
			this.localidad [1][3] = "18 CALLE 5-58, ZONA 1.";
			this.localidad [1][4] = "7A. AVE. 20-76, ZONA 1.";
			this.localidad [1][5] = "6A. AVE. 0-60, ZONA 4. C.C. ZONA 4. LOCALES 100-101.";
			this.localidad [1][6] = "27 CALLE 30-07, ZONA 5";
			this.localidad [1][7] = "CALLE MART� 13-03, ZONA 6";
			this.localidad [1][8] = "2 CALLE 7-25, ZONA 9";
			this.localidad [1][9] = "C.C. PORTALES RUTA AL ATLANTICO ZONA 17";
			this.localidad [1][10] = "15 AVE 16-11, ZONA 6. C.C. MEGAS�IS";
			this.localidad [1][11] = "12 CALLE 1-25, ZONA 10. LOCALES 115-116";
			this.localidad [1][12] = "BOULEVAR SUR 10-25, ZONA 4 DE MIXCO, EL NARANJO";
			this.localidad [1][13] = "2 CALLE 17-88, ZONA 15. VISTA HERMOSA 2";
			this.localidad [1][14] = "BULEVAR LOS PR�CERES";
			this.localidad [1][15] = "PLAZA TECHADA L-2 C.C. URL. VH 3, ZONA 16";
			this.localidad [1][16] = "DIAGONAL 12, 21-20, ZONA 7. C.C. GRAN V�A ROOSEVELT";
			this.localidad [1][17] = "CALZADA ROOSEVETH 15-15";
			this.localidad [1][18] = "AVENIDA LAS AM�RICAS 9-38, ZONA 1";
			this.localidad [1][19] = "CALZADA SAN JUAN 37-10, ZONA 7";
			this.localidad [1][20] = "C.C.CENTRAL NORTE";
			this.localidad [1][21] = "20 CALLE 25-65, ZONA 10. C.C. PRADERA L. 305";
			this.localidad [1][22] = "AVENIDA PETAPA 31-56, ZONA 12";
			this.localidad [1][23] = "CALZADA SAN JUAN 14-06";
			this.localidad [1][24] = "CALZADA AGUILAR BATRES 32-10, ZONA 11";
			this.localidad [1][25] = "CALZADA AGUILAR BATRES 32-10";
			this.localidad [1][26] = "KM. 12.7 CARRETERA A EL SALVADOR C.C. METROPLAZA";
			this.localidad [1][27] = "BLVD. PRINCIPAL 18-95, ZONA 8 DE MIXCO SAN CRIST�BAL";
			this.localidad [1][28] = "FINAL CALZ. ATANASIO TZUL, DIAGONAL # 9";
			this.localidad [1][29] = "KM. 15.5 CARRETERA A EL SALVADOR LOCAL 340";
			this.localidad [1][30] = "KM. 17.9 CENTRO COMERCIAL EL FARO SAN JOS� PINULA";
			this.localidad [1][31] = "23 CALLE 20-64, ZONA 7. VILLA HERMOSA I";
			this.localidad [1][32] = "23 CALLE 20-00, ZONA 7. VILLA HERMOSA, 2DO. NIVEL LOCAL 201";
			this.localidad [1][33] = "KM. 17, CARRETERA AL PAC�FICO EXTERIOR HIPER PAIZ";
			this.localidad [1][34] = "KM. 17, CARRETERA AL PAC�FICO INTERIOR HIPER PAIZ";
			//Domino's
			this.localidad [2][0] = "Domino's";
			this.localidad [2][1] = "BOCA DEL MONTE (#14015) ";
			this.localidad [2][2] = "Avenida petapa";
			this.localidad [2][3] = "Colonia El Carmen Z.12";
			this.localidad [2][4] = "Plaza Asadis";
			this.localidad [2][5] = "nterior Parque Zoológico";
			this.localidad [2][6] = "Centro Comercial Parque Las Américas";
			this.localidad [2][7] = "20 calle Z.10";
			this.localidad [2][8] = "Centro Comercial La Pradera Z.10";
			this.localidad [2][9] = "Vista Hermosa";
			this.localidad [2][10] = "Dinamia Cayalá";
			this.localidad [2][11] = "Santa Amelia";
			this.localidad [2][12] = "Costado Canella";
			this.localidad [2][13] = "Frente Estación Bolivar Transmetro";
			this.localidad [2][14] = "Calzada San Juan";
			this.localidad [2][15] = "CENTRO COMERCIAL LA QUINTA Calzada San Juan";
			this.localidad [2][16] = "Centro Comercial Tikal Futura";
			this.localidad [2][17] = "Centro Comercial Miraflores";
			this.localidad [2][18] = "Edificio Distrito Miraflores";
			this.localidad [2][19] = "TORRE REFORMADOR Costado Canella";
			this.localidad [2][20] = "Frente Estación Bolivar Transmetro";
			this.localidad [2][21] = "Centro Comercial Plaza Zona 4";
			this.localidad [2][22] = "ZONA 1 Costado del Palacio Nacional";
			this.localidad [2][23] = "Zona 6";
			this.localidad [2][24] = "Centro Comercial Portales";
			this.localidad [2][25] = "CC. Metronorte (costado Cines)";
	}
}
