package fichas;

public class Coordenadas {

	private char X;
	private int Y;
	

	public Coordenadas(char x,int y) {
		
		this.X=x;
		this.Y=y;
		
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

	
	public Coordenadas up() {
        return new Coordenadas(this.X ,this.Y-1 );
    }
    public Coordenadas down() {

        return new Coordenadas(this.X ,this.Y+1  );

    }
    public Coordenadas right() {

        return new Coordenadas((char) (this.X+1) ,this.Y );

    }

    public Coordenadas left() {

        return new Coordenadas((char) (this.X-1),this.Y);
    }

    public String toString() {
    	
    	return "("+X+","+Y+")";
    }
    
}
