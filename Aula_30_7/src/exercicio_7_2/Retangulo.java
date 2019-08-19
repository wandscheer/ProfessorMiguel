package exercicio_7_2;

public class Retangulo {
	public double comprimento=1, largura=1;
	
	public void perimetro(double comprimento, double largura){
		System.out.println("Perimetro: "+((comprimento*2)+(largura*2)));
	}
	
	public void area(double comprimento, double largura){
		System.out.println("Area: "+comprimento*largura);
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		if(verificacaoComprimento(comprimento))
			this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if(verificacaoLargura(largura))
			this.largura = largura;
	}
	
	public boolean verificacaoComprimento(double comprimento){
		if(!(comprimento<0 || comprimento>20))
			return false;
		return true;
	}
	
	public boolean verificacaoLargura(double largura){
		if(!(largura<0 || largura>20))
			return false;
		return true;
	}
}
