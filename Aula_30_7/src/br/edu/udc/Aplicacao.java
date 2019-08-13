package br.edu.udc;

public class Aplicacao {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Fulado de Tal");
		pessoa.setRg(1234);
		pessoa.setCpf(56789);
		
		System.out.println(pessoa);
		
		Estudante estudante = new Estudante();
		estudante.setNome("Charlinston");
		System.out.println(estudante);
		
		Estudante gustavo = new Estudante("gustavo", 258, 357, 546);
		System.out.println(gustavo);
		
	}

}
