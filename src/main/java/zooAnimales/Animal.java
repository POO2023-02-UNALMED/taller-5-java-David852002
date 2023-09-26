package zooAnimales;

import gestion.*;

public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;

	
	public Animal(){
		totalAnimales ++;
	}
	
	public Animal( String nombre, int edad,
			String habitat,String genero){
		totalAnimales ++;
		this.nombre = nombre; 
		this.edad = edad;
		this.habitat = habitat;  
		this.genero  = genero;
	}
	
	public String movimiento() {
	
		return "desplazarse";
	}
	
	public String totalPorTipo() {
		return String.format("Mamiferos: %f\nAves: %g\nReptiles: %h\nPeces: %i\nAnfibios: %j",
				Mamifero.caballos+Mamifero.leones, Ave.aguilas+Ave.halcones,Reptil.iguanas+Reptil.serpientes,
				Pez.bacalaos+Pez.salmones, Anfibio.ranas+Anfibio.salamandras);
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public String toString(){
		
		return String.format("Mi nombre es %a, tengo una edad de %b, habito en %c y mi genero es %d, la zona en la que me ubico es %e, en el %f",
				nombre, edad, habitat, genero, this.zona.getNombre(), this.zona.getZoo());
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
}
