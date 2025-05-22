package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Articulo> lista = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int opcion;
		do {
			System.out.println("\n--- Menu de Articulos ---");
			System.out.println("1. Crear artículos");
			System.out.println("2. Listar artículos");
			System.out.println("3. Modificar artículo");
			System.out.println("4. Eliminar artículo");
			System.out.println("5. Salir");
			System.out.println("Seleccione una opción: ");
			
			opcion = sc.nextInt();
			//sc.nextLine(); //Limpiar buffer
			
			switch(opcion) {
			case 1 -> crearArticulo();
			case 2 -> listarArticulos();
			case 3 -> modificarArticulo();
			case 4 -> eliminarArticulo();
			case 5 -> System.out.println("Salliendo...");
			default -> System.out.println("Opcion invalida.");
			}
			
		}while(opcion!=5);
	}

	//Los metodos(funciones) que queramos usar dentro del static void main, los tenemos que crear
	//dentro de la clase main, pero fuera del static void main. O sea, los creamos abajo de
	//este comentario.
	
	public static void crearArticulo() {
		//Funcion para crear articulos, y al mismo tiempo lo agraegamos a la lista crada al principio
		boolean condicion = true;
		
		do {
			
			boolean coincidencia = true;
			
			System.out.println("Ingrese el nombre del producto: ");
			String nombre = sc.next();
			sc.nextLine();
			System.out.println("Ingrese el precio del producto: ");
			double precio = sc.nextDouble();
			sc.nextLine();
			
			if (lista.isEmpty()){
				Articulo art = new Articulo(nombre, precio);
				lista.add(art);
				System.out.println("Producto creado.");
				condicion = false;
			}
			else {		
				for (Articulo articulo : lista) {
					if (nombre != articulo.getNombre()){
						
						coincidencia = false;
					}
					else {
						System.out.println("El articulo que desea ingresar ya existe");
					}
				}
				if (!coincidencia) {
					Articulo art = new Articulo(nombre, precio);
					lista.add(art);
					System.out.println("Producto creado.");
					condicion = false;
			}
			
			}
			
		}while(condicion);
	}
	
	public static void listarArticulos() {
		//Funcion para listar (mostrar por consola) los articulos existentes
		for (Articulo articulo : lista) {
			articulo.mostrar();
		}
	}
	
	public static void modificarArticulo() {
		//Funcion para modificar los articulos existentes con el id del producto
		//Deberiamos hacer una validacion para ver si existe el id del producto a modificar
		//Para actualizar el producto verdaderamente se deberia aplicar un setter.
		boolean condicion = true;
		do {
			System.out.println("Ingrese el id del articulo a modificar: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			for (Articulo art : lista) {
				if (id == art.getId()) {
					boolean cond2 = true;
					do {
						System.out.println("Seccion de modificacion de articulos:");
						System.out.println("1. Modificar solo el nombre");
						System.out.println("2. Modificar solo el precio");
						System.out.println("3. Modificar nombre y precio");
						int modificacion = sc.nextInt();
						sc.nextLine();
						
						switch (modificacion) {
						case 1:
							System.out.println("Ingrese el nuevo nombre: ");
							art.setNombre(sc.next());
							sc.nextLine();
							
							cond2 = false;
							break;
						case 2:
							System.out.println("Ingrese el nuevo precio: ");
							art.setPrecio(sc.nextDouble());
							sc.nextLine();
							cond2 = false;
							break;
						case 3:
							System.out.println("Ingrese el nuevo nombre: ");
							art.setNombre(sc.next());
							sc.nextLine();
							System.out.println("Ingrese el nuevo precio: ");
							art.setPrecio(sc.nextDouble());
							sc.nextLine();
							cond2 = false;
							break;
						default:
							System.out.println("El numero ingresado es incorrecto, por favor intente nuevamente.");
						}
						
					}while(cond2);
					condicion = false;
					System.out.println("Producto actualizado");
				}
				else {
					System.out.println("No se registra ningun articulo on ese id, intentelo nuevamente");
				}
			}
			
		}while (condicion);
		
		}
	
	public static void eliminarArticulo() {
		//funcion para eliminar un articulo segun el id. Tambien se deberia aplicar una validacion.
		boolean condicion = true;
		do {
			boolean coincidencia = false;
			System.out.println("Ingrese el id del articulo a eliminar: ");
			int id = sc.nextInt();
			sc.nextLine();
			for (Articulo art : lista) {
				if (id == art.getId()) {
					coincidencia = true;
				}
				else {
					System.out.println("No se registra ningun articulo on ese id, intentelo nuevamente");
				}
			}
			if (coincidencia) {
				lista.removeIf(a -> a.getId() == id);
				System.out.println("Producto eliminado");
				condicion = false;
			}
			
		}while (condicion);
	}
	
}
