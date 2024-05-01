package contabanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		ContaCliente cliente = new ContaCliente();

		try {

			System.out.println("############### DADOS BANCÁRIA ###############");
			System.out.println();	
			System.out.print("Informe o número da sua agência bancária: ");		
			cliente.setNumeroAgencia(input.next());
			
			System.out.print("Informe o número da sua conta bancária: ");		
			cliente.setNumeroConta(input.nextInt());
			
			System.out.print("Informe o seu nome: ");		
			cliente.setNomeCliente(input.next());
			
			System.out.print("Informe o seu saldo bancário: ");		
			cliente.setSaldo(input.nextDouble());
			System.out.println();	

			System.out.println("############### RESUMO BANCÁRIA ###############");
			System.out.println();	
			System.out.println(cliente.toString());
			System.out.println();	
			System.out.println("################################################");
		} catch (Exception e) {
			System.out.println();
			System.out.println("################################################");
			System.out.println("Ocorreu uma falha no sistema.");
			System.out.println("################################################");
		}
		

	}

}
