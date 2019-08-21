package exercicio_9_2;

public class Mamifero extends Animal {
	String alimento;
	
	public Mamifero(String nome, String cor, String ambiente, float comprimento, float velocidadeMedia, int numeroPatas, String alimento){
		this.ambiente=ambiente;
		this.alimento=alimento;
		this.comprimento=comprimento;
		this.cor=cor;
		this.nome=nome;
		this.numeroPatas=numeroPatas;
		this.velocidadeMedia=velocidadeMedia;
	}
	
	public Mamifero(){
		nome="";
		cor="";
		ambiente="";
		comprimento=0;
		velocidadeMedia=0;
		numeroPatas=0;
		alimento="";
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	public void dadosPeixe(){
		System.out.printf("Nome: "+nome+"\nCor: "+cor+"\nambiente: "+ambiente+"\ncomprimento: "
		+comprimento+" cm\nvelocidade media: "+velocidadeMedia+" m/s\nnumero de patas: "
		+numeroPatas+"\nalimento: "+alimento+"\n\n");
	}
}
