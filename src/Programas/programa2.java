package Programas;
import java.util.Scanner;

public class programa2 {
	public class Enteros {
	    public static void funcion() {
	        Scanner sc = new Scanner(System.in);
	        int min, max;

	        do {
	            System.out.print("Ingrese el valor minimo: ");
	            min = sc.nextInt();

	            System.out.print("Ingrese el valor maximo: ");
	            max = sc.nextInt();

	        } while (min == max || min > max);

	        int suma = min;

	        while (suma <= max) {
	            System.out.println((suma = suma + 7));
	        }
	    }

	    public static void main(String[] args) {
	        funcion();
	    }
}
}