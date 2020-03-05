package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class Pawn extends Ficha{


	private boolean firstmove = true;

	
	public Pawn(Color color,Coordenadas coordenadas) {
		super(coordenadas, color);

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
		
		if(this.color==Color.white)
			calcularBlanco(t);
		else
			calcularNegro(t);	
		
	}
public void calcularNegro(Celda[][] t) {
		
		coordenadasPosibles.clear();

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
			if(!t[coordenadas.up().left().getYInt()][coordenadas.up().left().getXInt()].comprobarColor(this.color) && coordenadas.up().left().existe() && 
					!t[coordenadas.up().left().getYInt()][coordenadas.up().left().getXInt()].isEmpty()) {
				coordenadasPosibles.add(coordenadas.up().left());
			}
			
			
			
			
		

		
		
				
		
	}


	
public void calcularBlanco(Celda[][] t) {
		
	Coordenadas coordenada;
		
		coordenada = coordenadas.down();
		if(t[coordenada.getYInt()][coordenada.getXInt()].isEmpty() && coordenada.existe()) {
			this.coordenadasPosibles.add(coordenada);
		}
		
		//up-up
		coordenada = coordenadas.down().down();
		if(t[coordenada.getYInt()][coordenada.getXInt()].isEmpty() && t[coordenada.getYInt()][coordenada.getXInt()].isEmpty() && this.firstmove) {
			this.coordenadasPosibles.add(coordenada);
		}

		//up-right
		coordenada = coordenadas.down().right();
		if(!t[coordenada.getYInt()][coordenada.getXInt()].comprobarColor(this.color) && coordenada.existe() &&
				!t[coordenada.getYInt()][coordenada.getXInt()].isEmpty()) {
			this.coordenadasPosibles.add(coordenada);
		}
		//up-left
		coordenada = coordenadas.down().left();
		if(!t[coordenada.getYInt()][coordenada.getXInt()].comprobarColor(this.color) && coordenada.existe() && 
				!t[coordenada.getYInt()][coordenada.getXInt()].isEmpty()) {
			this.coordenadasPosibles.add(coordenada);
		}
		
		
	}
	
	
	
	
	public String toString() {
		
		if(this.color.equals(Color.white)) {
			
			return Ficha.Shape.white_pawn.toString();
		}else
			return Ficha.Shape.black_pawn.toString();
			
		
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
