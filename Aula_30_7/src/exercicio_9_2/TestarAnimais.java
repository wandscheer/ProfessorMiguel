package exercicio_9_2;

public class TestarAnimais {

	public static void main(String[] args) {
		
		Mamifero mami = new Mamifero();
		mami.setNome("Camelo");
		mami.setComprimento(150);
		mami.setNumeroPatas(4);
		mami.setCor("Amarelo");
		mami.setAmbiente("Terra");
		mami.setVelocidadeMedia(2);
		
		Peixe px = new Peixe();
		px.setNome("Tubarão");
		px.setComprimento(300);
		px.setNumeroPatas(0);
		px.setCor("Cinzento");
		px.setAmbiente("Mar");
		px.setVelocidadeMedia((float) 1.5);
		px.setCaracteristica("Barbatanas e cauda");
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-Canadá");
		urso.setComprimento(180);
		urso.setNumeroPatas(4);
		urso.setCor("Vermelho");
		urso.setAmbiente("Terra");
		urso.setVelocidadeMedia((float) 0.5);
		urso.setAlimento("Mel");
		
		mami.dados();
		px.dadosPeixe();
		urso.dados();
	}

}
