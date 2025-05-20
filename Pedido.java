package poo;
import java.util.ArrayList;

public class Pedido extends Articulo {
	private static int id;
	private double total;
	private int cantidad;
	
	public Pedido(String nombre, double precio, int cantidad) {
		super(nombre, precio);
		this.cantidad = cantidad;
	}
	
	
	
	public double calcularTotal() {
		System.out.println("Hola");
		double num = 1.5;
		return num;
	}
}
