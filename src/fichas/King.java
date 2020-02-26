package fichas;

import fichas.Ficha.Color;

public class King extends Ficha {

	private Color color;
	private Coordenadas coordenadas;

	public King(Color color,Coordenadas coordenadas) {
		super();
		this.color = color;
		this.coordenadas=coordenadas;

	}
		

	public String toString() {

		if (this.color.equals(Color.white)) {

			return Ficha.Shape.white_king.toString();
		} else
			return Ficha.Shape.black_king.toString();

	}
}
