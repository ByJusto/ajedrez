package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class King extends Ficha {



	public King(Color color,Coordenadas coordenadas,Tablero t) {
		super(coordenadas, color);
		this.color = color;
		this.coordenadas=coordenadas;
		this.tablero=t;


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

public void calcularCoordenadas() {
		

		//up
		
		Coordenadas c;
		
		c= getCoordenadas().up();
		
		if(tablero.existeColor(c,this.color)) {
			coordenadasPosibles.add(c);
		} 
		//down
		c= getCoordenadas().down();

		if(tablero.existeColor(c,this.color)) {
			coordenadasPosibles.add(c);
		}
		//right
		c= getCoordenadas().right();

		if(tablero.existeColor(c,this.color)) {
			coordenadasPosibles.add(c);
		}
		//left
		c= getCoordenadas().left();

		if(tablero.existeColor(c,this.color)) {
			coordenadasPosibles.add(c);
		}
		//up-right
		c= getCoordenadas().up().right();

		if(tablero.existeColor(c,this.color)) {
			coordenadasPosibles.add(c);
		}
		//up-left
		c= getCoordenadas().up().left();

		if(tablero.existeColor(c,this.color)) {
			coordenadasPosibles.add(c);
		}
		//down-left
		c= getCoordenadas().down().left();

		if(tablero.existeColor(c,this.color)) {
			coordenadasPosibles.add(c);
		}
		//down-right
		c= getCoordenadas().down().right();

		if(tablero.existeColor(c,this.color)) {
			coordenadasPosibles.add(c);
		}
		

				
		
	}


@Override
public void setCoor(Coordenadas coor) {

	this.coordenadas=coor;
	
}
}