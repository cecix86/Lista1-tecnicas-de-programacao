package lista1;

import java.util.Scanner;

public class Questao8Lista1 {

	public static void main(String[] args) {
//		8) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
//	se A mais B é igual a 20, se verdadeiro, imprima: "A + B == 20” se não
//	for verdade: imprima "número não válido "
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva o numero A: ");
		int A = entrada.nextInt();
		
		System.out.println("EScreva o numero B: ");
		int B = entrada.nextInt();
		
		entrada.close();
		
		if (A > 10 ) {
			if(A + B == 20)
			System.out.println("A + B == 20 e A > 10");
		}
		else 
			System.out.println("Numero nao valido");
			
		
	}

}
