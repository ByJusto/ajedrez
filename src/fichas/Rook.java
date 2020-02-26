package fichas;

import java.util.ArrayList;

public class Rook extends Ficha{

	private Color color;
	private Coordenadas coordenadas;
	private ArrayList<Coordenadas> coordenadasPosibles = new ArrayList<Coordenadas>();
	
	public Rook(Color color,Coordenadas coordenadas) {
		super();

		this.color=color;	
		this.coordenadas=coordenadas;

		
	}
	
	public String toString() {
		
		if(this.color.equals(Color.white)) {
			
			return Ficha.Shape.white_rook.toString();
		}else
			return Ficha.Shape.black_rook.toString();
			
		
	}
	
	
	public boolean celdaPosible() {
		
		
		
	}
	
	
	

}
