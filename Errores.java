/*
 *
 * Esta clase tiene como objetivo crear los métodos necesarios para los posibles errores dentro del programa. 
 * 
 * @Authors: Oliver Graf  17190
 * 			 Ivan Maldonado  17211
 * 			 Odalis Reyes  17032
 * 			 Mayra Silva  17276
 * @File name: Errores.java
 * @Date and Project: Proyecto final de POO (24/09/2017)
 */




public class Errores {

	
	/**
	 * CONSTRUCTOR
	 */
	public Errores() {

	}
	

	//METODOS
	
	/*
	 * METODO 1: Este método tiene como propósito evaluar si lo que ingresa el usuario es un entero y si es parte del menu;
	 * @param s, largo
	 * @return boolean
	 */
	public boolean evaluarInt(String s, int largo) {
		   try { 
			   /*
			    * Se colocan los parametros, el cual verifica si el numero ingresado para el menu es parte
			    * del rango que se coloca en las opciones
			    */
		        int s1 = Integer.parseInt(s); 
		        if (s1 > 0 && s1 < largo) {
		        	return true;
		        }
		        /*
		         * Si no esta dentro del parametro, retorna un boolean false, puesto que el numero ingresado 
		         * no esta dentro del rango especificado
		         */
		        else {
		        	return false;
		        }
		      
		    /*
		     * En caso que el numero ingresado no fuese un int, regresa un boolean false
		     */
		    } catch(NumberFormatException e) { 
		        return false; 
		    } catch(NullPointerException e) {
		        return false;
		    }
		 
		}
	
	
	/* public boolean evaluarString(String s) {
		try {
			if(s instanceof String) {
				return true;
			}
			else {
				return false;
			}
			
		}catch(Exception e) {
			return false;
		}
		
	} */
	
	

}
