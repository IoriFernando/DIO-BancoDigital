package edu.dio.contadigital.repositorios;

public interface IConta {
	
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
	
	void sacar(Double valor);

	
}
