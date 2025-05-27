package lista08;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase();
        int i = 0, vogais = 0;
        while (i < palavra.length()) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            }
            i++;
        }
        System.out.println("Quantidade de vogais: " + vogais);
        scanner.close();


	}

}
