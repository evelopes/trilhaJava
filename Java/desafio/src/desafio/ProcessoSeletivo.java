package desafio;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	static String [] candidatos = {"Luana", "Gabriel", "Juliana", "Mateus", "Beatriz"};
	
	public static void main(String[] args) {
		System.out.println("PROCESSO SELETIVO");
		// analisarCandidato(1900.0);
		// analisarCandidato(2200.0);
		// analisarCandidato(2000.0);
		//selecaoCandidatos();
		//imprimirSelecionados();
		for(String candidato: candidatos) {
		ligarCandidatos(candidato);
	}}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"Luana", "Gabriel", "Juliana", "Mateus", "Beatriz", "Pedro", "Larissa", "Rafael", "Aline", "Eduardo", "Mariana", "Lucas", "Isabela", "Thiago", "Francisco"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 ) {
			String candidato =  candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " +  candidato + " solicitou este valor de salário: " + salarioPretendido);
			
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " +  candidato + " foi selecionado para a vaga!");
				candidatosSelecionados++;
				
			}
			candidatoAtual++;
			
		}
		
	}
	
	static void ligarCandidatos(String candidato) {
			int tentativa = 1;
			boolean resposta = false;
			while(tentativa < 3 && resposta == false) {
				resposta = atender();			
				tentativa++;
			}
			if(resposta == true) {
				System.out.println("Conseguimos contato com " +  candidato +  " após " + tentativa + " tentativa(s)");
			}else {
				System.out.println("Não conseguimos contato com o " +  candidato);
			}
			
			
		
		
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	
	static void imprimirSelecionados() {
		String [] candidatos = {"Luana", "Gabriel", "Juliana", "Mateus", "Beatriz"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de número " +  (indice + 1) + " é " + candidatos[indice]);
		}
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " +  candidato);
		}
		
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDADO");
		else if(salarioBase == salarioPretendido)
			System.out.println("LIGAR E OFERECER CONTRAPROPOSTA");
		else
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
	}
}
