package br.edu.udc;

import java.util.Scanner;

public class Exercicio3_1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int numero=0, quinto, quarto, terceiro, segundo, primeiro;
		
		while(numero<9999){
			System.out.println("Digite um numero com 5 digitos:");
			numero=sc.nextInt();
		}
		quinto=numero%10;
		mostrarNumero(quinto,numero);
		numero/=10;
		quarto=numero%10;
		mostrarNumero(quarto,numero);
		numero/=10;
		terceiro=numero%10;
		mostrarNumero(terceiro,numero);
		numero/=10;
		segundo=numero%10;
		mostrarNumero(segundo,numero);
		numero/=10;
		primeiro=numero;
		mostrarNumero(primeiro,numero);
		
	}
	
	static void mostrarNumero(int numero,int tamanho){
		if(numero==1){
			if(tamanho<10){
				System.out.printf("um.");
			}else{
				System.out.printf("um, ");
			}
		}if(numero==2){
			if(tamanho<10){
				System.out.printf("dois.");
			}else{
				System.out.printf("dois, ");
			}
		}if(numero==3){
			if(tamanho<10){
				System.out.printf("tres.");
			}else{
				System.out.printf("tres, ");
			}
		}if(numero==4){
			if(tamanho<10){
				System.out.printf("quatro.");
			}else{
				System.out.printf("quatro, ");
			}
		}if(numero==5){
			if(tamanho<10){
				System.out.printf("cinco.");
			}else{
				System.out.printf("cinco, ");
			}
		}if(numero==6){
			if(tamanho<10){
				System.out.printf("seis.");
			}else{
				System.out.printf("seis, ");
			}
		}if(numero==7){
			if(tamanho<10){
				System.out.printf("sete.");
			}else{
				System.out.printf("sete, ");
			}
		}if(numero==8){
			if(tamanho<10){
				System.out.printf("oito.");
			}else{
				System.out.printf("oito, ");
			}
		}if(numero==9){
			if(tamanho<10){
				System.out.printf("nove.");
			}else{
				System.out.printf("nove, ");
			}
		}if(numero==0){
			if(tamanho<10){
				System.out.printf("zero.");
			}else{
				System.out.printf("zero, ");
			}
		}
	}
	
}
