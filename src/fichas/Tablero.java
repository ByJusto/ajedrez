package fichas;

import java.util.ArrayList;

import fichas.Ficha.Color;

public class Tablero {

	protected Celda[][] tablero = new Celda[8][8];

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
		"\t"+" "+"\t"+"  A   B   C   D   E   F   G   H  "+"\t"+" "+"\n"+"\n"+"\n"+
		"\t"+" "+"╔═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╗"+"\t"+" "+"\n"+
		"\t"+" "+"║ ? │ ? │ ? │ ? │ ? │ ? │ ? │ ? │ ? │ ? │ ? │ ? ║"+"\t"+" "+"\n"+
		"\t"+" "+"╟───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
		"\t"+" "+"║ 1 │ 1 │ 2 │ 2 │ 2 │ 8 │ 1 │ 1 │ 2 │ 2 │ 2 │ 8 ║"+"\t"+" "+"\n"+
		"\t"+" "+"╚═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╝"+"\t"+" "+"\n";
	

		
	}
	
	private String printF(int a,int b) {
		
		return tablero[a][b].toString();
	}
	
	public void initialPos() {
		
		for(int i = 0; i<8;i++) {
			for(int a = 0; a<8;a++) {
				
				tablero[i][a] = new Celda(null);
				
			}
		}
		
		tablero[0][0] = new Celda(new Rook(Color.white,new Coordenadas('A',1)));
		tablero[0][1] = new Celda(new Knight(Color.white,new Coordenadas('B',1)));		
		tablero[0][2] = new Celda(new Bishop(Color.white,new Coordenadas('C',1)));		
		tablero[0][3] = new Celda(new Queen(Color.white,new Coordenadas('D',1)));		
		tablero[0][4] = new Celda(new King(Color.white,new Coordenadas('E',1)));		
		tablero[0][5] = new Celda(new Bishop(Color.white,new Coordenadas('F',1)));		
		tablero[0][6] = new Celda(new Knight(Color.white,new Coordenadas('G',1)));		
		tablero[0][7] = new Celda(new Rook(Color.white,new Coordenadas('H',1)));

		for(int p =0 ; p<8 ; p++) {
			int a = 'A' + p;
			tablero[1][p] = new Celda(new Pawn(Color.white,new Coordenadas((char)a,1)));

		}
		
		tablero[7][0] = new Celda(new Rook(Color.black,new Coordenadas('A',8)));
		tablero[3][1] = new Celda(new Knight(Color.black,new Coordenadas('B',4)));	
		tablero[7][2] = new Celda(new Bishop(Color.black,new Coordenadas('C',8)));		
		tablero[7][3] = new Celda(new Queen(Color.black,new Coordenadas('D',8)));		
		tablero[7][4] = new Celda(new King(Color.black,new Coordenadas('E',8)));		
		tablero[7][5] = new Celda(new Bishop(Color.black,new Coordenadas('F',8)));		
		tablero[7][6] = new Celda(new Knight(Color.black,new Coordenadas('G',8)));	
		tablero[7][7] = new Celda(new Rook(Color.black,new Coordenadas('H',8)));

		for(int p =0 ; p<8 ; p++) {
			int a = 'A' + p;
			tablero[6][p] = new Celda(new Pawn(Color.black,new Coordenadas((char)a,7)));

		}
		 
				calculoInicial();

		
		
		
	}
	public boolean moveFicha(char x1,int  y1,char x2,int y2) {
		
		
		int xo = (int) x1 - 'A';
		int xd = (int) x2 - 'A';
		int yd = y2 - 1;
		int yo = y1 -1;
		Coordenadas destino= new Coordenadas(x2, yd);
		printCoorPos(3,1);

		
		if(tablero[yo][xo].isEmpty()) {
			
			System.out.println("No hay ficha");
			return false;
			
		}else if(tablero[yo][xo].getFicha().getCoordenadasPosibles().contains(destino)) {
			
			tablero[yd][xd].colocarFicha(tablero[yo][xo].getFicha());
			tablero[yo][xo].deleteFicha();
			tablero[yd][xd].getFicha().setCoor(new Coordenadas((char)(xd +'A'),yd));
			System.out.println("Ficha movida a : " + tablero[yd][xd].getFicha().getCoor());
			
			return true;

			
		}
		System.out.println("Coordenada no contenida");

		return false;
			
		
		
		
		
	}
		
	public String printTableroa() {
		

				
		         
		         
		return	"\t"+" "+"\t"+"╔═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╗"+"\t"+" "+"\n"+
				"\t"+"1"+"\t"+"║   │   │   │   │   │   │   │   ║"+"\t"+"1"+"\n"+
				"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
				"\t"+"2"+"\t"+"║   │   │   │   │   │   │   │   ║"+"\t"+"2"+"\n"+
				"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
				"\t"+"3"+"\t"+"║   │   │   │   │   │   │   │   ║"+"\t"+"3"+"\n"+
				"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
				"\t"+"4"+"\t"+"║   │   │   │   │   │   │   │   ║"+"\t"+"4"+"\n"+
				"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
				"\t"+"5"+"\t"+"║   │   │   │   │   │   │   │   ║"+"\t"+"5"+"\n"+
				"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
				"\t"+"6"+"\t"+"║   │   │   │   │   │   │   │   ║"+"\t"+"6"+"\n"+
				"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
				"\t"+"7"+"\t"+"║   │   │   │   │   │   │   │   ║"+"\t"+"7"+"\n"+
				"\t"+" "+"\t"+"╟───┼───┼───┼───┼───┼───┼───┼───╢"+"\t"+" "+"\n"+
				"\t"+"8"+"\t"+"║   │   │   │   │   │   │   │   ║"+"\t"+"8"+"\n"+
				"\t"+" "+"\t"+"╚═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╝"+"\t"+" "+"\n";
			
		
		
	}
	
	public void printCoorPos(int a,int b) {
		
		System.out.println(tablero[a][b].getFicha().getCoordenadasPosibles().toString());
		
		
	}
	
	public void calculoInicial() {
		
		for(int i = 0;i<tablero.length;i++) {
			for(int a =0;a<tablero[0].length;a++) {
				System.out.println("A");
				if(!tablero[i][a].isEmpty())
					System.out.println("B");
					tablero[i][a].getFicha().calcularCoordenadas(this.tablero);
			}
			
			
		}
		
		
	}
	
}
