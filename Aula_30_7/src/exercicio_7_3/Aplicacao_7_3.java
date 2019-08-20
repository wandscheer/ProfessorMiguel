package exercicio_7_3;

public class Aplicacao_7_3 {

	public static void main(String[] args) {
		Trapezio tra = new Trapezio();
		Paralelogramo para = new Paralelogramo();
		Retangulo reta = new Retangulo();
		Quadrado qua = new Quadrado();
		
		//metodo quadrado ser quadrado;
		
		qua.setAX(1);
		qua.setAY(2);
		qua.setBX(3);
		qua.setBY(4);
		qua.setCX(5);
		qua.setCY(6);
		qua.setDX(7);
		qua.setDY(8);
		
		System.out.println(qua);
		
	}

}
