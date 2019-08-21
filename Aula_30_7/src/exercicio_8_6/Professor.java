package exercicio_8_6;

public class Professor extends Pessoa{
	String disciplina;
	
	public Professor(){
		this.disciplina="";
		this.nome="";
	}
	
	public Professor(String disciplina, String nome){
		super(nome);
		this.disciplina=disciplina;
	}

	@Override
	public String toString() {
		return super.toString()+ " Professor [disciplina=" + disciplina + "]";
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}
