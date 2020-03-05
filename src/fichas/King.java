package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class King extends Ficha {



	public King(Color color,Coordenadas coordenadas) {
		super(coordenadas, color);
		this.color = color;
		this.coordenadas=coordenadas;

	}
		

	public String toString() {

		if (this.color.equals(Color.white)) {

			return Ficha.Shape.white_king.toString();
		} else
			return Ficha.Shape.black_king.toString();

	}
	public void setCoordenadasPosibles(ArrayList<Coordenadas> coordenadasPosibles) {
		this.coordenadasPosibles = coordenadasPosibles;
	}
	public void printCoordenadasPosibles() {
		
		System.out.println(this.coordenadasPosibles);
		
	}

public void calcularCoordenadas(Celda[][] t) {
		
		//coordenadasPosibles.clear();
		
		//t[coordenadas.up().up().right().getYInt()][coordenadas.up().up().right().getXInt()].getFicha().getColor();		
	//	try {
		//up
		if(!t[coordenadas.up().getYInt()][coordenadas.up().getXInt()].comprobarColor(this.color) && coordenadas.up().existe()) {
			coordenadasPosibles.add(coordenadas.up());
		} 
		//down
		if(!t[coordenadas.down().getYInt()][coordenadas.down().getXInt()].comprobarColor(this.color) && coordenadas.down().existe()) {
			coordenadasPosibles.add(coordenadas.down());
		}
		//right
		if(!t[coordenadas.right().getYInt()][coordenadas.right().getXInt()].comprobarColor(this.color) && coordenadas.right().existe()) {
			coordenadasPosibles.add(coordenadas.right());
		}
		//left
		if(!t[coordenadas.left().getYInt()][coordenadas.left().getXInt()].comprobarColor(this.color) && coordenadas.left().existe()) {
			coordenadasPosibles.add(coordenadas.left());
		}
		//up-right
		if(!t[coordenadas.up().right().getYInt()][coordenadas.up().right().getXInt()].comprobarColor(this.color) && coordenadas.up().right().existe()) {
			coordenadasPosibles.add(coordenadas.up().right());
		}
		//up-left
		if(!t[coordenadas.up().left().getYInt()][coordenadas.up().left().getXInt()].comprobarColor(this.color) && coordenadas.up().down().existe()) {
			coordenadasPosibles.add(coordenadas.up().left());
		}
		//down-left
		if(!t[coordenadas.down().left().getYInt()][coordenadas.down().left().getXInt()].comprobarColor(this.color) && coordenadas.down().left().existe()) {
			coordenadasPosibles.add(coordenadas.down().left());
		}
		//down-right
		if(!t[coordenadas.down().right().getYInt()][coordenadas.down().right().getXInt()].comprobarColor(this.color) && coordenadas.down().right().existe()) {
			coordenadasPosibles.add(coordenadas.down().right());
		}
		
	//	}catch (java.lang.NullPointerException | java.lang.ArrayIndexOutOfBoundsException exception) {}

				
		
	}


@Override
public void setCoor(Coordenadas coor) {

	this.coordenadas=coor;
	
}
}