package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class Queen extends Ficha{


	
	
	public Queen(Color color,Coordenadas coordenadas) {
		super(coordenadas, color);

		this.color=color;
		this.coordenadas=coordenadas;

		
	}
	
	public String toString() {
		
		if(this.color.equals(Color.white)) {
			
			return Ficha.Shape.white_queen.toString();
		}else
			return Ficha.Shape.black_queen.toString();
			
		
	}
public void calcularCoordenadas(Celda[][] t) {
		
		coordenadasPosibles.clear();
		
		//t[coordenadas.up().up().right().getYInt()][coordenadas.up().up().right().getXInt()].getFicha().getColor();		
		Coordenadas XY;;
		
		boolean bucle = true;
		
		XY = this.coordenadas;
		
	//	try {
		//up-right
		while(!t[XY.up().right().getYInt()][XY.up().right().getXInt()].comprobarColor(this.color) && XY.up().right().existe() && bucle) {
			coordenadasPosibles.add(XY.up().right());
			if(!t[XY.up().right().getYInt()][XY.up().right().getXInt()].comprobarColor(this.color)) {
				bucle=false;
			}
			XY=XY.up().right();

		}
		
		
		XY = this.coordenadas;
		
			//up-left
			while(!t[XY.up().left().getYInt()][XY.up().left().getXInt()].comprobarColor(this.color) && XY.up().down().existe() && bucle) {
				coordenadasPosibles.add(XY.up().left());
				if(!t[XY.up().left().getYInt()][XY.up().left().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.up().left();			
				}
			
		
		
		
		XY = this.coordenadas;
		
			
			//down-right
			while(!t[XY.down().right().getYInt()][XY.down().right().getXInt()].comprobarColor(this.color) && XY.down().right().existe() && bucle) {
				coordenadasPosibles.add(XY.down().right());
				if(!t[XY.right().getYInt()][XY.right().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.down().right();
			}
		
		
		XY = this.coordenadas;
		
			
			//down-left
			while(!t[XY.down().left().getYInt()][XY.down().left().getXInt()].comprobarColor(this.color) && XY.down().left().existe() && bucle) {
				coordenadasPosibles.add(XY.down().left());
				if(!t[XY.down().getYInt()][XY.down().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.down().left();
				
			}
			XY = this.coordenadas;
			
			//up
			while(!t[XY.up().getYInt()][XY.up().getXInt()].comprobarColor(this.color) && XY.up().existe() && bucle ) {
				coordenadasPosibles.add(XY.up());
				if(!t[XY.up().getYInt()][XY.up().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.up();

			}
			
			
			XY = this.coordenadas;
			
				//left
				while(!t[XY.left().getYInt()][XY.left().getXInt()].comprobarColor(this.color) && XY.left().existe() && bucle) {
					coordenadasPosibles.add(XY.left());
					if(!t[XY.left().getYInt()][XY.left().getXInt()].comprobarColor(this.color)) {
						bucle=false;
					}
					XY=XY.left();			
					}
				
			
			
			
			XY = this.coordenadas;
			
				
				//right
				while(!t[XY.right().getYInt()][XY.right().getXInt()].comprobarColor(this.color) && XY.right().existe() && bucle) {
					coordenadasPosibles.add(XY.right());
					if(!t[XY.right().getYInt()][XY.right().getXInt()].comprobarColor(this.color)) {
						bucle=false;
					}
					XY=XY.right();
				}
			
			
			XY = this.coordenadas;
			
				
				//down
				while(!t[XY.down().getYInt()][XY.down().getXInt()].comprobarColor(this.color) && XY.down().existe() && bucle) {
					coordenadasPosibles.add(XY.down());
					if(!t[XY.down().getYInt()][XY.down().getXInt()].comprobarColor(this.color)) {
						bucle=false;
					}
					XY=XY.down();
					
				}
	//	}catch (java.lang.NullPointerException | java.lang.ArrayIndexOutOfBoundsException exception) {}

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
