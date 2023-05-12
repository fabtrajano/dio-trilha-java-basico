package ContaTerminal;

import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o numero da agência!");
		String agencia = sc.nextLine();
		System.out.println("Por favor, digite o numero da conta!");
		int conta = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor, digite o nome!");
		String nome = sc.nextLine();
		System.out.println("Por favor, digite o saldo!");
		double saldo = sc.nextDouble();
		
		System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
		+ agencia + ", conta "+ conta + " e seu  saldo de R$ "+String.format("%.2f", saldo)
		+" já esta disponivel para saque.");
		sc.close();
	}
}
