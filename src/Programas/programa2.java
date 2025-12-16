package Programas;
import java.util.Scanner;

public class programa2 {
	 public static void funcion() {
	        Scanner sc = new Scanner(System.in);
	        int min, max,tercero;

	        do {
	            System.out.print("Ingrese el valor minimo: ");
	            min = sc.nextInt();

	            System.out.print("Ingrese el valor maximo: ");
	            max = sc.nextInt();

	        } while (min == max || min > max);
	        System.out.println("Ingrese el tercer número");
	        tercero = sc.nextInt();

	        int suma = min;

	        while (suma <= max) {
	            System.out.println((suma = suma + 7));

	        }
	        if (tercero >= min && tercero <= max) {
	            System.out.println("Tercero se encuentra entre el min y el max");
	        }
	    }

	    public static void main(String[] args) {
	        funcion();
	    }
}