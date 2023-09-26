package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private  ArrayList<Zona> zona = new ArrayList<>();


	public Zoologico(){
	
	}
	public Zoologico(String nombre, String ubicacion){
		this.setNombre(nombre);
		this.setUbicacion(ubicacion);
	}
	
	public void agregarZonas(Zona zona){
		this.zona.add(zona);
		zona.setZoo(this);
	}
	
	
	public static int cantidadTotalAnimales() {
		
		return Animal.getTotalAnimales();
		
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
