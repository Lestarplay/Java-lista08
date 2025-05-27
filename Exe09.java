package lista08;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número para calcular o fatorial: ");
	        int numero = scanner.nextInt();
	        int fatorial = 1;
	        while (numero > 1) {
	            fatorial *= numero;
	            numero--;
	        }
	        System.out.println("Fatorial: " + fatorial);
	        scanner.close();

	}

}
