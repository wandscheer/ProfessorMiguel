package exercicio_7_1;

public class Linha2D {
	private Ponto2D a;
	private Ponto2D b;
	
	public Linha2D(){
		a = new Ponto2D();
		b = new Ponto2D();
	}
	
	public Ponto2D getA() {
		return a;
	}

	public void setA(Ponto2D a) {
		this.a = a;
	}

	public Ponto2D getB() {
		return b;
	}

	public void setB(Ponto2D b) {
		this.b = b;
	}

	public Linha2D(Ponto2D a, Ponto2D b){
		this.a=a;
		this.b=b;
	}
	
	public Ponto2D centro(){
		return new Ponto2D((a.getX())+(b.getX())/2,
								(a.getY())+(b.getY())/2);
	}
	
	public float distancia(Ponto2D pt){
		return centro().distancia(pt);
	}

	@Override
	public String toString() {
		return ""+ a + ", " + b + "";
	}
}
