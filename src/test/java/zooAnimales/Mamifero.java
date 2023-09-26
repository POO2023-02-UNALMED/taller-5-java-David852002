package zooAnimales;

import java.util.ArrayList;



public class Mamifero extends Animal {
	
	private static ArrayList<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	Mamifero(){ listado.add(this);}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.setPelaje(pelaje);
		this.setPatas(patas);
		listado.add(this);
	}

	int cantidadMamiferos() {
		return listado.size();
	}

	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero,true,4);
		caballos ++;
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero Leon = new Mamifero(nombre, edad, "selva", genero,true,4);
		leones++;
		return Leon;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
}
