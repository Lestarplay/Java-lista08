package lista08;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        final String senhaCorreta = "1234";
	        String senha;
	        do {
	            System.out.print("Digite a senha: ");
	            senha = scanner.nextLine();
	        } while (!senha.equals(senhaCorreta));

	        System.out.println("Acesso permitido.");
	        scanner.close();

	}

}
