package br.udc.exercicios;

public class Exercicio2_2_1 {
	int var1, var2;
	
	 static int soma(int numero1, int numero2){
		return numero1+numero2;
	}
	
	 static int diferenca(int numero1, int numero2){
		if(numero1<numero2){
			return numero2-numero1;
		}else{
			return numero1-numero2;
		}
	}
}
