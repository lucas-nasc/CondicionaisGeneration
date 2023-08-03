package Exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		int operacao;
		float saldo = 1000;
		float saque,deposito,novoSaldo;
		String tabela = """
				Codigo             Operação		    
				1			       Saldo			
				2			       Saque			
				3			       Deposito
				4					Sair
				""";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(tabela);
		System.out.println("Digite a operação que deseja: ");
		operacao = leia.nextInt();
		
		switch (operacao) {
		case 1 :
			System.out.println("saldo: " + saldo );
			break;
		case 2 :
			System.out.println("Digite o valor do seu saque: ");
			saque= leia.nextFloat();
			if(saque > saldo) {
				System.out.println("Saldo insuficiente");
			}else {
				novoSaldo = saldo - saque;
				System.out.println("Novo Saldo: " + novoSaldo);
			}
			break;
		case 3 :
			System.out.println("Digite o valor do deposito");
			deposito = leia.nextFloat();
			novoSaldo = saldo + deposito;
			System.out.println("Novo saldo: " + novoSaldo);
			break;
		default:
			System.out.println("opção invalida");
			
		}
		
		
		
		
		
		

	}

}
