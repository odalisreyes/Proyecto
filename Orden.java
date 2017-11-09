/*
 * Esta clase tiene el objetivo de crear la orden del usuario
 * @Authors: Oliver Graf  17190
 * 			 Ivan Maldonado  17211
 * 			 Odalis Reyes  17032
 * 			 Mayra Silva  17276
 * @File name: Orden.java
 * @Date and Project: Proyecto final de POO (24/09/2017)
 */



public class Orden {


    /**
     * Declaracion de atributos
     */
    private String comida;
    private int precio;
	private int cantidad;
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Orden [comida=" + comida + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}


	/**
	 * sets y gets para precio
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}



    /**
     * Constructor
     */
    public Orden() {
    	comida= "";
    	cantidad=0;
    	
    }


    /**
     * sets y gets para el atributo comida
     * @return comida
     */
    public String getComida() {
        return comida;
    }

    /**
     * @param comida
     */
    public void setComida(String comida) {
        this.comida=comida;
    }

    /**
     * Sets y gets para la cantidad 
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad=cantidad;
    }
}