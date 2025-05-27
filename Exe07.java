package lista08;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int secreto = (int) (Math.random() * 10 + 1);
        int chute = 0;
        while (chute != secreto) {
            System.out.print("Adivinhe o número entre 1 e 10: ");
            chute = scanner.nextInt();
            if (chute != secreto) {
                System.out.println("Tente novamente!");
            }
        }
        System.out.println("Parabéns! Você acertou!");
        scanner.close();

	}

}
