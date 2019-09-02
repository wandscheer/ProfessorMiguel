package exercicio_7_3;

public class Aplicacao_7_3 {

	public static void main(String[] args) {
		Trapezio tra = new Trapezio();
		Paralelogramo para = new Paralelogramo();
		Retangulo reta = new Retangulo();
		Quadrado qua = new Quadrado();
		
		//metodo quadrado ser quadrado;
		
		qua.setAX(1);
		qua.setAY(3);
		qua.setBX(3);
		qua.setBY(3);
		qua.setCX(3);
		qua.setCY(1);
		qua.setDX(1);
		qua.setDY(1);
		
		System.out.println(qua);
		qua.verificar(1,3,3,3,3,1,1,1);
	}

}
