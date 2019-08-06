package br.edu.udc;

public class PrimeiraClasse {

	public static void main(String[] args) {
		int valor = 34;
		String frase="um programa em Java!";
		String frase_2 = "Um programa Java!";
		
		System.out.printf("Estruturando saida com:\nTexto: %s\nValor inteiro: %d\n",frase, valor);
	
		System.out.printf("Caracteristicas da String:\nComprimento: %d"
				+ "\nConcatenação: %s\nComparação: \"%s\" = \"%s\"-> %b\n",
				frase.length(), frase + " Aumentando a frase...",
				frase, frase_2, frase.equals(frase_2));
		
		PrimeiraClasse obj = new PrimeiraClasse();
		obj.repetirFrase(frase, 3);
		
		AulaClasse02.mostrarAoContrario(frase);
		
	}
	
	void repetirFrase(String frase, int vezes){
		for(int i=0; i<vezes; i++){
			System.out.println(frase);
		}
	}

}
