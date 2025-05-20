package poo;
import java.util.ArrayList;

public class Pedido extends Articulo {
	private static int id = 0;
	private double total;
	private int cantidad;
	private ArrayList<Articulo> pedido;
	
	public Pedido(String nombre, double precio, int cantidad) {
		super(nombre, precio);
		this.cantidad = cantidad;
	}
	
	public void agregarProducto(Articulo producto) {
		//La validacion se hace en el main, al agregar un producto por su ID. Aca se agrega el producto completo + la cantidad a pedir de ese producto.
		pedido.add(producto);
	}
	
	public void finalizarPedido() {
		//Una vez finalizado el pedido incrementamos el id e imprimimos el pedido.
		id+=1;
	}
	
	public double calcularTotal(ArrayList<Articulo> pedidos) {
		total = 0;
		for (Articulo articulo: pedidos) {
		}
		return this.total;
	}
}	