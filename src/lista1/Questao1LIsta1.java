package lista1;

import java.util.Scanner; 

public class Questao1LIsta1 {

	public static void main(String[] args) {

		
//		1) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
//		se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso a
//		segunda afirmação não seja verdadeira, imprima: "número não válido".
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("escreva os valor de a: ");
		int a = entrada.nextInt();
		
		System.out.println("escreva o valor de b:");
		int b = entrada.nextInt();
		
		if (a>10) 
			System.out.println(" a > 10");
			
		if (a + b == 20 )
			System.out.println("a + b = 20");
		
			else 
				System.out.println("numero nao valido");
		
		entrada.close();
		
	} 
	

}
