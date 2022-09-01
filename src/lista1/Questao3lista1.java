package lista1;
import java.util.Scanner;
public class Questao3lista1 {

	public static void main(String[] args) {
//		3) Verifique se A é igual a 10, se verdade imprima: "A == 10", e verifique
//	se o A mais B é igual a 20, se verdade imprima: "A + B == 20". verifique
//	se o B é igual a 10, se verdade imprima: "B == 10", (obs: todas as três
//	impressões são permitidas na saída do programa)

	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Escreva o valor de A");
	int A = entrada.nextInt();
	
	System.out.println("Escreva o valor de B");
	int B = entrada.nextInt();
	
	entrada.close();
	
	if(A == 10)
		System.out.println("A == 10");
	if (A + B == 20)
		System.out.println("A + B == 20");
	if(B == 10)
		System.out.println("B == 10");
	else 
		System.out.println("numero nao valido");
	
	}

}
