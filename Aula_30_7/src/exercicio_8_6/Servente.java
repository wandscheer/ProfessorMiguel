package exercicio_8_6;

public class Servente extends Pessoa{
	String setor;
	
	public Servente(){
		this.nome="";
		this.setor="";
	}
	
	public Servente(String nome, String setor){
		super(nome);
		this.setor=setor;
	}

	@Override
	public String toString() {
		return "Servente [setor=" + setor + "]";
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
}
