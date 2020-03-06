package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class Bishop extends Ficha {

	public Bishop(Color color, Coordenadas coordenadas, Tablero t) {
		super(coordenadas, color);
		this.color = color;
		this.coordenadas = coordenadas;
		this.tablero = t;

	}

	public String toString() {
		
		//Segun el color devuelve una ficha o otra
		
		if (this.color.equals(Color.white)) {

			return Ficha.Shape.white_bishop.toString();
		} else
			return Ficha.Shape.black_bishop.toString();

	}

	public void calcularCoordenadas() {
		//Calcular las posiciones posibles desde la posicion actual
		coordenadasPosibles.clear();



		Coordenadas c;

		c = getCoordenadas().up().right();

		// up-right
		while (tablero.existeEmpty(c)) {
			coordenadasPosibles.add(c);

			c = c.up().right();

		}
		if (tablero.existeColor(c,this.color)) {
			coordenadasPosibles.add(c);
		}

		c = getCoordenadas().up().left();
		// up-left
		while (tablero.existeEmpty(c)) {
			coordenadasPosibles.add(c);

			c = c.up().left();

		}
		if (tablero.existeColor(c,this.color)) {
			coordenadasPosibles.add(c);
		}

		c = getCoordenadas().down().right();

		// down-right
		while (tablero.existeEmpty(c)) {
			coordenadasPosibles.add(c);

			c = c.up().left();

		}
		if (tablero.existeColor(c,this.color)) {
			coordenadasPosibles.add(c);
		}

		c = getCoordenadas().down().left();

		// down-left
		while (tablero.existeEmpty(c)) {
			coordenadasPosibles.add(c);

			c = c.up().left();

		}
		if (tablero.existeColor(c,this.color)) {
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

		this.coordenadas = coor;

	}

}
