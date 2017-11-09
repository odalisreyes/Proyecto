/*
 * 
 * Esta clase tiene como principal objetivo guardar los datos del usuario y los datos del vehículo que usa el usuario. 
 * Se creó el constructor, junto con los getters y setters de cada atributo. 
 * 
 * @Authors: Oliver Graf  17190
 * 			 Ivan Maldonado  17211
 * 			 Odalis Reyes  17032
 * 			 Mayra Silva  17276
 * @File name: Usuario.java
 * @Date and Project: Proyecto final de POO (20/09/2017)
 */




public class Usuario {
	/*
	 * Se declaran los atributos necesarios para la clase Usuario
	 */
	private String nombre;
	private int tarjeta;
	private int cvv;
	private 	String fechaExp;
	private String placa; 
	private String color;
	private int modelo;
	private String linea;
	private String marca; 
	
	
	/*
	 * CONSTRUCTOR
	 * Se crea el constructor, con la inicialización de cada atributo
	 */
	public Usuario() {
		nombre = " ";
		tarjeta = 0;
		cvv = 0;
		fechaExp = " ";
		placa = " ";
		color = " "; 
		modelo = 0;
		linea = " "; 
		marca = " ";
	}
	
	
	//GETS Y SETS
	
	/*
	 * @param: nombre
	 * @return: nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/*
	 * @param: tarjeta
	 * @return: tarjeta
	 */
	public int getTarjeta() {
		return tarjeta;
	}
	
	public void setTarjeta(int tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	
	/*
	 * @param: cvv
	 * @return: cvv
	 */
	public int getCvv() {
		return cvv;
	}
	
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
	/*
	 * @param: fecha de expiración
	 * @return: fecha de expiración
	 */
	public String getFechaExp() {
		return fechaExp;
	}
	
	public void setFechaExp(String fechaExp) {
		this.fechaExp = fechaExp;
	}
	
	
	/*
	 * @param: placa
	 * @return: placa
	 */
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	/*
	 * @param: color
	 * @return: color
	 */
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	/*
	 * @param: modelo
	 * @return: modelo
	 */
	public int getModelo() {
		return modelo;
	}
	
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	
	/*
	 * @param: linea
	 * @return: linea
	 */
	public String getLinea() {
		return linea;
	}
	
	public void setLinea(String linea) {
		this.linea = linea;
	}
	
	
	/* 
	 * @param: marca
	 * @return: marca
	 */
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
