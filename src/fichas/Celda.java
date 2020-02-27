package fichas;

import fichas.Ficha.Color;

public class Celda {

	//private String lado1,lado2,lado3,lado4;
	private Ficha ficha;
	
	public Celda(Ficha ficha) {

		this.ficha=ficha;
	}
	
	public void colocarFicha(Ficha ficha) {
		
		this.ficha=ficha;
	}
	
	public Celda() {
		
	}
	
	public String toString() {
		if(this.isEmpty())
			return " ";
		else
		return this.ficha.toString();
	}
	
	public boolean isEmpty() {
		if (this.ficha == null)
		return true;
		else
			return false;
	}
	
	public Ficha getFicha() {
		return this.ficha;
	}
	
	public void deleteFicha() {
		
		this.ficha = null;
		
	}

	public boolean comprobarColor(Color color) {
		
		if(this.isEmpty())
			return false;
		if(this.ficha.getColor() == color)
			return true;
		
		return false;
			
		
		
	}
	
	
}
