package br.udc.exercicios;

import br.udc.exercicios.Exercicio1_12_1.Data;
import br.udc.exercicios.Exercicio1_12_1.Hora;

public class Exercicio1_12_2 {
	public static void main(String[] args) {
		Exercicio1_12_1 obj = new Exercicio1_12_1();
		
		Hora hora = obj.new Hora();
		Hora hora_2 = obj.new Hora();
		
		hora.setHora(1);
		hora.setMinutos(2);
		
		hora_2.setHora(1);
		hora_2.setMinutos(3);
		
		Data data = obj.new Data();
		
		data.setDia(1);
		data.setMes(2);
		data.setAno(3);
		
		System.out.println(hora);
		System.out.println(data);
	}	
}
