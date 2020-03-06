package fichas;

import java.util.Scanner;

import fichas.Ficha.Color;

public class Test {

	public static void main(String[] args) {

		String ans = "Y";
		Coordenadas co;
		Coordenadas cd;
		Scanner sc = new Scanner(System.in);
		Tablero a = new Tablero();
		boolean checkmate=false;
		String turno="";
		a.initialPos();

		System.out.println(a.printTablero());


		System.out.println("Jugador1(Blancas)");
		System.out.println(" ");
		System.out.println("Jugador2(Negras)");
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("Empieza jugando Blancas (Jugador1)");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		turno = "Jugador1";
		while(!checkmate) {
			
			a.calculoPos();
			System.out.println("Turno de " + turno);
			switch (turno) {
			
			case "Jugador1":
				
					//Creamos coordenada origen con restriccion del color
					co= crearCoordenadaOrigen(Color.white,a);
					
					a.printCoorPos(co);

					cd= crearCoordenadaDestino(co,a);
		
					System.out.println(a.printTablero());
					turno="Jugador2";
						
				
				
				break;
			case "Jugador2":
				
				//Creamos coordenada origen con restriccion del color

					co= crearCoordenadaOrigen(Color.black,a);
					
					a.printCoorPos(co);

				// creamos la coordenada Destino
					cd= crearCoordenadaDestino(co,a);
		
					System.out.println(a.printTablero());
					turno="Jugador1";
						
				
				
				break;
			
			}
			
			
		}
		
		

	}

	
	
	
	
	
	public static Color stringColor(String s) {
		
		if(s== Color.white.name())
			return Color.white;
		else
			return Color.black;
		
		
	}
	
	public static Coordenadas crearCoordenadaDestino(Coordenadas co,Tablero a) {
		
		Coordenadas cd;
		boolean keep = true;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("DESTINO  Introduce coordenada X");
			sc = new Scanner(System.in);
	
			char xd = sc.nextLine().toUpperCase().charAt(0);
			System.out.println("DESTINO  Introduce coordenada Y");
	
			int yd = sc.nextInt();
			
			cd= new Coordenadas(xd, yd);
	
			if (!a.moveFicha(co,cd)) {
				System.out.println("ERROR");
			}else {
					keep=false;
			}
		}while(keep);
		return cd;
	}
	
	public static Coordenadas crearCoordenadaOrigen(Color color,Tablero a) {
		Coordenadas co;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("ORIGEN  Introduce coordenada X");
			
			sc = new Scanner(System.in);
			char xo = sc.nextLine().toUpperCase().charAt(0);
			System.out.println("ORIGEN  Introduce coordenada Y");
	
			int yo = sc.nextInt();
			
			co = new Coordenadas(xo, yo);
			if(!mismoColor(co,color,a))
					System.out.println("Esa ficha no es tuya o no existe");
			else
				return co;
		}while(!mismoColor(co,color,a));
		return co;
		
		
	}
	
	public static boolean mismoColor(Coordenadas c, Color color,Tablero a) {
		
		if(!a.celdaCoor(c).isEmpty())
			if(a.celdaCoor(c).getFicha().getColor() == color)
				return true;
			else 
				return false;
		else
			return false;
		
		
	}
	
	
	


}
