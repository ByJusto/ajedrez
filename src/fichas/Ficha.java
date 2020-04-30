/*
 * @author	:	Gabriel Justo Ordoñez
 * @version	:	20.2.26
 */

package fichas;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Ficha  {

	public static enum Shape{
		//enum de las formas posibles que pueden tomar las fichas
		
		white_queen("\u2655",Color.white),white_king("\u2654",Color.white),white_bishop("\u2657",Color.white),
		white_rook("\u2656",Color.white),white_knight("\u2658",Color.white),white_pawn("\u2659",Color.white)
		,black_queen("\u265B",Color.black),black_king("\u265A",Color.black),black_bishop("\u265D",Color.black),
		black_rook("\u265C",Color.black),black_knight("\u265E",Color.black),black_pawn("\u265F",Color.black);
		public Color color;
		private String forma;
	
		Shape(String forma, Color color) {
			this.forma=forma;
			this.setColor(color);
		}
	
		 public String toString() {
			return forma;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}
		
	}
	public static enum Color{
		white,black;
	}
	protected Shape shape;
	protected Coordenadas coordenadas;
	protected Color color;
	protected ArrayList<Coordenadas> coordenadasPosibles = new ArrayList<Coordenadas>();
	protected Tablero tablero;

	public Color getColor() {
		return this.color;
	}
	public Shape getShape() {
		
		
		return shape;
	}
	
	public Coordenadas getCoor() {
		return coordenadas;
	}


	public void setCoordenadas(Coordenadas c) {
		
		this.coordenadas=c;
		
		
	}
	
	public Coordenadas getCoordenadas() {
		return coordenadas;
	}
	
	public void setCoor(Coordenadas coor) {
		this.coordenadas=coor;
	}

	

	public ArrayList<Coordenadas> getCoordenadasPosibles() {
		return coordenadasPosibles;
	}
	
	public abstract void printCoordenadasPosibles() ;

	public abstract void setCoordenadasPosibles(ArrayList<Coordenadas> coordenadasPosibles);

	
	
	
	
	public Ficha( Coordenadas coor, Color color) {
		this.coordenadas = coor;
		this.color = color;
	}

	//Redefinimos el equals para que compare las coordenadas segun las dos variables de estas
	public boolean equals(Object object){
        boolean sameSame = false;

        if (object != null && object instanceof Coordenadas)
        {
            sameSame = this.coordenadas.getCoorX() == ((Coordenadas) object).getCoorX() && this.coordenadas.getCoorY() == ((Coordenadas) object).getCoorY() ;
        }

        return sameSame;
    }
	

	public boolean contains(Object o) {
		Coordenadas a = (Coordenadas) o;

		
		for(Coordenadas b : coordenadasPosibles) {
			
			if (b.equals(a))
				return true;
			
		}
 
		return false;
	}
	
	public String toString() {
		return shape.toString();
		
		

	}
	
	public abstract void calcularCoordenadas();



	
	
	
	
}
