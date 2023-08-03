package Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		String caracteristica1,caracteristica2,caracteristica3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira caracteristica do animal: ");
		caracteristica1 = leia.nextLine();
		System.out.println("Digite a primeira caracteristica do animal: ");
		caracteristica2 = leia.nextLine();
		System.out.println("Digite a primeira caracteristica do animal: ");
		caracteristica3 = leia.nextLine();
		
		 if (caracteristica1.equalsIgnoreCase("vertebrado")) {
	            if (caracteristica2.equalsIgnoreCase("ave")) {
	                if (caracteristica3.equalsIgnoreCase("carnivoro")) {
	                    System.out.println("O animal é uma águia.");
	                } else if (caracteristica3.equalsIgnoreCase("onivoro")) {
	                    System.out.println("O animal é um pombo.");
	                }
	            } else if (caracteristica2.equalsIgnoreCase("mamifero")) {
	                if (caracteristica3.equalsIgnoreCase("onivoro")) {
	                    System.out.println("O animal é um homem.");
	                } else if (caracteristica3.equalsIgnoreCase("herbivoro")) {
	                    System.out.println("O animal é uma vaca.");
	                }
	            }
	            
	        } else if (caracteristica1.equalsIgnoreCase("invertebrado")) {
	            if (caracteristica2.equalsIgnoreCase("inseto")) {
	                if (caracteristica3.equalsIgnoreCase("hematofago")) {
	                    System.out.println("O animal é uma pulga.");
	                } else if (caracteristica3.equalsIgnoreCase("herbivoro")) {
	                    System.out.println("O animal é uma borboleta.");
	                }
	            } else if (caracteristica2.equalsIgnoreCase("anelideo")) {
	                if (caracteristica3.equalsIgnoreCase("hematofago")) {
	                    System.out.println("O animal é uma sanguessuga.");
	                } else if (caracteristica3.equalsIgnoreCase("onivoro")) {
	                    System.out.println("O animal é uma minhoca.");
	                }
	            }
	        } else {
	            System.out.println("Não foi possível identificar o tipo de animal.");
	        }
		
		

	}

}
