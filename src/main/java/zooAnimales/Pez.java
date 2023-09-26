package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	
	private static ArrayList<Pez> listado = new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	Pez(){listado.add(this);}

	
	Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.setColorEscamas(colorEscamas);
		this.setCantidadAletas(cantidadAletas);
		listado.add(this);
	}

	@Override
	String movimiento() {
		return "nadar"; 
	}

	int cantidadPeces() {
		return listado.size();
	}

	static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo",6);
		salmones++;
		return salmon;
	}
	static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre, edad, "oceano",genero,"gris",6);
		bacalaos++;
		return bacalao;
		
	}


	public int getCantidadAletas() {
		return cantidadAletas;
	}


	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}


	public String getColorEscamas() {
		return colorEscamas;
	}


	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
		
}
	
	


