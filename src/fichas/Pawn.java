package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class Pawn extends Ficha{


	private boolean firstmove = true;

	
	public Pawn(Color color,Coordenadas coordenadas,Tablero t) {
		super(coordenadas, color);

		this.color=color;
		this.coordenadas=coordenadas;
		this.tablero=t;


		
	}
	
	public void setFirstMove() {
		this.firstmove=false;
	}
	
	public boolean getFirstMove() {
		return firstmove;
	}
	
public void calcularCoordenadas() {
		
		if(this.color==Color.black)
			calcularNegro();	

		else
		calcularBlanco();

	}
public void calcularNegro() {
		
		coordenadasPosibles.clear();

		Coordenadas coordenada;
		
		//up
			coordenada = getCoordenadas().up();
			if(tablero.existeEmpty(coordenada)) {
				coordenadasPosibles.add(coordenada);
				coordenada=getCoordenadas().up().up();
				if(tablero.celdaCoor(coordenada).isEmpty() && this.coordenadas.getYInt() ==6) {
					
					this.coordenadasPosibles.add(coordenada);
					
				}
				
			}
			
			//up-right
			
			coordenada = getCoordenadas().up().right();
			if(coordenada.existe())
				if(!tablero.celdaCoor(coordenada).comprobarColor(this.color) && 
						!tablero.celdaCoor(coordenada).isEmpty()) {
					this.coordenadasPosibles.add(coordenada);
				}
			//up-left
			coordenada = getCoordenadas().up().left();
			if(coordenada.existe())
				if(!tablero.celdaCoor(coordenada).comprobarColor(this.color) && 
						!tablero.celdaCoor(coordenada).isEmpty()) {
					this.coordenadasPosibles.add(coordenada);
				}
			
			
			
			
		

		
		
				
		
	}


	
public void calcularBlanco() {
		
	coordenadasPosibles.clear();

	Coordenadas coordenada;
		//down
		coordenada = getCoordenadas().down();
		if(tablero.existeEmpty(coordenada)) {
			coordenadasPosibles.add(coordenada);
			//down-down
			coordenada=getCoordenadas().down().down();
			if(tablero.celdaCoor(coordenada).isEmpty() && this.coordenadas.getYInt() ==1) {
				this.coordenadasPosibles.add(coordenada);
				
			}
		}
		
		

		//down-right
		coordenada = getCoordenadas().down().right();
		if(coordenada.existe())
			if(!tablero.celdaCoor(coordenada).comprobarColor(this.color) &&
					!tablero.celdaCoor(coordenada).isEmpty()) {
				this.coordenadasPosibles.add(coordenada);
			}
		//down-left
		coordenada = getCoordenadas().down().left();
		if(coordenada.existe())
			if(!tablero.celdaCoor(coordenada).comprobarColor(this.color) && 
					!tablero.celdaCoor(coordenada).isEmpty()) {
				this.coordenadasPosibles.add(coordenada);
			}
		
		
	}
	
	
	
	
	public String toString() {
		
		if(this.color.equals(Color.white)) {
			
			return Ficha.Shape.white_pawn.toString();
		}else
			return Ficha.Shape.black_pawn.toString();
			
		
	}
	public void setCoordenadasPosibles(ArrayList<Coordenadas> coordenadasPosibles) {
		this.coordenadasPosibles = coordenadasPosibles;
	}
	public void printCoordenadasPosibles() {
		
		System.out.println(this.coordenadasPosibles);
		
	}








}
