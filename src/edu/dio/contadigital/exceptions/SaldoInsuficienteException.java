package edu.dio.contadigital.exceptions;

public class SaldoInsuficienteException extends RuntimeException{
	
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
}
