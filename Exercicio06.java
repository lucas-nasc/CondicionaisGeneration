package Exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		String tabela= """
		Codigo do cargo       Cargo		    Percentual do Reajuste
				1			Gerente					10%
				2			Vendedor				7%
				3			Supervisor				9%
				4			Motorista				6%
				5			Estoquista				5%
				6  			Tecnico de TI			8%
				""";
		String nome;
		int codigo;
		float salario,reajuste;
		
		Scanner leia = new Scanner(System.in);
		System.out.println(tabela);
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite seu salario");
		salario = leia.nextFloat();
		System.out.println("digite o Código do Cargo do Colaborador ( de 1 a 6) ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("Nome do colaborador " + nome);
			System.out.println("Cargo " + codigo);
			reajuste = (salario*10)/100 + salario;
			System.out.println("Salario: " +reajuste);
			break;
		case 2:
			System.out.println("Nome do colaborador " + nome);
			System.out.println("Cargo " + codigo);
			reajuste = (salario*7)/100 + salario;
			System.out.println("Salario: " +reajuste);
			break;
		case 3:
			System.out.println("Nome do colaborador " + nome);
			System.out.println("Cargo " + codigo);
			reajuste = (salario*9)/100 + salario;
			System.out.println("Salario: " +reajuste);
			break;
		case 4:
			System.out.println("Nome do colaborador " + nome);
			System.out.println("Cargo " + codigo);
			reajuste = (salario*6)/100 + salario;
			System.out.println("Salario: " +reajuste);
			break;
		case 5:
			System.out.println("Nome do colaborador " + nome);
			System.out.println("Cargo " + codigo);
			reajuste = (salario*5)/100 + salario;
			System.out.println("Salario: " +reajuste);
			break;
		case 6:
			System.out.println("Nome do colaborador " + nome);
			System.out.println("Cargo " + codigo);
			reajuste = (salario*8)/100 + salario;
			System.out.println("Salario: " +reajuste);
			break;
			default:
				System.out.println("opção invalida");
		}

	}

}
