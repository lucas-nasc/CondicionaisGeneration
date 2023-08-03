package Exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int item,quantidade,soma;
		String tabela= """
***************************************************************				
	Codigo       Produto               Preço unitario
	1			Cachorro Quente			R$10.00
	2			X-Salada				R$15.00
	3			X-Bacon					R$18.00
	4			Bauru					R$12.00
	5			Refrigerante			R$8.00
	6			Suco de laranja			R$13.00
****************************************************************	
				""";
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(tabela);
		System.out.println("Escolha o produto desejado: ");
		item = leia.nextInt();
		
		switch(item) {
		case 1:
		System.out.println("Codigo 1 : Cachorro quente ");
		System.out.println("quantidade de lanches?");
		quantidade = leia.nextInt();
		soma = quantidade*10;
		System.out.printf("Valor Total R$" + soma+".00");
		break;
		case 2:
			System.out.println("codigo 2 : X-salada");
			System.out.println("quantidade de lanches?");
			quantidade = leia.nextInt();
			soma = quantidade*15;
			System.out.printf("Valor Total R$" + soma+".00");
			break;
		case 3:
			System.out.println("Codigo 3 : X-Bacon");
			System.out.println("quantidade de lanches?");
			quantidade = leia.nextInt();
			soma = quantidade*18;
			System.out.printf("Valor Total R$" + soma+".00");
			break;
		case 4:
			System.out.println("Codigo 4 : Bauru");
			System.out.println("quantidade de lanches?");
			quantidade = leia.nextInt();
			soma = quantidade*12;
			System.out.printf("Valor Total R$" + soma+".00");
			break;
		case 5:
			System.out.println("Codigo 5 : Refrigerante");
			System.out.println("quantidade de lanches?");
			quantidade = leia.nextInt();
			soma = quantidade*8;
			System.out.printf("Valor Total R$" + soma+".00");
			break;
		case 6:
			System.out.println("Codigo 6 : Suco de laranja");
			System.out.println("quantidade de lanches?");
			quantidade = leia.nextInt();
			soma = quantidade*13;
			System.out.printf("Valor Total R$" + soma+".00");
			break;
		default:
			System.out.println("opção invalida");
		}
		
		
		
			
		
		
		
		
		
		

	}

}
