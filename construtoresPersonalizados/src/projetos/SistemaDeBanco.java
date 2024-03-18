package projetos;

import java.util.Locale;
import java.util.Scanner;

import entitis.BancoOOP;

public class SistemaDeBanco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BancoOOP conta;

		System.out.print("Digite o numero da conta: ");
		int numberAccount = sc.nextInt();
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Você quer fazer um deposito incial (s/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Digite o valor do deposito: ");
			double depositoInicial = sc.nextDouble();
			conta = new BancoOOP(numberAccount, holder, depositoInicial);
		}
		else {
			conta = new BancoOOP(numberAccount, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("digite o valor do deposito: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Updated account: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor que deseja sacar: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Updated account: ");
		System.out.println(conta);
		
		sc.close();

	}

}
