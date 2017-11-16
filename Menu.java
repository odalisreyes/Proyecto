/**
 * 
 */

/**
 * Esta clase tiene como proposito realizar los metodos necesarios para unir la
 * base de datos con la clase Usuario e implementar los requisitos funcionales
 * 
 * @author Mayra Silva 17276
 * @author Odalis Reyes 17032
 * @author Ivan Maldonado 17211
 * 
 * @since 15/11/17
 */

public class Menu {
	private String restaurante;
	private String categoria;
	private String tipo;
	private String comida;
	private int precio;

	/**
	 * @param restaurante
	 *            tipo de restaurante
	 * @param categoria
	 *            categoria de la comida
	 * @param tipo
	 *            tipo de categoria
	 * @param comida
	 *            comida del menu
	 * @param precio
	 *            precio de la comida
	 */
	public Menu(String restaurante, String categoria, String tipo, String comida, int precio) {
		super();
		this.restaurante = restaurante;
		this.categoria = categoria;
		this.tipo = tipo;
		this.comida = comida;
		this.precio = precio;
	}

	public Menu() {

	}

	/**
	 * @return the restaurante
	 */
	public String getRestaurante() {
		return restaurante;
	}

	/**
	 * @param restaurante
	 *            the restaurante to set
	 */
	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria
	 *            the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the comida
	 */
	public String getComida() {
		return comida;
	}

	/**
	 * @param comida
	 *            the comida to set
	 */
	public void setComida(String comida) {
		this.comida = comida;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio
	 *            the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
