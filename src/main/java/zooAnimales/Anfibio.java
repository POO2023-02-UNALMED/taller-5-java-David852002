package zooAnimales;
import java.util.ArrayList;
public class Anfibio extends Animal {

	private static ArrayList<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	Anfibio(){listado.add(this);}

	

	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel= colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
	}
	@Override
	String movimiento() {
		return "saltar"; 
	}

	int cantidadAnfibios() {
		return listado.size();
	}

	static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva",genero,"rojo", true);
		ranas ++;
		return rana;
	}
	static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
		return salamandra;
	}



	public String getColorPiel() {
		return colorPiel;
	}



	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}



	public boolean isVenenoso() {
		return venenoso;
	}



	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
}