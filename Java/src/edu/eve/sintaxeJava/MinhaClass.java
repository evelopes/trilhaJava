package edu.eve.sintaxeJava;

public class MinhaClass {
	
	
public static void main(String [] args) {
	double altura = 1.62;
		int idade = 23;
		boolean simNao = true;
		String nome = "Eve";
		String sobrenome = "Lopes";
		String nomeCompleto = nomeCompleto(nome, sobrenome);
		
	System.out.println("Olá");
	System.out.println(altura);
	System.out.println(simNao);
	
	System.out.println(nomeCompleto);
}

public static String nomeCompleto(String nome, String sobrenome) {
	return nome.concat(" ").concat(sobrenome);
}

}
