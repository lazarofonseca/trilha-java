package com.lazaro.estruturadados.github;

import java.util.Scanner;

import com.lazaro.estruturadados.github.modelos.Pessoa;
import com.lazaro.estruturadados.github.vetores.Vetor;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite a opção desejada: ");
		System.out.println("1. Gerenciamento de memória.");
		System.out.println("2. Criar vetor.");
		Scanner sc = new Scanner(System.in);
		
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		case 2:
			fazerVetor();
			break;
		}
		
		sc.close();

	}

	private static void fazerVetor() {
		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>(3);
		vetorPessoas.inserirEm(0, new Pessoa(1, "TreinaWeb vetor"));
		System.out.println(vetorPessoas.recuperar(0).getNome());
		Vetor<Integer> vetorInteiros = new Vetor<Integer>(2);
		vetorInteiros.inserirEm(0, 10);
		System.out.println(vetorInteiros.recuperar(0));
	}

	private static void fazerGerenciamentoMemoria() {
		
		int a = 3;
		System.out.println(a);
		int b = a;
		b = 2;
		System.out.println("---------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println("###########################");
		Pessoa p1 = new Pessoa(1, "TreinaWeb");
		System.out.println(p1.toString());
		Pessoa p2 = p1;
		System.out.println(p2.toString());
		System.out.println("-----------------------");
		p2.setNome("Treinaweb Modificado");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1 == p2);
		
	}

}
