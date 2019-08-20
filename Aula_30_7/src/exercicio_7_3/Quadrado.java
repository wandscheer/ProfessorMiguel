package exercicio_7_3;

public class Quadrado extends Quadrilatero{
	
	public Quadrado(int AX, int AY, int BX, int BY, int CX, int CY, int DX, int DY){
		super(AX, AY, BX, BY, CX, CY, DX, DY);
	}
	
	public Quadrado(){
		
	}
	
	public void verificar(int AX, int AY, int BX, int BY, int CX, int CY, int DX, int DY){
		if(((Math.abs(AX-BX))==(Math.abs(CX-DX)))&&((Math.abs(AY-BY))==(Math.abs(CY-DY))))
			System.out.println("É um quadrado!");
		System.out.println("Não é um quadrado!");
	}

	@Override
	public String toString() {
		return super.toString() ;
	}
	
	
}
