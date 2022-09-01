package lista1;

import java.util.Scanner;

public class Questao6Lista1 {

	public static void main(String[] args) {
//		6) Verifique se A é maior que 10, se verdade imprima: "A > 10" caso não
//	seja, imprima: "A <= 10". Verifique se A mais B é igual a 20, se
//	verdadeiro, imprima: "A + B == 20”, caso não seja imprima: “A + B !=
//	20”.

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int A = entrada.nextInt();
		
		System.out.println("Digite o valor de B");
		int B = entrada.nextInt();
		
		entrada.close();
		
		if (A > 10)
			System.out.println("A > 10");
		 if (A + B == 20)
			System.out.println("A + B == 20");
		else 
			System.out.println("A + B != 20");
	}

}
