

/**
 * 
 * @author Mayra Silva    17276
 * @author Odalis Reyes   17032
 * @author Ivan Maldonado 17211
 * 
 * @file Localidades.java
 * @since 12/11/17
 */
public class Localidades {
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
    public Localidades() {
        //Localidades de McDonald's
        this.localidad [0][0] = "McDonald's";
        //Zona 1
        this.localidad [0][1] = "McDonald's Catedral 9 Ave. 7-81 zona 1 Catedral";
        //Zona 2
        this.localidad [0][2] = "McDonald's El Zapote Anillo Perif\u00e9rico y 3a. Ave. 3-57 zona 2";
        //Zona 3
        this.localidad [0][3] = "McDonald's Eskala Km 13.8 Calzada Roosevelt zona 3 de Mixco Centro Comercial Eskala Local Isla 2";
        //Zona 4
        this.localidad [0][4] = "McDonald's Naranjo 10a. Ave. y 17 calle Alameda Norte Condado el Naranjo zona 4 de Mixco";
        //Zona 5
        this.localidad [0][5] = "McDonald's Zona 5 Diagonal 14 22-27 zona 5";
        //Zona 6
        this.localidad [0][6] = "McDonald's Calle Martí Calle Marti� 14-23 zona 6";
        //Zona 7
        this.localidad [0][7] = "McDonald's Roosevelt-Sn Juan Calzada San Juan 8-89 zona 7";
        //Zona 9
        this.localidad [0][9] = "McDonald's Tivoli 6a. Ave. 5-06 zona 9 Tivoli";
        //Zona 10
        this.localidad [0][10] = "McDonald's Zona 10 6 Ave. 8-34 zona 10 Frente Hospitales";
        //Zona 11
        this.localidad [0][11] = "McDonald's Utatl\\u00e1n Calzada Roosevelt Diagonal 12 31-55 zona 11 Colonia Utatlán.";
        //Zona 12
        this.localidad [0][12] = "McDonald's Petapa Ave. Petapa 31-89 zona 12 Petapa";
        //Zona 13
        this.localidad [0][13] = "La Aurora Airport 9 Av 14-75, Zona 13";
        //Zona 14
        this.localidad [0][14] = "McDonald's Am\u00e9ricas 10a. calle 00-25 zona 14 Ave. Las Américas";
        //Zona 15
        this.localidad [0][15] = "McDonald's Vista Hermosa Boulevard Vista Hermosa 20-88 zona 15";
        //Zona 16
        this.localidad [0][16] = "McDonald's Cayala Diagonal 35 y Boulevard Austriaco 16-25";
        //Zona 17
        this.localidad [0][17] = "McDonald's Portales Km. 4.5 Carretera al Atl\u00e1ntico 3-20 zona 17 Centro Comercial Portales Nivel 3 Local FC-11 y N3-1";
        //Zona 18
        this.localidad [0][18] = "McDonald's Los Alamos Km 4.5 Carrt. Al Atl\u00e1ntico Centro Comercial Los Alamos zona 18";
        //Zona 19
        this.localidad [0][19] = "McDonald's Florida Calzada San Juan 1-83 zona 19 Centro Comercial Plaza Florida.";
        //Localidades de Burger King
        this.localidad [1][0] = "Burger King";
        //Zona 1
        this.localidad [1][1] = "10 CALLE 6-11, ZONA 1";
        //zona 2
        this.localidad[1][2]= "10 CALLE 6-11, ZONA 1";
        //zona 3
        this.localidad[1][3]= "10 CALLE 6-11, ZONA 1";
        //Zona 4
        this.localidad [1][4] = "6A. AVE. 0-60, ZONA 4. C.C. ZONA 4. LOCALES 100-101.";
        //Zona 5
        this.localidad [1][5] = "27 CALLE 30-07, ZONA 5";
        //Zona 6
        this.localidad [1][6] = "CALLE MARTI 13-03, ZONA 6";
        //Zona 7
        this.localidad [1][7] = "DIAGONAL 12, 21-20, ZONA 7. C.C. GRAN V\u00cdA ROOSEVELT";
        //zona 8
        this.localidad [1][8] = "DIAGONAL 12, 21-20, ZONA 7. C.C. GRAN V\u00cdA ROOSEVELT";
        
        //Zona 9
        this.localidad [1][9] = "6A. AVE 14-84, ZONA 9";
        //Zona 10
        this.localidad [1][10] = "12 CALLE 1-25, ZONA 10. LOCALES 115-116";
        //Zona 11
        this.localidad [1][11] = "CALZADA AGUILAR BATRES 32-10, ZONA 11";
        //zona 12
        this.localidad [1][12] = "AVENIDA PETTAPA, ZONA 12";
        //zona 13
        this.localidad [1][13] = "2 CALLE 17-88, ZONA 15. VISTA HERMOSA 2";
        //zona 14
        this.localidad [1][14] = "2 CALLE 17-88, ZONA 15. VISTA HERMOSA 2";
        //Zona 15
        this.localidad [1][15] = "2 CALLE 17-88, ZONA 15. VISTA HERMOSA 2";
        //Zona 16
        this.localidad [1][16] = "PLAZA TECHADA L-2 C.C. URL. VH 3, ZONA 16";
        //Zona 17
        this.localidad [1][17] = "C.C. PORTALES RUTA AL ATL\u00c1NTICO ZONA 17";
        
        //Domino's
        this.localidad [2][0] = "Domino's";
        //Zonq 1
        this.localidad [2][1] = "Parque Colon 9A Calle A";
        //Zona 2
        this.localidad[2][2]= "Parque Colon 9A Calle A";
        //Zona 3
        this.localidad [2][3] = "Frente Estaci\u00f3n Bolivar Transmetro";
        //Zona 4
        this.localidad [2][4] = "Centro Comercial Plaza Zona 4";
        //Zona 5
        this.localidad [2][5] =  "Santa Amelia";
        //zona 6
        this.localidad[2][6]="Santa Amelia";
        
        //Zona 7
        this.localidad [2][7] = "CENTRO COMERCIAL LA QUINTA Calzada San Juan";
        //zona 8
        this.localidad[2][8]="CENTRO COMERCIAL LA QUINTA Calzada San Juan";
        
        //Zona 9
        this.localidad [2][9] = "Torre del reformador";
        //Zona 10
        this.localidad [2][10] = "Centro Comercial La Pradera Z.10";
        //Zona 11
        this.localidad [2][11] = "Centro Comercial Miraflores";
        //Zona 12
        this.localidad [2][12] = "Colonia El Carmen Z.12";
        //zona 13
        this.localidad[2][13]= "Centro Comercial Parque Las Am\u00e9ricas";
        //Zona 14
        this.localidad [2][14] = "Centro Comercial Parque Las Am\u00e9ricas";
        //Zona 15
        this.localidad [2][15] = "CC. Metronorte (costado Cines)";
        //Zona 16
        this.localidad [2][16] = "Dinamia Cayal\u00e1";
        //Zona 17
        this.localidad [2][17] = "Centro Comercial Portales";
    }
}
