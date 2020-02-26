package fichas;
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
		if(isEmpty(this.ficha))
			return " ";
		else
		return this.ficha.toString();
	}
	
	public boolean isEmpty(Ficha ficha) {
		if (this.ficha == null)
		return true;
		else
			return false;
	}
	
	public Ficha getFicha() {
		return this.ficha;
	}

}
