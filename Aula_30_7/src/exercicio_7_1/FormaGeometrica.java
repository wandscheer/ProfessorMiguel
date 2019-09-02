package exercicio_7_1;

public abstract class FormaGeometrica {	
	public abstract Ponto2D centro();
	public abstract float distancia(Ponto2D pt);
	
	public String ObjectToString(){
		return super.toString();
	}
}
