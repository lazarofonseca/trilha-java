import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[5];
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número");
			int n = leitor.nextInt();
			numeros[i] = n;
		}
		
		//AQUI É UM ALGORITMO SIMPLES DE ORDENAÇÃO DE VETORES
		for(int i = 0; i < numeros.length; i++) {
			int indiceDoMenor = i;
			for(int j = i + 1; j < numeros.length; j++) {
				if(numeros[j] < numeros[indiceDoMenor]) {
					indiceDoMenor = j;
				}
			}
			int temp = numeros[indiceDoMenor];
			numeros[indiceDoMenor] = numeros[i];
			numeros[i] = temp;
		}
		System.out.println("Vetor ordenado:");
		Utilitaria.imprimirVetor(numeros);

	}

}
