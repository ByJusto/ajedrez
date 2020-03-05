package fichas;

import java.util.ArrayList;

public class Rook extends Ficha{

	
	
	public Rook(Color color,Coordenadas coordenadas) {
		super(coordenadas, color);

		this.color=color;	
		this.coordenadas=coordenadas;

		
	}
	
	public String toString() {
		
		if(this.color.equals(Color.white)) {
			
			return Ficha.Shape.white_rook.toString();
		}else
			return Ficha.Shape.black_rook.toString();
			
		
	}
	
public void calcularCoordenadas(Celda[][] t) {
		
		coordenadasPosibles.clear();
		
		//t[coordenadas.up().up().right().getYInt()][coordenadas.up().up().right().getXInt()].getFicha().getColor();		
		Coordenadas XY;;
		
		boolean bucle = true;
		XY = this.coordenadas;
		
		//up
	//	try {
		while(!t[XY.up().getYInt()][XY.up().getXInt()].comprobarColor(this.color) && XY.up().existe() && bucle) {
			if(!t[XY.up().getYInt()][XY.up().getXInt()].comprobarColor(this.color)) {
				bucle=false;
			}
			coordenadasPosibles.add(XY.up());
			System.out.println("Coordenada Añadida ROOK");

			
			XY=XY.up();

		}
		
		
		
		XY = this.coordenadas;
		
			//left
			while(!t[XY.left().getYInt()][XY.left().getXInt()].comprobarColor(this.color) && XY.left().existe() && bucle) {
				coordenadasPosibles.add(XY.left());
				System.out.println("Coordenada Añadida ROOK");
				if(!t[XY.left().getYInt()][XY.left().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.left();			
				}
			
		
		
		
		XY = this.coordenadas;
		
			
			//right
			while(!t[XY.right().getYInt()][XY.right().getXInt()].comprobarColor(this.color) && XY.right().existe() && bucle) {
				coordenadasPosibles.add(XY.right());
				System.out.println("Coordenada Añadida ROOK");

				if(!t[XY.right().getYInt()][XY.right().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.right();
			}
		
		
		XY = this.coordenadas;
		
			
			//down
			while(!t[XY.down().getYInt()][XY.down().getXInt()].comprobarColor(this.color) && XY.down().existe() && bucle) {
				coordenadasPosibles.add(XY.down());
				System.out.println("Coordenada Añadida ROOK");

				if(!t[XY.down().getYInt()][XY.down().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.down();
				
			}
		//}catch (java.lang.NullPointerException | java.lang.ArrayIndexOutOfBoundsException exception) {}

		
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

