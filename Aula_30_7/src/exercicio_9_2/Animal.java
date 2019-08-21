package exercicio_9_2;

public class Animal {
	public String nome, cor, ambiente;
	public float comprimento, velocidadeMedia;
	public int numeroPatas;
	
	public Animal(){
		nome="";
		cor="";
		ambiente="";
		comprimento=0;
		velocidadeMedia=0;
		numeroPatas=0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	
	public void dados(){
		System.out.printf("Nome: "+nome+"\nCor: "+cor+"\nambiente: "+ambiente+"\ncomprimento: "
		+comprimento+" cm\nvelocidade media: "+velocidadeMedia+" m/s\nnumero de patas: "
		+numeroPatas+"\n\n");
	}
}
