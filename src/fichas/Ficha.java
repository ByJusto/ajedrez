package fichas;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Ficha  {

	public static enum Shape{
		white_queen("Q",Color.white),white_king("K",Color.white),white_bishop("B",Color.white),
		white_rook("T",Color.white),white_knight("C",Color.white),white_pawn("P",Color.white)
		,black_queen("Q",Color.black),black_king("K",Color.black),black_bishop("B",Color.black),
		black_rook("T",Color.black),black_knight("C",Color.black),black_pawn("P",Color.black);
		/*white_queen("\u2655",Color.white),white_king("\2654",Color.white),white_bishop("\2657",Color.white),
		white_rook("\2656",Color.white),white_knight("\2658",Color.white),white_pawn("\2659",Color.white)
		,black_queen("\u265B",Color.black),black_king("\u265A",Color.black),black_bishop("\265D",Color.black),
		black_rook("\u265C",Color.black),black_knight("\265E",Color.black),black_pawn("\u265F",Color.black);*/
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
