package br.udc.exercicios;

import java.util.Scanner;

public class Exercicio2_2_2 {

	public static void main(String[] args) {
		int numero1,numero2,somatorio,diferencia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		numero1=sc.nextInt();
		System.out.println("Digite o segundo numero:");
		numero2=sc.nextInt();
		
		somatorio=Exercicio2_2_1.soma(numero1, numero2);
		diferencia=Exercicio2_2_1.diferenca(numero1, numero2);
		
		System.out.printf("Soma: %d\nDiferença: %d\n",somatorio,diferencia);
	}

}
