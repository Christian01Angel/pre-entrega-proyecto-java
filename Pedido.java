package poo;
import java.util.ArrayList;

public class Pedido extends ArrayList<Articulo> {
	private static int id = 0;
	private double total;
	private int cantidad;
	
	public Pedido(Articulo articulos, int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double calcularTotal(ArrayList<Articulo> pedidos) {
		total = 0;
		for (Articulo articulo: pedidos) {
		}
		return this.total;
	}
	
	public void finalizarPedido() {
		//Una vez finalizado el pedido incrementamos el id e imprimimos el pedido.
		id+=1;
	}
	
}	