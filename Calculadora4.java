package br.com.desafioCapgemini.sistemaAnuncio1;

import java.util.Scanner;

public class Calculadora4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor investido no an�ncio (em n�mero inteiro)");
		
		double valorInvest = input.nextDouble();
		
		double visualizOrig = (valorInvest * 30.0);
		
		double calculation = (12.0/100.0) * (3.0/20.0) * 40.0;
						
		double compart1 = Math.round(visualizOrig * calculation);
		System.out.println(compart1 + " pessoas visualizam no 1� compartilhamento");
		double compart2 = Math.round(compart1 * calculation); 
		System.out.println(compart2 + " pessoas visualizam no 2� compartilhamento");
		double compart3 = Math.round(compart2 * calculation);
		System.out.println(compart3 + " pessoas visualizam no 3� compartilhamento");
		double compart4 = Math.round(compart3 * calculation);
		System.out.println(compart4 + " pessoas visualizam no 4� compartilhamento");
		System.out.println(compart1 + compart2 + compart3 + compart4 + " � a proje��o aproximada da quantidade m�xima de pessoas que visualizar�o o mesmo an�ncio");
	}

}
