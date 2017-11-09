import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

/*
 * *Esta clase crea un arreglo de órdenes con el fin de poder crear más de una orden. 
 *@Authors: Oliver Graf  17190
 * Iván Maldonado 17211
 * Mayra Silva 17276
 * Odalis Reyes 17032
 * @File name: Arrusuarios.java
 * @Date and Project: Proyecto final de POO (28/09/2017)
 */

public class Arrusuarios {

	/*
	 * Declaración de atributos
	 */
	private Map<String, Usuario> map = new HashMap<>(); //Se utiliza un hashMap para verificar la existencia de un usuario
	private ArrayList<Orden> ordenusuario = new ArrayList<Orden>();
	
	
	/*
	 * sets y gets de Map
	 * @return map
	 */
	
	public Map<String, Usuario> getMap() {
		return map;
	}

	/**
	 * @param map
	 */
	public void setMap(Map<String, Usuario> map) {
		this.map = map;
	}

	/*
	 * Método que añade el usuario al map
	 * @param: usuario
	 */
	public void addusuario(Usuario usuario) {
	
		map.put(usuario.getNombre(), usuario);
	}
	
	/*
	 * Método que añade la orden al arreglo de órdenes
	 * @param: orden
	 */
	
	public void addcomida(Orden orden) {
		ordenusuario.add(orden);
	}
	
	/*
	 * Sets y gets del array de órdenes
	 * @param: int i  
	 */
	public Orden getOrden(int i) {
		return ordenusuario.get(i);
	}
	
	/*
	 * Este método obtiene la longitud del arrayList
	 * @param: 
	 */
	public int getLengthorden() {
		
		return ordenusuario.size();
	}
	
}
