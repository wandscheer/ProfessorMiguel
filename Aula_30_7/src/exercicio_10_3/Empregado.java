package exercicio_10_3;

public class Empregado {
	String nome, departamento;
	int horasTrabalhadasNoMesComExtra, horasTrabalhadasNormais;
	float salarioPorHora;
	
	public Empregado(){
		nome="";
		departamento="";
		horasTrabalhadasNoMesComExtra=0;
		horasTrabalhadasNormais=0;
		salarioPorHora=0;
	}
	
	public Empregado(String nome, String departamento, int horas, int horasExtra, float salario){
		this.nome=nome;
		this.departamento=departamento;
		this.horasTrabalhadasNoMesComExtra=horasExtra;
		this.horasTrabalhadasNormais=horas;
		this.salarioPorHora=salario;
	}
	
	public void mostraDados(String nome, String departamento, int horas, int horasExtra, float salario){
		System.out.println("Nome: "+nome+"\nDepartamento: "+departamento+"\nHoras Trabalhadas: "
				+(horas+horasExtra)+"\nSalario por Hora: "+salario);
	}
	
	public float calculaSalarioMensal(String departamento, float salario, int horas, int extra){
		if(departamento=="Diretoria"){
			salario=salario*horas;
			salario=salario*extra;
			return (float) (salario+(salario*(0.10)));
		}
		salario=salario*horas;
		salario=salario*extra;
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getHorasTrabalhadasNoMesComExtra() {
		return horasTrabalhadasNoMesComExtra;
	}

	public void setHorasTrabalhadasNoMesComExtra(int horasTrabalhadasNoMesComExtra) {
		this.horasTrabalhadasNoMesComExtra = horasTrabalhadasNoMesComExtra;
	}

	public int getHorasTrabalhadasNormais() {
		return horasTrabalhadasNormais;
	}

	public void setHorasTrabalhadasNormais(int horasTrabalhadasNormais) {
		this.horasTrabalhadasNormais = horasTrabalhadasNormais;
	}

	public float getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(float salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}
	
}
