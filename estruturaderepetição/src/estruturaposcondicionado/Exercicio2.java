package estruturaposcondicionado;

public class Exercicio2 {

	public static void main(String[] args) {
		int num = 1;
	    int valor, soma = 0;
	    
	    while (num<=15) {
	    	System.out.println(num);
	    	
	    	valor = num++;
	    	soma += valor;
	    	
	    }
		System.out.println("o resultado da some é:" + soma);		

	}

}
