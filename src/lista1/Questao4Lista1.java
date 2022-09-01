package lista1;
import java.util.Scanner;
public class Questao4Lista1 {

	public static void main(String[] args) {
//	Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
//	imprima: "número válido". Caso as afirmações não sejam verdadeiras,
//	Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
//	diferentes de 10; A é menor que 10) caso não seja verdade imprima:
//	"número não válido".

	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o numero A");
	int A = entrada.nextInt();
	
	System.out.println("Digite o numero B");
	int B = entrada.nextInt();
	
	entrada.close(); 
	
	if(A > 10 || A + B == 20)
		System.out.println("numero valido");
	else if (A==B)
		System.out.println("A é igual a B /n A e B são diferentes de 10 /n A é menor que 10");
	else 
		System.out.println("numero nao valido");
	
		
	}

}
