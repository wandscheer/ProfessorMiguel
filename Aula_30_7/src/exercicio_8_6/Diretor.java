package exercicio_8_6;

public class Diretor extends Pessoa{
	int ano;
	
	public Diretor(){
		this.ano=0;
		this.nome="";
	}
	
	public Diretor(String nome, int ano){
		super(nome);
		this.ano=ano;
	}

	@Override
	public String toString() {
		return "Diretor [ano=" + ano + "]";
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
