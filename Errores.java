
/** 
 * Esta clase tiene como objetivo crear los métodos necesarios para los posibles errores dentro del programa. 
 * 
 * @author Mayra Silva    17276
 * @author Odalis Reyes   17032
 * @author Ivan Maldonado 17211
 * 
 * @file Errores.java
 * @since 24/09/17
 */


public class Errores {

	
	/**
	 * CONSTRUCTOR
	 */
	public Errores() {

	}
	

	//METODOS
	
	/**
	 * METODO 1: Este método tiene como propósito evaluar si lo que ingresa el usuario es un entero y si es parte del menu;
	 * 
	 * @param s
	 * @param largo
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
