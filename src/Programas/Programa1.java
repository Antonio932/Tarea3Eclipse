package Programas;

public class Programa1 {
		public static int aleatorio(){
	        return (int)(Math.random()*10)+1;
	    }

	    public static void main(String[] args) {
	        for (int i = 1; i <= 20; i++) {
	            System.out.println(aleatorio());
	        }
	    }
}
