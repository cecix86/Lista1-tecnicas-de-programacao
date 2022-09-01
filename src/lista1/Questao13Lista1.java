package lista1;

import java.util.Scanner;

public class Questao13Lista1 {

	public static void main(String[] args) {
//		13) Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
//	verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
//	Caso as afirmações não sejam verdadeiras, imprima: "números não
//	válidos".

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os valores de A: ");
		int A = entrada.nextInt();
		
		System.out.println("Digite os valores de B: ");
		int B = entrada.nextInt();
		
		entrada.close();
		
		if(A > 10 || A + B == 20)
			System.out.println("A > 10 \nA + B = 20");
		else
			System.out.println("numeros nao validos");
		
	}

}
