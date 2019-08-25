package exercicio_10_3;

public class Aplicacao {

	public static void main(String[] args) {
		Empregado em = new Empregado();
		
		String nome="teste", departamento="Diretoria";
		int horasTrabalhadasNoMesComExtra=1, horasTrabalhadasNormais=2;
		float salarioPorHora=100;
		
		em.setDepartamento(departamento);
		em.setHorasTrabalhadasNoMesComExtra(horasTrabalhadasNoMesComExtra);
		em.setHorasTrabalhadasNormais(horasTrabalhadasNormais);
		em.setNome(nome);
		em.setSalarioPorHora(salarioPorHora);
		
		em.calculaSalarioMensal(departamento, salarioPorHora, horasTrabalhadasNormais, horasTrabalhadasNoMesComExtra);
		
		em.mostraDados(nome, departamento, horasTrabalhadasNoMesComExtra, horasTrabalhadasNormais, salarioPorHora);
	}

}
