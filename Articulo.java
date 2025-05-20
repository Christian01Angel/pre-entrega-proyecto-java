package poo;

public class Articulo {
	//Estos son los atributos de la clase.
	private static int contador = 0;
	private int id;
	private String nombre;
	private double precio;
	
	//Ahora colocamos el constructor de la clase
	//El constructor se manda a llamar cuando se crea el objeto
	//El constructor debe tener el mismo nombre de la clase
	
	public Articulo(String nombre, double precio) {
		this.id = ++contador;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//vamos a crear los setters y getters
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public void setPrecio(double nuevoPrecio) {
		this.precio = nuevoPrecio;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	//Ahora vamos a crearle un metodo a la clase. Especificamente este metodo cuando se mande allamar
	//va a mostrar informacion acerca del objeto creado,
	void mostrar() { //void va porque este nmetodo no devuelve nada
		System.out.println("ID: "+this.id+"| Nombre: "+this.nombre+"| Precio: "+this.precio);
	}
}
