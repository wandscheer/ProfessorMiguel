package br.udc.exercicios;

public class Exercicio1_12_1 {
		int hora;
		int minutos;
		
		public void mostrarHora(int hora, int minuto){
			System.out.printf("Hora: %d\nMinuto: %d",hora,minuto);
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
}
