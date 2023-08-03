package Exercicios;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		int a;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		a = leia.nextInt();
		
		if(a%2== 0 && a > 0) {
			System.out.println("O numero "+ a +" é par e positivo!");
			
		}else if (a%2!= 0 && a > 0) {
			System.out.println("O numero "+ a +" é impar e positivo!");
		}else if (a%2== 0 && a < 0) {
			System.out.println("O numero "+ a +" é par e negativo!");
			
		}else {
			System.out.println("O numero "+ a + " é impar e negativo!");
		}
		
	}

}
