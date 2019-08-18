package exercicio_7_1;

public class Ponto2D {
	public double x, x2;
	public double y, y2;
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	public double getX2() {
		return x2*(-1);
	}

	public double getY2() {
		return y2*(-1);
	}
	
	public Ponto2D(){
		this.x=0;
		this.x2=0;
		this.y=0;
		this.y2=0;
	}
	
	public Ponto2D(double x, double x2, double y, double y2){
		this.x=x;
		this.x2=x*(-1);
		this.y=y;
		this.y2=y*(-1);
	}

	@Override
	public String toString() {
		return "Ponto: ("+x+", "+y+") ("+x2+", "+y2+")";
	}
	
	
	
}


