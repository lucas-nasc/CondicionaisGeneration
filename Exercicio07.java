package Exercicios;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		float numeroA,numeroB,res;
		int opMat;
		String tabela = """
				Codigo             Operação		    
				1			       Soma				
				2			       Subtração			
				3			       Multiplicação				
				4			       Divisão	
				
				""";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		numeroA = leia.nextFloat();
		System.out.println("Digite o segundo numero: ");
		numeroB = leia.nextFloat();
		
		System.out.println(tabela);
		
		System.out.println("Digite um numero de 1 a 4 para realizar a operação matematica que deseja: ");
		opMat = leia.nextInt();
		
		switch (opMat) {
		case 1:
			res = numeroA + numeroB;
			System.out.println(numeroA+ "+" + numeroB +"="+ res);
			break;
		case 2:
			res = numeroA - numeroB;
			System.out.println(numeroA+ "-" + numeroB +"="+ res);
			break;
		case 3:
			res = numeroA * numeroB;
			System.out.println(numeroA+ "*" + numeroB +"="+ res);
			break;
		case 4:
			res = numeroA / numeroB;
			System.out.println(numeroA+ "/" + numeroB +"="+ res);
			break;
			default:
				System.out.println("opção invalida");
		}
	}

}
