package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int a,b,c,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero a");
		a = leia.nextInt();
		System.out.println("Digite o numero b");
		b = leia.nextInt();
		System.out.println("Digite o numero c");
		c = leia.nextInt();
		soma = a + b;
		
		
		
		if(soma > c) {
			System.out.println("A Soma de A + B é Maior do que C");
			System.out.println("a soma de " + a + " + " + b + " é igual a: " + soma + " que maior que o numero  " + c);
			System.out.println(a + "+" + b + "=" + soma + ">" + c );
		}else if(soma < c) {
			System.out.println("A Soma de A + B é Menor do que C");
			System.out.println("a soma de " + a + " + " + b + " é igual a: " + soma + " que menor que numero  " + c);
			System.out.println(a + "+" + b + "=" + soma + "<" + c );
			
		}else {
			System.out.println("A Soma de A + B é Igual a C");
			System.out.println("a soma de " + a + " + " + b + " é igual a: " + soma + " que igual ao numero  " + c);
			System.out.println(a + "+" + b + "=" + soma + "=" + c );
		}


	}

}
