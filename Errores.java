
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

	
	private boolean error1;
	private boolean error2;
	/**
	 * @param error1
	 * @param error2
	 */
	public Errores(boolean error1, boolean error2) {
		
		this.error1 = error1;
		this.error2 = error2;
	}
	
	public Errores() {
	}

	/**
	 * @return the error1
	 */
	public boolean isError1() {
		return error1;
	}

	/**
	 * @param error1 the error1 to set
	 */
	public void setError1(boolean error1) {
		this.error1 = error1;
	}

	/**
	 * @return the error2
	 */
	public boolean isError2() {
		return error2;
	}

	/**
	 * @param error2 the error2 to set
	 */
	public void setError2(boolean error2) {
		this.error2 = error2;
	}
	
	//METODOS 
	

	
	//Metodo para verificar si el dato ingresado es un string
	/*
	 * @param: string cadena
	 * @return: boolean error1
	 */
	
	public boolean verificarString(String cadena) {
		try {
			Integer.parseInt(cadena);
			this.error1=false;
		}
		catch(NumberFormatException nfe){
			this.error1=true;
			
		}
		return error1;
	}
	
	/*
	 * Metodo para verificar si el dato ingresado es un int
	 * @param: string cadena
	 * @return boolean error2.
	 * 
	 */
	
	public boolean verificarInt(String cadena) {
		try { 
			Integer.parseInt(cadena);
			this.error2=true;
		}
		catch(NumberFormatException nfe) {
			this.error2=false;
		}
		return error2;
	}
	
	}

	
	
	
	

	
	

