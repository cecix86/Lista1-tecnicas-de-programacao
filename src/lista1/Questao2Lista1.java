package lista1;

import java.util.Scanner;

public class Questao2Lista1 {

	public static void main(String[] args) {
//		2) Verifique se A é menor que 10, se verdade imprima: "A < 10", e verifique
//	se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso
//	nenhumas das afirmação não seja verdadeira, imprima: "número não
//	válido"
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("excreva os valores de A: ");
		int a  = entrada.nextInt();
		
		System.out.println("escreva os vallores de B: ");
		int b = entrada.nextInt();
		
		entrada.close();
		
		if (a < 10)
			System.out.println("A < 10");
		if (a + b == 20 )
			System.out.println("A + B == 20");
			 
		else 
			System.out.println("numero nao valido");
	
	}

}
