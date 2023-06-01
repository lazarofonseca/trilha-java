package com.lazaro.estruturadados.github.vetores;

public class Vetor<T> {
	
	private Object[] elementos;
	
	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];
	}
	
	public void inserir(int posicao, T elemento) {
		this.elementos[posicao] = elemento;
	}    
	
	@SuppressWarnings("unchecked")
	public T recuperar(int posicao) {
		return (T)elementos[posicao];
	}

}
