package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class Knight extends Ficha{


	
	public Knight(Color color,Coordenadas coordenadas,Tablero t) {
		super(coordenadas, color);

		this.color=color;
		this.coordenadas=coordenadas;
		this.tablero=t;

		
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
	public void calcularCoordenadas() {
		
		coordenadasPosibles.clear();
		
		Coordenadas c;
		
		c = getCoordenadas().up().up().right();
		if(c.existe())
			if(tablero.existeColor(c,this.color)) {
				coordenadasPosibles.add(c);
				

			}
			c= getCoordenadas().up().up().left();
			if(tablero.existeColor(c,this.color)) {
				coordenadasPosibles.add(c);

			}
			c= getCoordenadas().down().down().right();
			if(tablero.existeColor(c,this.color)) {
				coordenadasPosibles.add(c);

			}
			c=getCoordenadas().down().down().left();
			if(tablero.existeColor(c,this.color)) {
				coordenadasPosibles.add(c);
				

			}
			c=getCoordenadas().right().right().down();
			if(tablero.existeColor(c,this.color)) {
				coordenadasPosibles.add(c);

			}
			c= getCoordenadas().right().right().up();
			if(tablero.existeColor(c,this.color)) {
				coordenadasPosibles.add(c);

			}
			c= getCoordenadas().left().left().down();
			if(tablero.existeColor(c,this.color)) {
				coordenadasPosibles.add(c);

			}
			c=getCoordenadas().left().left().up();
			if(tablero.existeColor(c,this.color)) {
				coordenadasPosibles.add(c);

			}
			
			
			

			
		
	}
	public void setCoordenadasPosibles(ArrayList<Coordenadas> coordenadasPosibles) {
		this.coordenadasPosibles = coordenadasPosibles;
	}
	public void printCoordenadasPosibles() {
		
		System.out.println(this.coordenadasPosibles);
		
	}
	public void setCoor(Coordenadas coor) {

		this.coordenadas=coor;
		
	}
	
}

