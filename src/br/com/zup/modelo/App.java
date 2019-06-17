package br.com.zup.modelo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int início = entrada.nextInt();
		
		int fim = entrada.nextInt();
		
		System.out.println("Digite um número para iniciar a sequência");
		
		System.out.println("Digite um número para terminar a sequência");
		
		
		for (int i = início; i < fim; i++) {
			if (i == fim) {
				System.out.println(i);
			}else {
				System.out.println(",");
			}
			
		}
	}

}
