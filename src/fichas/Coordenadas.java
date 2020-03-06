package fichas;

public class Coordenadas {

	private char X;
	private int Y;

	public Coordenadas(char x, int y) {

		this.X = x;
		this.Y = y;

	}

	

	public int getXInt() {

		return this.X - 'A';

	}

	public int getYInt() {

		return Y - 1;

	}

	public char getCoorX() {
		return X;
	}
	
	public void setCoorX(char x) {
		this.X = x;
	}

	public int getCoorY() {
		return Y;
	}
	
	public void setCoorY(int y) {
		Y = y;
	}

	public Coordenadas up() {

			return new Coordenadas(this.X, this.Y - 1);
	}

	
	public boolean existe() {
		
		
			
			if(this.getXInt()>=8 || this.getYInt() >=8 || this.getXInt()<0 || this.getYInt() <0)
				return false;
			else
				return true;
		
	}
	
	
	public Coordenadas down() {
	
			return new Coordenadas(this.X, this.Y + 1);

	}

	
	public boolean equals(Object o) {
		
		Coordenadas a = (Coordenadas) o;
		
		if(this.X == a.X && this.Y == a.Y)
			return true;
		else
			return false;
		
	}
	

	
	public Coordenadas right() {


			return new Coordenadas((char) (this.X + 1), this.Y);

	}

	public Coordenadas left() {


			return new Coordenadas((char) (this.X - 1), this.Y);
	}

	public String toString() {

		return "(" + X + "," + Y + ")";
	}






}
