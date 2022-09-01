package lista1;

import java.util.Scanner;

public class Questao7Lista1 {

	public static void main(String[] args) {
//		7) Verifique se A é maior que 10 ou se o A mais B é igual a 20, caso sejam
//	verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
//	afirmação não seja verdadeira, imprima: "número não válido".

		Scanner entrada = new Scanner(System.in);		
		
		System.out.println("Digite o valor de A: ");
		int A = entrada.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int B = entrada.nextInt();
		
		entrada.close();
		
		if(A > 10) {
			if (A > 10 ||  A+B == 20)
				System.out.println("numeros validos");
		} else 
			System.out.println("A é menor que 10 entao numero nao valido");
		
		
			
	}

}
