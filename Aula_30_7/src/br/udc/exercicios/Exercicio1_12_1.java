package br.udc.exercicios;

public class Exercicio1_12_1 {
	
	public class Hora{
		int hora;
		int minutos;
		
		public void mostrarHora(int hora, int minuto){
			System.out.printf("Hora: %d\nMinuto: %d\n",hora,minuto);
		}
		
		public void setHora(int hora) {
			if(!verificaHora(hora)){
				return;
			}
			this.hora = hora;
		}
		public void setMinutos(int minutos) {
			if(!verificaMinuto(minutos)){
				return;
			}
			this.minutos = minutos;
		}
		
		public boolean verificaHora(int hora){
			if(hora<0)
				return false;
			if(hora>23)
				return false;
			return true;
		}
		
		public boolean verificaMinuto(int minuto){
			if(minuto<0)
				return false;
			if(minuto>59)
				return false;
			return true;
		}
		
		public int compararHora(int hora, int minuto){
			hora = hora*60;
			return minuto+hora;
		}

		@Override
		public String toString() {
			return "Hora [hora=" + hora + ", minutos=" + minutos + "]";
		}
		
		
		
	}
	
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
		
		public void mostrarData(int dia, int mes, int ano){
			System.out.printf("Dia: %d\nMês: %d\nAno: %d\n",dia,mes,ano);
		}

		@Override
		public String toString() {
			return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
		}
		
		
		
	}
}
