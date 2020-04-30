/*
 * @author	:	Gabriel Justo Ordoñez
 * @version	:	20.2.26
 */
package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;
import fichas.Ficha.Shape;

public class Tablero {

	protected Celda[][] tablero = new Celda[8][8];
	protected int[] nfichas = new int[12];
//	private int wknights=2;
//	private int wrooks=2;
//	private int wbishops=2;
//	private int wqueen=1;
//	private int wking=1;
//	private int wpawns=8;
//	private int bknights=2;
//	private int brooks=2;
//	private int bbishops=2;
//	private int bqueen=1;
//	private int bking=1;
//	private int bpawns=8;
	protected Coordenadas wkingpos;
	protected Coordenadas bkingpos;
	public Tablero() {
		



				
	}
	
	public Celda[][] celdasTablero(){
		return tablero;
		
	}
	
	public String printTablero() {
		

		return	"\t"+" "+"\t"+"╔═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╗"+"\t"+" "+"\n"+
		
		"\t"+"1"+"\t"+"║ "+printF(0,0)+" │ "+printF(0,1)+" │ "+printF(0,2)+" │ "+printF(0,3)+" │ "+printF(0,4)+" │ "+printF(0,5)+" │ "+printF(0,6)+" │ "+printF(0,7)+" ║"+"\t"+"1"+"\n"+
		
		"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
		
		"\t"+"2"+"\t"+"║ "+printF(1,0)+" │ "+printF(1,1)+" │ "+printF(1,2)+" │ "+printF(1,3)+" │ "+printF(1,4)+" │ "+printF(1,5)+" │ "+printF(1,6)+" │ "+printF(1,7)+" ║"+"\t"+"2"+"\n"+
		
		"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
		
		"\t"+"3"+"\t"+"║ "+printF(2,0)+" │ "+printF(2,1)+" │ "+printF(2,2)+" │ "+printF(2,3)+" │ "+printF(2,4)+" │ "+printF(2,5)+" │ "+printF(2,6)+" │ "+printF(2,7)+" ║"+"\t"+"3"+"\n"+
		
		"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
		
		"\t"+"4"+"\t"+"║ "+printF(3,0)+" │ "+printF(3,1)+" │ "+printF(3,2)+" │ "+printF(3,3)+" │ "+printF(3,4)+" │ "+printF(3,5)+" │ "+printF(3,6)+" │ "+printF(3,7)+" ║"+"\t"+"4"+"\n"+
		
		"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
		
		"\t"+"5"+"\t"+"║ "+printF(4,0)+" │ "+printF(4,1)+" │ "+printF(4,2)+" │ "+printF(4,3)+" │ "+printF(4,4)+" │ "+printF(4,5)+" │ "+printF(4,6)+" │ "+printF(4,7)+" ║"+"\t"+"5"+"\n"+
		
		"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
			
			"\t"+"6"+"\t"+"║ "+printF(5,0)+" │ "+printF(5,1)+" │ "+printF(5,2)+" │ "+printF(5,3)+" │ "+printF(5,4)+" │ "+printF(5,5)+" │ "+printF(5,6)+" │ "+printF(5,7)+" ║"+"\t"+"6"+"\n"+
			
		"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
		
		"\t"+"7"+"\t"+"║ "+printF(6,0)+" │ "+printF(6,1)+" │ "+printF(6,2)+" │ "+printF(6,3)+" │ "+printF(6,4)+" │ "+printF(6,5)+" │ "+printF(6,6)+" │ "+printF(6,7)+" ║"+"\t"+"7"+"\n"+
		
		"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
		
		"\t"+"8"+"\t"+"║ "+printF(7,0)+" │ "+printF(7,1)+" │ "+printF(7,2)+" │ "+printF(7,3)+" │ "+printF(7,4)+" │ "+printF(7,5)+" │ "+printF(7,6)+" │ "+printF(7,7)+" ║"+"\t"+"8"+"\n"+
		"\t"+" "+"\t"+"╚═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╝"+"\t"+" "+"\n" +
		"\t"+" "+"\t"+"  A   B   C   D   E   F   G   H  "+"\t"+" "+"\n"+"\n"+"\n";
	

		
	}
	
	private String printF(int a,int b) {
		
		return tablero[a][b].toString();
	}
	
	public void initialPos() {
		
		//inicializamos las celdas del tablero para que no nos de pointernullexception
		for(int i = 0; i<8;i++) {
			for(int a = 0; a<8;a++) {
				
				tablero[i][a] = new Celda(null);
				
			}
		}
		//colocamos las fichas del tablero
		tablero[0][0] = new Celda(new Rook(Color.white,new Coordenadas('A',1),this));
		tablero[0][1] = new Celda(new Knight(Color.white,new Coordenadas('B',1),this));		
		tablero[0][2] = new Celda(new Bishop(Color.white,new Coordenadas('C',1),this));		
		tablero[0][3] = new Celda(new Queen(Color.white,new Coordenadas('D',1),this));		
		tablero[0][4] = new Celda(new King(Color.white,new Coordenadas('E',1),this));		
		tablero[0][5] = new Celda(new Bishop(Color.white,new Coordenadas('F',1),this));		
		tablero[0][6] = new Celda(new Knight(Color.white,new Coordenadas('G',1),this));		
		tablero[0][7] = new Celda(new Rook(Color.white,new Coordenadas('H',1),this));

		for(int p =0 ; p<8 ; p++) {
			int a = 'A' + p;
			tablero[1][p] = new Celda(new Pawn(Color.white,new Coordenadas((char)a,2),this));

		}
		
		tablero[7][0] = new Celda(new Rook(Color.black,new Coordenadas('A',8),this));
		tablero[7][1] = new Celda(new Knight(Color.black,new Coordenadas('B',8),this));	
		tablero[7][2] = new Celda(new Bishop(Color.black,new Coordenadas('C',8),this));		
		tablero[7][3] = new Celda(new Queen(Color.black,new Coordenadas('D',8),this));		
		tablero[7][4] = new Celda(new King(Color.black,new Coordenadas('E',8),this));		
		tablero[7][5] = new Celda(new Bishop(Color.black,new Coordenadas('F',8),this));		
		tablero[7][6] = new Celda(new Knight(Color.black,new Coordenadas('G',8),this));	
		tablero[7][7] = new Celda(new Rook(Color.black,new Coordenadas('H',8),this));

		for(int p =0 ; p<8 ; p++) {
			int a = 'A' + p;
			tablero[6][p] = new Celda(new Pawn(Color.black,new Coordenadas((char)a,7),this));

		}
		 //calculamos las posiciones disponibles
				calculoPos();

		
		
		
	}
	public boolean moveFicha(Coordenadas o, Coordenadas d) {
		
		//Movimiento de ficha, introduciendo coordenda origen y coordenada destino
		
		if(celdaCoor(o) .isEmpty()) {
			//comprobamos que la coordenada origen no esta vacia
			System.out.println("No hay ficha");
			return false;
			
		}else if(celdaCoor(o).getFicha().getCoordenadasPosibles().contains(d)) {
			//comprobamos si la posicion destino esta entre el "pool" de posiciones validas de la ficha correspondiente
			if(win(d))
				System.out.println("Has ganado");
			celdaCoor(d).colocarFicha(celdaCoor(o).getFicha(),d);
			// se coloca la ficha en la celda destino
			celdaCoor(o).deleteFicha();
			//se elimina la ficha de la celda origen
			System.out.println("Ficha movida a : " + celdaCoor(d).getFicha().getCoor().toString());
			if(comprobarTrans(d))
				celdaCoor(d).colocarFicha(new Queen(celdaCoor(d).getFicha().getColor(),d,this) ,d);
			
			calculoPos();
			//devolvemos verdadero si se ha completado con exito.
			return true;

			
		}

		return false;
			

		
		
		
		
	}
	
	
	
	public Celda celdaCoor(Coordenadas c) {
		
		if(c.existe())
			return tablero[c.getYInt()][c.getXInt()];
		else
			return null;
		
		
	}
	
	
	public void printCoorPos(Coordenadas c) {
		
		
		if(celdaCoor(c).isEmpty()) {
		
			System.out.println("No hay ficha");
			
		}else{
			celdaCoor(c).getFicha().printCoordenadasPosibles();
			
		}
		
		
}
	
	public void calculoPos() {
		
		for(int i = 0;i<8;i++) {
			for(int a =0;a<8;a++) {
				if(!tablero[i][a].isEmpty()) {
					tablero[i][a].getFicha().calcularCoordenadas();
				
			
				}
			}
			
			
		}
		
		
	}
	
	
	public void restarContador(Coordenadas c) {
	/*	
	
		if(!celdaCoor(c).isEmpty())			
				switch(celdaCoor(c).getFicha().toString()) {
				
				case Shape.black_pawn.toString():
					bpawns--;
					break;
				case Shape.white_pawn.toString():
					wpawns--;
					break;
				case Shape.white_rook.toString():
					wrooks--;
					break;
				case Shape.black_rook.toString():
					brooks--;
					break;
				case Shape.white_knight.toString():
					wknights--;
					break;
				case Shape.black_knight.toString():
					bknights--;
				case Shape.white_bishop.toString():
					wbishops--;
					break;
				case Shape.black_bishop.toString():
					bbishops--;
					break;
				case Shape.white_queen.toString():
					wqueen--;
					break;
				case Shape.black_queen.toString():
					bqueen--;
					break;
				case Shape.white_king.toString():
					wking--;
					break;
				case Shape.black_king.toString():
					bking--;
					break;
				default:
					break;
				}
			
			
		
			
		
		
		
	}
	*/
	}
	
	public boolean existeEmpty(Coordenadas c) {
		
		if(c.existe()) {
			
			if(celdaCoor(c).isEmpty()) {
				
				return true;
				
			}
			return false;
			
		}else
			return false;
		
		
		
		
	}
	public boolean existeColor(Coordenadas c,Color col) {
		
		if(c.existe()) {
			
			if(!celdaCoor(c).comprobarColor(col)) {
				return true;
			}

			return false;
		}
		return false;
		
		
		
	}
	
	public boolean comprobarJaque() {
		
		for(int i = 0;i<8;i++) {
			for(int a =0;a<8;a++) {
				if(!tablero[i][a].isEmpty()) {
					if(tablero[i][a].getFicha().getCoordenadasPosibles().contains(bkingpos)||tablero[i][a].getFicha().getCoordenadasPosibles().contains(wkingpos)) {
						return true;
					}
				
			
				}
			}
			
			
		}
		return false;
		
	}
	
	public boolean win(Coordenadas c) {
		//si la celda destino es la misma que la del rey enemigo la partida se acaba;
		if(!celdaCoor(c).isEmpty())
			if(celdaCoor(c).getFicha().toString()== Ficha.Shape.white_king.toString()||celdaCoor(c).getFicha().toString()== Ficha.Shape.black_king.toString())
				return true;
			else
			
			return false;
		return false;
	}
	
	public boolean comprobarTrans(Coordenadas c) {
		//comprobamos si la ficha de la coordenada es un peon y si esta en el extremo contrario del tablero
		if(c.getYInt()==0 || c.getYInt()==7)
		    if(celdaCoor(c).getFicha().toString()== Ficha.Shape.white_pawn.toString()|| celdaCoor(c).getFicha().toString()==Ficha.Shape.black_pawn.toString())
		    	return true;
		    else
		    	return false;
		else
			return false;
		
		
	}
	
}
