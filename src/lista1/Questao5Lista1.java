package lista1;

import java.util.Scanner;

public class Questao5Lista1 {

	public static void main(String[] args) {
//		5) Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
//	imprima: "número válido". Caso as afirmações não sejam verdadeiras,
//	imprima: "número não válido".
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero A: ");
		int A = entrada.nextInt();
		
		System.out.println("Digite o numero B: ");
		int B = entrada.nextInt();
		
		entrada.close();
		
		if (A > 10 || A + B == 20)
			System.out.println("numero valido :)");
		else 
			System.out.println("numero nao valido :(");
		
	}

}
