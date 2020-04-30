/*
 * @author	:	Gabriel Justo Ordoñez
 * @version	:	20.2.26
 */
package fichas;

import fichas.Ficha.Color;

public class Celda {

	//private String lado1,lado2,lado3,lado4;
	private Ficha ficha;
	
	public Celda(Ficha ficha) {

		this.ficha=ficha;
	}
	
	public void colocarFicha(Ficha ficha,Coordenadas coordenadas) {
		//colocamos la fficha y a demas a esa ficha le indicamos su nueva coordenada
		this.ficha=ficha;
		this.ficha.setCoor(coordenadas);
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
		//comprobacion si contiene ficha o esta vacia
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
		//Comprobamos si el color de la ficha contenida es el mismo que el introducido
		if(this.isEmpty())
			return false;
		if(this.ficha.getColor() == color)
			return true;
		
		return false;
			
		
		
	}
	
	
}
