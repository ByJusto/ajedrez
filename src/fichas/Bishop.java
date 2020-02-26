package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class Bishop extends Ficha {
	private ArrayList<Coordenadas> coordPos = new ArrayList<Coordenadas>();
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
	
	public void setCoordenadasPos() {
		int x = 'A'- coordenadas.getCoorX();
		int y = coordenadas.getCoorY() -1;
		do {
			
			x++;
			y++;
			coordPos.add(new Coordenadas((char)('A'+x),y));
		}while(x!=7 || y!=7);
		do {
			
			x++;
			y--;
			coordPos.add(new Coordenadas((char)('A'+x),y));
		}while(x!=7 || y!=0);
		do {
			
			x--;
			y++;
			coordPos.add(new Coordenadas((char)('A'+x),y));
		}while(x!=0 || y!=7);
		do {
			
			x--;
			y--;
			coordPos.add(new Coordenadas((char)('A'+x),y));
		}while(x!=0 || y!=0);
	}

	public void printCoordPos() {
		setCoordenadasPos();
		System.out.println(coordPos);
		
	}
}
