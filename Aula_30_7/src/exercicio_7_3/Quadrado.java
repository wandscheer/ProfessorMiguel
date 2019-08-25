package exercicio_7_3;

public class Quadrado extends Quadrilatero{
	
	public Quadrado(int AX, int AY, int BX, int BY, int CX, int CY, int DX, int DY){
		super(AX, AY, BX, BY, CX, CY, DX, DY);
	}
	
	public Quadrado(){
		
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
			System.out.println("É um quadrado!");
		}
		else
			System.out.println("Não é um quadrado!");
	}

	@Override
	public String toString() {
		return super.toString() ;
	}
	
	
}
