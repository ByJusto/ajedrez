package fichas;

public class Test {

	public static void main(String[] args) {
		

		Tablero a = new Tablero();
		a.initialPos();
		System.out.println(a.printTablero());
		
		Coordenadas c= new Coordenadas('E',6);
        System.out.println(c.up());
        System.out.println(c.down());
        System.out.println(c.right());
        System.out.println(c.left());
		
	}
	
}
