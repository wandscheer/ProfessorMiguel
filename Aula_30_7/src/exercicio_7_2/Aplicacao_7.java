package exercicio_7_2;

public class Aplicacao_7 {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo();
		
		
		double comprimento=5, largura=8;
		
		
		retangulo.setComprimento(comprimento);
		retangulo.setLargura(largura);
		
		retangulo.perimetro(comprimento, largura);
		retangulo.area(comprimento, largura);

	}

}
