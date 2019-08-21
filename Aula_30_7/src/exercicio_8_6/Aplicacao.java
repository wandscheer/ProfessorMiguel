package exercicio_8_6;

import java.util.Scanner;

public class Aplicacao {
	
	public static void nome(String nome){
		System.out.printf("Digite um nome para "+nome+": ");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome, curso, data, setor, disciplina;
		int serie, ano;
		float registro, salario;
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Funcionario func = new Funcionario();
		Servente serve = new Servente();
		Professor prof = new Professor();
		Diretor dire = new Diretor();
		
		nome("pessoa");
		nome=sc.nextLine();
		pessoa.setNome(nome);
		sc.nextLine();
		
		nome("aluno");
		nome=sc.nextLine();
		aluno.setNome(nome);
		System.out.printf("Digite um curso para o aluno: ");
		curso=sc.nextLine();
		aluno.setCurso(curso);
		System.out.printf("Digite uma serie para o aluno: ");
		serie=sc.nextInt();
		aluno.setSerie(serie);
		sc.nextLine();
		sc.nextLine();
		
		nome("funcionário");
		nome=sc.nextLine();
		func.setNome(nome);
		System.out.printf("Digite o numero de registro do funcionário:\n");
		registro=sc.nextFloat();
		func.setRegistro(registro);
		System.out.printf("Digite o valor do salario do funcionario: ");
		salario=sc.nextFloat();
		func.setSalario(salario);
		sc.nextLine();
		System.out.printf("Digite a data de inicio do funcionario: ");
		data=sc.nextLine();
		func.setData(data);
		sc.nextLine();
		
		nome("servente");
		nome=sc.nextLine();
		serve.setNome(nome);
		System.out.printf("Digite o setor do servente: ");
		setor=sc.nextLine();
		serve.setSetor(setor);
		sc.nextLine();
		
		nome("professor");
		nome=sc.nextLine();
		prof.setNome(nome);
		System.out.printf("Digite a disciplina do professor: ");
		disciplina=sc.nextLine();
		prof.setDisciplina(disciplina);
		sc.nextLine();
		
		nome("diretor");
		nome=sc.nextLine();
		dire.setNome(nome);
		System.out.printf("Digite o ano de mandato do diretor: ");
		ano=sc.nextInt();
		dire.setAno(ano);
		
		System.out.println(pessoa);
		System.out.println(aluno);
		System.out.println(func);
		System.out.println(setor);
		System.out.println(prof);
		System.out.println(dire);
	}

}
