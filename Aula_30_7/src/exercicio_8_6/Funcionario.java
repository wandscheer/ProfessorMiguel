package exercicio_8_6;

public class Funcionario extends Pessoa{
	float registro, salario;
	String data;
	
	public Funcionario(){
		this.data="";
		this.nome="";
		this.registro=0;
		this.salario=0;
	}
	
	public Funcionario(String data, String nome, float registro, float salario){
		super(nome);
		this.data=data;
		this.registro=registro;
		this.salario=salario;
	}

	@Override
	public String toString() {
		return super.toString()+ " Funcionario [registro=" + registro + ", salario=" + salario
				+ ", data=" + data + "]";
	}

	public float getRegistro() {
		return registro;
	}

	public void setRegistro(float registro) {
		this.registro = registro;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
