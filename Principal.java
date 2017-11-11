public class Principal{
	
	/*
	 * package Clases;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;


public class Principal {
	//Importaci�n de la clase scanner para poder interactuar con el usuario
	static Scanner scanner = new Scanner(System.in);
	//Declaracion de variables
	static Arrusuarios arreglo = new Arrusuarios();
	static Errores error = new Errores();
	public static void main(String[] args) {
		//Bienvenida al usuario
		System.out.println("Bienvenido al sistema. Ingrese el numero de la opcion que quiere elegir: ");
		int opcion = 0;
		Matriz matriz = new Matriz();
		

		
		while (true) {
			System.out.println("1. Ingresar un usuario");
			System.out.println("2. Crear usario");
			System.out.println("3. Salir");
			String opcion0 = scanner.next();
			while (error.evaluarInt(opcion0, 4) == false) {
				System.out.println("Error 1001, debe ingresar un n�mero v�lido.");
				System.out.println("Int�ntelo de nuevo");
				opcion0 = scanner.next();
			}
			opcion = Integer.parseInt(opcion0);
			switch (opcion) {
			
			case 1:
				System.out.println("Ingrese el nombre de usuario");
				String username = scanner.next();
				if (arreglo.getMap().containsKey(username)) {
					System.out.println("�xito.");
					int activo = 0;
					
					while(activo == 0) {
						System.out.println("Ingrese el n�mero del men� que quiere abrir: ");
						System.out.println("1. McDonnald's");
						System.out.println("2. Burger King");
						System.out.println("3. Dominos");
						int menu = scanner.nextInt();
						
						String continuo = "si";
						//System.out.println(matriz.getObj(0, 5));
						if (menu ==1) {
				
							for (int i = 0; i < 81; i++) {
								System.out.println(i+"."+matriz.getObj(0, i) + " Q"+ matriz.getObj(1, i));	
								
							}
							
							while (continuo.equals("si")) {
								
								Orden orden = new Orden();
							System.out.println("Ingrese el n�mero del alimento que desea");
							String comida0 = scanner.next();
							while (error.evaluarInt(comida0, 81) == false) {
								System.out.println("Error 1001, debe ingresar un n�mero v�lido.");
								System.out.println("Int�ntelo de nuevo");
								comida0 = scanner.next();
							}
							int comida1 = Integer.parseInt(comida0);
							orden.setComida(matriz.getObj(0, comida1));
							System.out.println("�Cu�nt@s quiere? Ingrese la cantidad que desea (MAX 99)");
							String cant0 = scanner.next();
							while(error.evaluarInt(cant0, 100) == false) {
								System.out.println("Error 1001, debe ingresar un n�mero v�lido.");
								System.out.println("Intentelo de nuevo");
								cant0 = scanner.next();
							}
							int cant = Integer.parseInt(cant0);
							orden.setCantidad(cant);
							int precio = Integer.parseInt(matriz.getObj(1, comida1));
							orden.setPrecio(precio);
							arreglo.addcomida(orden);
							System.out.println("�Desea agreagar algo m�s a su orden?(si/no)");
							continuo = scanner.next();
							while(continuo.equals("si") == false && continuo.equals("no")==false ) {
								System.out.println("Error 1003, debe ingresar si o no");
								System.out.println("Int�ntelo de nuevo");
								continuo = scanner.next();
							}
							}
							activo = 1;
						}
						
						
						
						if (menu == 2) {
							for(int i = 0; i< 64; i++) {
								System.out.println(i+"."+matriz.getObj(2, i) + " Q"+ matriz.getObj(3, i));
							}
							
							while (continuo.equals("si")) {
								
								Orden orden = new Orden();
							System.out.println("Ingrese el n�mero del alimento que desea");
							String comida0 = scanner.next();
							while (error.evaluarInt(comida0, 64) == false) {
								System.out.println("Error 1001, debe ingresar un n�mero v�lido.");
								System.out.println("Int�ntelo de nuevo");
								comida0 = scanner.next();
							}
							int comida1 = Integer.parseInt(comida0);
							orden.setComida(matriz.getObj(2, comida1));
							System.out.println("�Cu�nt@s quiere? Ingrese la cantidad que desea (MAX 99)");
							String cant0 = scanner.next();
							while(error.evaluarInt(cant0, 100) == false) {
								System.out.println("Error 1001, debe ingresar un n�mero v�lido.");
								System.out.println("Int�ntelo de nuevo");
								cant0 = scanner.next();
							}
							int cant = Integer.parseInt(cant0);
							orden.setCantidad(cant);
							int precio = Integer.parseInt(matriz.getObj(3, comida1));
							orden.setPrecio(precio);
							arreglo.addcomida(orden);
							System.out.println("�Desea agregar algo m�s a su orden?(si/no)");
							continuo = scanner.next();
							while(continuo.equals("si") == false && continuo.equals("no")==false ) {
								System.out.println("Error 1003, debe ingresar si o no");
								System.out.println("Int�ntelo de nuevo");
								continuo = scanner.next();
							}
							
							}
							activo = 1;
						}
						
						
						if (menu==3) {
							for(int i = 0; i<43; i++) {
								System.out.println(i+"."+ matriz.getObj(4, i) + " Q"+ matriz.getObj(5, i));
							}
							
							while (continuo.equals("si")) {
								
								Orden orden = new Orden();
							System.out.println("Ingrese el n�mero del alimento que desea");
							String comida0 = scanner.next();
							while (error.evaluarInt(comida0, 43) == false) {
								System.out.println("Error 1001, debe ingresar un n�mero v�lido.");
								System.out.println("Int�ntelo de nuevo");
								comida0 = scanner.next();
							}
							int comida1 = Integer.parseInt(comida0);
							orden.setComida(matriz.getObj(4, comida1));
							System.out.println("�Cu�nt@s quiere? Ingrese la cantidad que desea (MAX 99)");
							String cant0 = scanner.next();
							while(error.evaluarInt(cant0, 100) == false) {
								System.out.println("Error 1001, debe ingresar un n�mero v�lido.");
								System.out.println("Int�ntelo de nuevo");
								cant0 = scanner.next();
							}
							int cant = Integer.parseInt(cant0);
							orden.setCantidad(cant);
							int precio = Integer.parseInt(matriz.getObj(5, comida1));
							orden.setPrecio(precio);
							arreglo.addcomida(orden);
							System.out.println("�Desea agregar algo m�s a su orden?(si/no)");
							continuo = scanner.next();
							while(continuo.equals("si") == false && continuo.equals("no")==false ) {
								System.out.println("Error 1003, debe ingresar si o no");
								System.out.println("Int�ntelo de nuevo");
								continuo = scanner.next();
							}
							
						}
							activo = 1;
							
					}
					}
					for(int i = 0; i < arreglo.getLengthorden(); i++) {
					System.out.println(arreglo.getOrden(i).toString());
					}
					int total = 0;
					for(int i = 0; i< arreglo.getLengthorden(); i++) {
						total = total + arreglo.getOrden(i).getCantidad() * arreglo.getOrden(i).getPrecio();
					}
					System.out.println("Su total a pagar es " + Integer.toString(total) + " quetzales.");
				}
				 else {
					System.out.println("El usuario " + username + " no existe.");
				}
				
				break;
			case 2:
				Usuario usuario = crearusuario();
				arreglo.addusuario(usuario);
				break;
				
			default:
				System.out.println("Cerrando programa.�Adi�s!");
				System.exit(0);
				break;
			}
		}
	}
		
		public static Usuario crearusuario() {
			Usuario usuario = new Usuario();
			System.out.println("Ingrese su nombre");
//			scanner.nextLine();
			String nombre = scanner.next();
			while (arreglo.getMap().containsKey(nombre) == true) {
				System.out.println("Error 1002, el nombre de usuario que ingres� ya existe. Elija otro.");
				nombre = scanner.next();
			}
			usuario.setNombre(nombre);
			System.out.println("Ingrese el n�mero de su tarjeta de cr�dito");
			int tarjeta = scanner.nextInt();
			usuario.setTarjeta(tarjeta);
			System.out.println("Ingrese el cvv de su tarjeta (el c�digo de seguridad)");
			int cvv  = scanner.nextInt();
			usuario.setCvv(cvv);
			System.out.println("Ingrese la fecha de expiraci�n de la tarjeta. Para esto ingrese los cuatro n�meros en orden (xx/xx)");
			String fechaExp = scanner.next();
			usuario.setFechaExp(fechaExp);
			System.out.println("Ingrese la placa de su carro");
			String placa = scanner.next();
			usuario.setPlaca(placa);
			System.out.println("Ingrese el color de su carro");
			String color = scanner.next();
			usuario.setColor(color);
			System.out.println("Ingrese el a�o en el el modelo de su carro");
			int modelo = scanner.nextInt();
			usuario.setModelo(modelo);
			System.out.println("Ingrese la l�nea de su carro");
			String linea = scanner.next();
			usuario.setLinea(linea);
			System.out.println("Ingrese la marca de su carro (este es el �ltimo paso)");
			String marca = scanner.next();
			usuario.setMarca(marca);
			
		
			
			
			return usuario;
			
		}
		

			
		
		
	}
	 */
	
}

