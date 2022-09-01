package lista1;

import java.util.Scanner;

public class Questao11Lista1 {

	public static void main(String[] args) {
//		11) Verifique se A é maior que 10 se não for verifique se A mais B é igual a
//	20, imprima: "A + B == 20''. Caso A não seja maior que 10 e A mais B
//	for diferente de 20, imprima: "número não válido".
			
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite o numero A: ");
		int A = entrada.nextInt();
		
		System.out.println("Digite o numero B: ");
		int B = entrada.nextInt();
		
		entrada.close();
		
		if(A >= 10) {
			if(A + B == 20)
				System.out.println("A + B == 20");
		}else 
			System.out.println("numero invalido");
		
	}

}
