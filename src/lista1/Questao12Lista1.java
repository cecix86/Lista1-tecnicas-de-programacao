package lista1;

import java.util.Scanner;

public class Questao12Lista1 {

	public static void main(String[] args) {
//		12) Verifique se A é maior que 10 imprima: "A > 10" ou verifique se A mais
//	B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
//	verdadeiras, imprima: "números não válidos". Sejam as afirmações
//	anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
//	disciplina de Técnicas de Programação”.

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os valores de A: ");
		int A = entrada.nextInt();
		
		System.out.println("Digite os valores de B: ");
		int B = entrada.nextInt();
		
		entrada.close();
		
		if (A > 10)
			System.out.println("A > 10"); 
		 if (A + B == 20)
			System.out.println("A + B == 20");
		else 
			System.out.println("numeros nao validos :(");
		
		 System.out.println("bem vindo a disciplina de tecnicas de programação :0");
	
	}
	
}
