package zooAnimales;

import java.util.ArrayList;



public class Ave extends Animal {
	
	private static ArrayList<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(){listado.add(this);}

	public Ave( String nombre, int edad, String habitat, String genero,
			 String colorPlumas) {
		super( nombre, edad, habitat, genero);
		
		this.setColorPlumas(colorPlumas);
		listado.add(this);
	}
	
	public int cantidadAves() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "volar"; 
	}
	
	public static Ave crearHalcon(String nombre,int edad,String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones ++;
		return halcon;
	}
	
	public static Ave crearAguila(String nombre,int edad,String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas ++;
		return aguila;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}
