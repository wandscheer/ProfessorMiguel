package exercicio_8_6;

public class Pessoa {
	String nome;
	
	public Pessoa(){
		this.nome="";
	}
	
	public Pessoa(String nome){
		this.nome=nome;
	}

	@Override
	public String toString() {
		return "Pessoa: " + nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
