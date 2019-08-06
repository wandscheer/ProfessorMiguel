package br.edu.udc;

public class Pessoa {
	private String nome;
	private int rg;
	private int cpf;
	
	static boolean verificarCpf(int cpf){
		if(cpf>0)
			return true;
		return false;
	}
	
	public void setNome(String val){
		nome = val;
	}
	
	public void setRg(int val){
		rg = val;
	}
	
	public void setCpf(int val){
		if(!verificarCpf(cpf))
			return;
		cpf = val;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + "]";
	}
	
}
