package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		System.out.println("Digite se ja doou sangue antes, responda com True X False: ");
		primeiraDoacao = leia.nextBoolean();
		
		if(idade >= 18 && idade <60 ) {
			System.out.println(nome + "está apto para doar sangue!");
			
		}else if(idade >= 60 && idade <=69 && primeiraDoacao == false) {
			System.out.println(nome + " não está apto para doar sangue!");
		}else {
			System.out.println(nome + "está apto para doar sangue!");
		}
		
		

	}

}
