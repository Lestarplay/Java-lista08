package lista08;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int soma = 0;
        while (true) {
            System.out.print("Digite um número positivo (negativo para sair): ");
            int numero = sc.nextInt();
            if (numero < 0) break;
            soma += numero;
        }
        System.out.println("Soma total: " + soma);
        sc.close();

	}

}
