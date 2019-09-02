package exercicio_7_1;

public class Aplicacao {

	public static void main(String[] args) {
		
		Ponto2D ponto = new Ponto2D();
		Ponto2D ponto2 = new Ponto2D(1,1);
		Ponto2D ponto3 = null;
		Ponto2D ponto4 = new Ponto2D();
		
		System.out.println(ponto);
		System.out.println(ponto2);
		
		System.out.println("Ponto esta no: "+ponto.quadrante());
		System.out.println("Ponto2 esta no: "+ponto2.quadrante());
		
		System.out.println("Distancia: "+ponto.distancia(ponto2));
		
		System.out.println("ponto e ponto2 sao "+(ponto.equals(ponto2)?"iguais":"diferentes"));
		System.out.println("ponto e ponto sao "+(ponto.equals(ponto)?"iguais":"diferentes"));
		System.out.println("ponto e ponto3 sao "+(ponto.equals(ponto3)?"iguais":"diferentes"));
		System.out.println("ponto e ponto4 sao "+(ponto.equals(ponto4)?"iguais":"diferentes"));
		ponto3=ponto;
		System.out.println("ponto e ponto3 sao "+(ponto.equals(ponto3)?"iguais":"diferentes"));
		
		Linha2D l1 = new Linha2D(ponto,ponto2);
		System.out.println(l1);
	}

}
