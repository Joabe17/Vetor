package estruturaposcondicionado;

import java.util.Scanner;

public class Exerciio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int repe = 1;
		String nome;
		System.out.println("Qual é o seu nome?");
		nome = ler.nextLine();
		
		while (repe<=10) {
			System.out.println(nome);
			repe++;
		}
		
	}

}
