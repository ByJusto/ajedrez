package fichas;

import fichas.Ficha.Color;

public class Pawn extends Ficha{

	private Color color;
	private Coordenadas coordenadas;
	
	public Pawn(Color color,Coordenadas coordenadas) {
		super();

		this.color=color;
		this.coordenadas=coordenadas;

		
	}
	
	public String toString() {
		
		if(this.color.equals(Color.white)) {
			
			return Ficha.Shape.white_pawn.toString();
		}else
			return Ficha.Shape.black_pawn.toString();
			
		
	}
}
