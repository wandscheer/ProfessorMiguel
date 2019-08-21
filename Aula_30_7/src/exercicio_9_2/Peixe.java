package exercicio_9_2;

public class Peixe extends Animal {
	String caracteristica;
	
	public Peixe(){
		nome="";
		cor="";
		ambiente="";
		comprimento=0;
		velocidadeMedia=0;
		numeroPatas=0;
		caracteristica="";
	}
	
	public Peixe(String nome, String cor, String ambiente, float comprimento, float velocidadeMedia, int numeroPatas, String caracteristica){
		this.ambiente=ambiente;
		this.caracteristica=caracteristica;
		this.comprimento=comprimento;
		this.cor=cor;
		this.nome=nome;
		this.numeroPatas=numeroPatas;
		this.velocidadeMedia=velocidadeMedia;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	public void dadosPeixe(){
		System.out.printf("Nome: "+nome+"\nCor: "+cor+"\nambiente: "+ambiente+"\ncomprimento: "
		+comprimento+" cm\nvelocidade media: "+velocidadeMedia+" m/s\nnumero de patas: "
		+numeroPatas+"\ncaracteristica: "+caracteristica+"\n\n");
	}
}
