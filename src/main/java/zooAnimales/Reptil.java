package zooAnimales;

import java.util.ArrayList;



public class Reptil extends Animal{
	
	
	private ArrayList<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	Reptil(){listado.add(this);}
	
	
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.setColorEscamas(colorEscamas);
		this.setLargoCola(largoCola);
		listado.add(this);
	}


	@Override
	String movimiento() {
		return "reptar"; 
	}

	int cantidadReptiles() {
		return listado.size();
	}
	

	static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad,"humedal",genero, "verde",3);
		iguanas++;
		return iguana;
	}
	
	static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla",genero, "blanco",1);
		serpientes++;
		return serpiente;
	}



	public String getColorEscamas() {
		return colorEscamas;
	}



	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}



	public int getLargoCola() {
		return largoCola;
	}



	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}