package fichas;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Tablero a = new Tablero();
		a.initialPos();
		System.out.println(a.printTablero());
		
		Coordenadas c= new Coordenadas('E',6);
		
		System.out.println("ORIGEN  Introduce coordenada X");
		
		char xo =  sc.nextLine().charAt(0);
		System.out.println("ORIGEN  Introduce coordenada Y");
		
		int yo = sc.nextInt();
		
		System.out.println("DESTINO  Introduce coordenada X");
		sc = new Scanner(System.in);
		
		char xd =  sc.nextLine().charAt(0);
		System.out.println("DESTINO  Introduce coordenada Y");
		
		int yd = sc.nextInt();
        
        if(!a.moveFicha(xo,yo,xd,yd))
        	System.out.println("ERROR");
        
        
        
		System.out.println(a.printTablero());


        
        
		
	}
	
}
