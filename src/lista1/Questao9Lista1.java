package lista1;

import java.util.Scanner;

public class Questao9Lista1 {

	public static void main(String[] args) {
//		9) Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
//	verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
//	verdadeiras imprima: "número não válido".

		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Escreva o valor de A: ");
		int A = entrada.nextInt();
		
		System.out.println("EScreva o valor de B: ");
		int B = entrada.nextInt();
		
		entrada.close();
		
		if (A > 10|| A + B == 20) 
			
				System.out.println("A + B == 20");
		else
			System.out.println("numero invalido");
		
	}

}
