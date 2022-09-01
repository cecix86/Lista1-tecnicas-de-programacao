package lista1;

import java.util.Scanner;

public class Questao10Lista1 {

	public static void main(String[] args) {
//		10)Verifique se A é maior que 10 se não for imprima: "número menor que
//			10". Verifique se A mais B é igual a 20 se não for verdade imprima
//			"número diferente de 20
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os valores de A: ");
		int A = entrada.nextInt();
		
		System.out.println("Digite os valores de B: ");
		int B = entrada.nextInt();
		
		entrada.close();
		
		if(A < 10 ) 
			System.out.println("numero menor que 10");
		else if (A + B != 20)
			System.out.println("numero diferente de 20");
		
	}

}
