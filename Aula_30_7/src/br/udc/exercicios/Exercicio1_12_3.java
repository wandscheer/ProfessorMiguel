package br.udc.exercicios;

import java.util.Scanner;

public class Exercicio1_12_3 {
	public static void main(String[] args) {
		int horas;
		Scanner sc = new Scanner(System.in);
		
		Exercicio1_12_1 hora = new Exercicio1_12_1();
		
		System.out.println("Digite um valor para hora: ");
		
		horas=sc.nextInt();
		
		hora.setHora(horas);
		
		//hora.mostrarHora(horas, minuto);
		
	}

}
