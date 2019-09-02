package exercicio_7_3;

public class Quadrado extends Quadrilatero{
	
	int area;
	
	public Quadrado(int AX, int AY, int BX, int BY, int CX, int CY, int DX, int DY, int area){
		super(AX, AY, BX, BY, CX, CY, DX, DY);
		int x,y,lado1,lado2;
		x=AX-BX;
		y=AY-BY;
		x=Math.abs(x);
		y=Math.abs(y);
		lado1=x+y;
		x=BX-CX;
		y=BY-CY;
		x=Math.abs(x);
		y=Math.abs(y);
		lado2=x+y;
		this.area=lado1*lado2;
	}
	
	public Quadrado(){
		area=0;
	}
	
	public void verificar(int AX, int AY, int BX, int BY, int CX, int CY, int DX, int DY){
		int lado1, lado2, lado3, lado4, x, y;
		x=AX-BX;
		y=AY-BY;
		x=Math.abs(x);
		y=Math.abs(y);
		lado1=x+y;
		x=BX-CX;
		y=BY-CY;
		x=Math.abs(x);
		y=Math.abs(y);
		lado2=x+y;
		x=CX-DX;
		y=CY-DY;
		x=Math.abs(x);
		y=Math.abs(y);
		lado3=x+y;
		x=DX-AX;
		y=DY-AY;
		x=Math.abs(x);
		y=Math.abs(y);
		lado4=x+y;
		if((lado1==lado2)&&(lado2==lado3)&&(lado3==lado4)){
			System.out.println("… um quadrado!");
		}
		else
			System.out.println("N„o È um quadrado!");
	}

	@Override
	public String toString() {
		return super.toString() +"\n¡rea: "+area;
	}
	
	
}
