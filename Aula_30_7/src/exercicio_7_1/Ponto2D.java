package exercicio_7_1;

public class Ponto2D extends FormaGeometrica{
	private int x, y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public Ponto2D(){
		x=0;
		y=0;
	}
	
	public Ponto2D(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String quadrante(){
		if(x>0&&y>0)
			return ("Primeiro quadrante");
		if(x<0&&y>0)
			return ("Segundo quadrante");
		if(x<0&&y<0)
			return ("Terceiro quadrante");
		if(x>0&&y<0)
			return ("Quarto quadrante");
		return "Origem";
	}
	
	public float distancia(Ponto2D pt){
		return (float) Math.sqrt((x-pt.x)*(x-pt.x)+(y-pt.y)*(y-pt.y));
	}
	
	public Ponto2D centro(){
		return new Ponto2D(x, y);
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		if(!obj.getClass().equals(Ponto2D.class))
			return false;
		if(obj==this)
			return true;
		if(this.x !=((Ponto2D)obj).x)
			return false;
		if(this.x !=((Ponto2D)obj).y)
			return false;
		return false;
	}

	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
}


