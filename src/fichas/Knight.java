package fichas;

import fichas.Ficha.Color;

public class Knight extends Ficha{


	private Color color;
	private Coordenadas coordenadas;
	
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
	
}
