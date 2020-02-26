package fichas;

public class Ficha {

	public static enum Shape{
		white_queen("Q",Color.white),white_king("K",Color.white),white_bishop("B",Color.white),
		white_rook("T",Color.white),white_knight("C",Color.white),white_pawn("P",Color.white)
		,black_queen("Q",Color.black),black_king("K",Color.black),black_bishop("B",Color.black),
		black_rook("T",Color.black),black_knight("C",Color.black),black_pawn("P",Color.black);
		/*white_queen("\u2655",Color.white),white_king("\2654",Color.white),white_bishop("\2657",Color.white),
		white_rook("\2656",Color.white),white_knight("\2658",Color.white),white_pawn("\2659",Color.white)
		,black_queen("\u265B",Color.black),black_king("\u265A",Color.black),black_bishop("\265D",Color.black),
		black_rook("\u265C",Color.black),black_knight("\265E",Color.black),black_pawn("\u265F",Color.black);*/
		private Color color;
		private String forma;
	
		Shape(String forma, Color color) {
			this.forma=forma;
			this.color=color;
		}
	
		 public String toString() {
			return forma;
		}
		
	}
	public static enum Color{
		white,black;
	}
	private Shape shape;
	private Coordenadas coor;

	public Ficha(){
		
		
	}

	
	public String toString() {
		return shape.toString();
	}



	
}
