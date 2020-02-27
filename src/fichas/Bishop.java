package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class Bishop extends Ficha {
	protected ArrayList<Coordenadas> coordenadasPosibles = new ArrayList<Coordenadas>();
	private Color color;
	private Coordenadas coordenadas;
	
	public Bishop(Color color,Coordenadas coordenadas) {
		super();

		this.color=color;
		this.coordenadas=coordenadas;

	}
	
	public String toString() {
		
		if(this.color.equals(Color.white)) {
			
			return Ficha.Shape.white_bishop.toString();
		}else
			return Ficha.Shape.black_bishop.toString();
			
		
	}
public void calcularCoordenadas(Celda[][] t) {
		
		coordenadasPosibles.clear();
		
		//t[coordenadas.up().up().right().getYInt()][coordenadas.up().up().right().getXInt()].getFicha().getColor();		
		Coordenadas XY;;
		
		boolean bucle = true;
		
		XY = this.coordenadas;
	//	try {
		//up-right
		while(!t[coordenadas.up().right().getYInt()][coordenadas.up().right().getXInt()].comprobarColor(this.color) && coordenadas.up().right().existe()) {
			coordenadasPosibles.add(XY.up().right());
			if(!t[coordenadas.up().right().getYInt()][coordenadas.up().right().getXInt()].comprobarColor(this.color)) {
				bucle=false;
			}
			XY=XY.up().right();

		}
		
		
		XY = this.coordenadas;
		
			//up-left
			while(!t[coordenadas.up().left().getYInt()][coordenadas.up().left().getXInt()].comprobarColor(this.color) && coordenadas.up().down().existe()) {
				coordenadasPosibles.add(XY.up().left());
				if(!t[coordenadas.up().left().getYInt()][coordenadas.up().left().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.up().left();			
				}
			
		
		
		
		XY = this.coordenadas;
		
			
			//down-right
			while(!t[coordenadas.down().right().getYInt()][coordenadas.down().right().getXInt()].comprobarColor(this.color) && coordenadas.down().right().existe()) {
				coordenadasPosibles.add(XY.down().right());
				if(!t[XY.right().getYInt()][XY.right().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.down().right();
			}
		
		
		XY = this.coordenadas;
		
			
			//down-left
			while(!t[coordenadas.down().left().getYInt()][coordenadas.down().left().getXInt()].comprobarColor(this.color) && coordenadas.down().left().existe()) {
				coordenadasPosibles.add(XY.down().left());
				if(!t[XY.down().getYInt()][XY.down().getXInt()].comprobarColor(this.color)) {
					bucle=false;
				}
				XY=XY.down().left();
				
			}
	//	}catch (java.lang.NullPointerException | java.lang.ArrayIndexOutOfBoundsException exception) {}

		
	}
	
	


}

