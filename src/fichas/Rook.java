package fichas;

import java.util.ArrayList;

public class Rook extends Ficha{

	protected Color color;
	protected Coordenadas coordenadas;
	protected ArrayList<Coordenadas> coordenadasPosibles = new ArrayList<Coordenadas>();
	
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
	
public void calcularCoordenadas(Celda[][] t) {
		
		coordenadasPosibles.clear();
		
		//t[coordenadas.up().up().right().getYInt()][coordenadas.up().up().right().getXInt()].getFicha().getColor();		
		Coordenadas XY;;
		
		boolean bucle = true;
		XY = this.coordenadas;
		
		//up
	//	try {
		while(!t[XY.up().getYInt()][XY.up().getXInt()].comprobarColor(this.color) && XY.up().existe() && bucle) {
			coordenadasPosibles.add(XY.up());
			if(!t[XY.up().getYInt()][XY.up().getXInt()].getFicha().getColor().equals(this.color)) {
				bucle=false;
			}
			XY=XY.up();

		}
		
		
		
		XY = this.coordenadas;
		
			//left
			while(!t[XY.left().getYInt()][XY.left().getXInt()].comprobarColor(this.color) && XY.left().existe()) {
				coordenadasPosibles.add(XY.left());
				if(!t[XY.left().getYInt()][XY.left().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.left();			
				}
			
		
		
		
		XY = this.coordenadas;
		
			
			//right
			while(!t[XY.right().getYInt()][XY.right().getXInt()].comprobarColor(this.color) && XY.right().existe()) {
				coordenadasPosibles.add(XY.right());
				if(!t[XY.right().getYInt()][XY.right().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.right();
			}
		
		
		XY = this.coordenadas;
		
			
			//down
			while(!t[XY.down().getYInt()][XY.down().getXInt()].comprobarColor(this.color) && XY.down().existe()) {
				coordenadasPosibles.add(XY.down());
				if(!t[XY.down().getYInt()][XY.down().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.down();
				
			}
		//}catch (java.lang.NullPointerException | java.lang.ArrayIndexOutOfBoundsException exception) {}

		
	}
	

}

