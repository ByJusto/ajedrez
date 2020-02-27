package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class Pawn extends Ficha{

	private Color color;
	private Coordenadas coordenadas;
	private boolean firstmove = true;
	private ArrayList<Coordenadas> coordenadasPosibles = new ArrayList<Coordenadas>();

	
	public Pawn(Color color,Coordenadas coordenadas) {
		super();

		this.color=color;
		this.coordenadas=coordenadas;

		
	}
	
	public void setFirstMove() {
		this.firstmove=false;
	}
	
	public boolean getFirstMove() {
		return firstmove;
	}
	
public void calcularCoordenadas(Celda[][] t) {
		
		coordenadasPosibles.clear();
		
		//t[coordenadas.up().up().right().getYInt()][coordenadas.up().up().right().getXInt()].getFicha().getColor();		
		//try {
		//up
			if(t[coordenadas.up().getYInt()][coordenadas.up().getXInt()].isEmpty() && coordenadas.up().existe()) {
				coordenadasPosibles.add(coordenadas.up());
			}
			
			//up-up
			if(t[coordenadas.up().up().getYInt()][coordenadas.up().up().getXInt()].isEmpty() && t[coordenadas.up().getYInt()][coordenadas.up().getXInt()].isEmpty() && this.firstmove) {
				coordenadasPosibles.add(coordenadas.up().up());
			}
	
			//up-right
			if(!t[coordenadas.up().right().getYInt()][coordenadas.up().right().getXInt()].comprobarColor(this.color) && coordenadas.up().right().existe() &&
					!t[coordenadas.up().right().getYInt()][coordenadas.up().right().getXInt()].isEmpty()) {
				coordenadasPosibles.add(coordenadas.up().right());
			}
			//up-left
			if(!t[coordenadas.up().left().getYInt()][coordenadas.up().left().getXInt()].comprobarColor(this.color) && coordenadas.up().down().existe() && 
					!t[coordenadas.up().down().getYInt()][coordenadas.up().down().getXInt()].isEmpty()) {
				coordenadasPosibles.add(coordenadas.up().left());
			}
		//}catch (java.lang.NullPointerException | java.lang.ArrayIndexOutOfBoundsException exception) {}

		
		
				
		
	}
	
	
	
	
	public String toString() {
		
		if(this.color.equals(Color.white)) {
			
			return Ficha.Shape.white_pawn.toString();
		}else
			return Ficha.Shape.black_pawn.toString();
			
		
	}
}
