package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class Queen extends Ficha {

	public Queen(Color color, Coordenadas coordenadas, Tablero t) {
		super(coordenadas, color);

		this.color = color;
		this.coordenadas = coordenadas;
		this.tablero = t;

	}

	public String toString() {

		if (this.color.equals(Color.white)) {

			return Ficha.Shape.white_queen.toString();
		} else
			return Ficha.Shape.black_queen.toString();

	}

	public void calcularCoordenadas() {

		coordenadasPosibles.clear();

		Coordenadas c;

		c = getCoordenadas().up().right();

		// up-right
		while (tablero.existeEmpty(c)) {
			coordenadasPosibles.add(c);

			c = c.up().right();

		}
		if (tablero.existeColor(c, this.color)) {
			coordenadasPosibles.add(c);
		}

		c = getCoordenadas().up().left();
		// up-left
		while (tablero.existeEmpty(c)) {
			coordenadasPosibles.add(c);

			c = c.up().left();

		}
		if (tablero.existeColor(c, this.color)) {
			coordenadasPosibles.add(c);
		}

		c = getCoordenadas().down().right();

		// down-right
		while (tablero.existeEmpty(c)) {
			coordenadasPosibles.add(c);

			c = c.up().left();

		}
		if (tablero.existeColor(c, this.color)) {
			coordenadasPosibles.add(c);
		}

		c = getCoordenadas().down().left();

		// down-left
		while (tablero.existeEmpty(c)) {
			coordenadasPosibles.add(c);

			c = c.up().left();

		}
		if (tablero.existeColor(c, this.color)) {
			coordenadasPosibles.add(c);
		}

		// up
		c = getCoordenadas().up();
		while (tablero.existeEmpty(c)) {

			coordenadasPosibles.add(c);

			c = c.up();

		}
		if (c.existe())
			if (!tablero.celdaCoor(c).comprobarColor(this.color)) {
				coordenadasPosibles.add(c);
			}

		c = getCoordenadas().left();
		// left
		while (tablero.existeEmpty(c)) {
			coordenadasPosibles.add(c);

			c = c.left();
		}
		if (c.existe())
			if (!tablero.celdaCoor(c).comprobarColor(this.color)) {
				coordenadasPosibles.add(c);
			}

		c = getCoordenadas().right();

		// right

		while (tablero.existeEmpty(c)) {
			coordenadasPosibles.add(c);

			c = c.right();
		}

		if (c.existe())
			if (!tablero.celdaCoor(c).comprobarColor(this.color)) {
				coordenadasPosibles.add(c);
			}

		c = getCoordenadas().down();

		// down
		while (tablero.existeEmpty(c)) {
			coordenadasPosibles.add(c);

			c = c.down();

		}
		if (c.existe())
			if (!tablero.celdaCoor(c).comprobarColor(this.color)) {
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
