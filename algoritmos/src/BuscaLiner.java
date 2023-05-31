import java.util.Scanner;

public class BuscaLiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[5];
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número");
			int n = leitor.nextInt();
			numeros[i] = n;
		}
		
		System.out.println("Digite o número a ser buscado: ");
		int numero = leitor.nextInt();
		int posicaoResultado = -1;
		
		for(int i = 0; i < numeros.length; i++) {
			if(numero == numeros[i]) {
				posicaoResultado = i;
				break;
			}
		}
		if(posicaoResultado < 0) {
			System.out.printf("O número %d não foi encontrado\n ", numero);
		}else {
			System.out.printf("O número %d está na posição %d%n ", numero, posicaoResultado);
		}
		System.out.println("Vetor:");	
		
		Utilitaria.imprimirVetor(numeros);
		
		leitor.close();

	}

}
