package com.superGoma;

public class Teste {

	public static void main(String args[]){
		MaquinaGoma m = new MaquinaGoma(5);
		
		// quando tudo da ok
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		// quando inserimos e ejetamos a moera corretamente
		m.inserirMoeda();
		m.ejetarMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		// quando tudo da ok
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
		
		m.inserirMoeda();
		m.acionarAlavanca();
		System.out.println("Número de gomas: " + m.getNumeroGoma());
	}
	
}
