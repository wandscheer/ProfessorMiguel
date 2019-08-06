package br.udc.exercicios;

public class Exercicio1_12_2 {
	public class Data{
		int dia, mes, ano;

		public void setDia(int dia) {
			if(!verificaDia(dia))
				return;
			this.dia = dia;
		}

		public void setMes(int mes) {
			if(!verificaMes(mes))
				return;
			this.mes = mes;
		}

		public void setAno(int ano) {
			if(!verificaAno(ano))
				return;
			this.ano = ano;
		}
		
		public boolean verificaDia(int dia){
			if(dia<0)
				return false;
			if(dia>31)
				return false;
			return true;
		}
		
		public boolean verificaMes(int mes){
			if(mes<0)
				return false;
			if(mes>12)
				return false;
			return true;
		}
		
		public boolean verificaAno(int ano){
			if(ano<0)
				return false;
			if(ano>2019)
				return false;
			return true;
		}
	}
}
