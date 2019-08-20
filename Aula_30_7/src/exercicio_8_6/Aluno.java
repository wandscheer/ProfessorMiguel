package exercicio_8_6;

public class Aluno extends Pessoa{
	String curso;
	int serie;
	
	public Aluno(){
		this.curso="";
		this.serie=0;
		this.nome="";
	}
	
	public Aluno(String nome, String curso, int serie){
		super(nome);
		this.curso=curso;
		this.serie=serie;
	}

	@Override
	public String toString() {
		return "Aluno: [curso=" + curso + ", serie=" + serie + "]";
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}
	
}
