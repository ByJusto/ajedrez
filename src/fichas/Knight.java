package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class Knight extends Ficha{


	private Color color;
	private Coordenadas coordenadas;
	private ArrayList<Coordenadas> coordenadasPosibles = new ArrayList<Coordenadas>();
	
	public Knight(Color color,Coordenadas coordenadas) {
		super();

		this.color=color;
		this.coordenadas=coordenadas;
		
	}
	
	public String toString() {
		
		if(this.color.equals(Color.white)) {
			
			return Ficha.Shape.white_knight.toString();
		}else
			return Ficha.Shape.black_knight.toString();
			
		
	}
	public Coordenadas getCoordenadas() {
		
		return coordenadas;
		
	}
	public void calcularCoordenadas(Celda[][] t) {
		
		coordenadasPosibles.clear();
		System.out.println(coordenadas);
		//t[coordenadas.up().up().right().getYInt()][coordenadas.up().up().right().getXInt()].getFicha().getColor();		
		//try {
			if(!t[coordenadas.up().up().right().getYInt()][coordenadas.up().up().right().getXInt()].comprobarColor(this.color) && coordenadas.up().up().right().existe()) {
				coordenadasPosibles.add((coordenadas.up().up().right()));
			}
			if(!t[coordenadas.up().up().left().getYInt()][coordenadas.up().up().left().getXInt()].comprobarColor(this.color) && coordenadas.up().up().left().existe()) {
				coordenadasPosibles.add(coordenadas.up().up().left());
			}
			if(!t[coordenadas.down().down().right().getYInt()][coordenadas.down().down().right().getXInt()].comprobarColor(this.color) && coordenadas.down().down().right().existe()) {
				coordenadasPosibles.add(coordenadas.down().down().right());
			}
			if(!t[coordenadas.down().down().left().getYInt()][coordenadas.down().down().left().getXInt()].comprobarColor(this.color) && coordenadas.down().down().left().existe()) {
				coordenadasPosibles.add(coordenadas.down().down().left());
			}
			if(!t[coordenadas.right().right().down().getYInt()][coordenadas.right().right().down().getXInt()].comprobarColor(this.color) && coordenadas.right().right().down().existe()) {
				coordenadasPosibles.add(coordenadas.right().right().down());
			}
			if(!t[coordenadas.right().right().up().getYInt()][coordenadas.right().right().up().getXInt()].comprobarColor(this.color) && coordenadas.right().right().up().existe()) {
				coordenadasPosibles.add(coordenadas.right().right().up());
			}
			if(!t[coordenadas.left().left().down().getYInt()][coordenadas.left().left().down().getXInt()].comprobarColor(this.color) && coordenadas.left().left().down().existe()) {
				coordenadasPosibles.add(coordenadas.left().left().down());
			}
			if(!t[coordenadas.left().left().up().getYInt()][coordenadas.left().left().up().getXInt()].comprobarColor(this.color) && coordenadas.left().left().up().existe()) {
				coordenadasPosibles.add(coordenadas.left().left().up());
			}
		//}catch (java.lang.NullPointerException | java.lang.ArrayIndexOutOfBoundsException exception) {}
		
	}
	
	
}

