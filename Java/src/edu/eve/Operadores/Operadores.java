package edu.eve.Operadores;

public class Operadores {
	private int a, b;
	
		Operadores(int a, int b){
			this.a = a;
			this.b = b;
		}
	
	public Operadores() {
		}

	String verdOuFalso() {
		
		return a==b ? "verdadeiro" : "falso";
	}
	
	
	public static void main(String[] args) {
		Operadores o = new Operadores();
		o.a = 5;
		o.b = 5;
		
		
		
		System.out.println(o.verdOuFalso());
		
		
		
	}
}
