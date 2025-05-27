package lista08;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int soma = 0, count = 0;
	        while (true) {
	            System.out.print("Digite uma nota (0 a 10): ");
	            int nota = scanner.nextInt();
	            if (nota < 0 || nota > 10) break;
	            soma += nota;
	            count++;
	        }
	        if (count > 0) {
	            System.out.println("Média: " + (soma / (double) count));
	        } else {
	            System.out.println("Nenhuma nota válida inserida.");
	        }
	        scanner.close();

	}

}
