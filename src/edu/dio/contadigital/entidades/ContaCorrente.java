package edu.dio.contadigital.entidades;

public class ContaCorrente extends Conta {
	
	private Double saldo;

	public ContaCorrente(Cliente cliente, Double saldo) {
		super(cliente, saldo);
		// TODO Auto-generated constructor stub
		this.saldo = saldo; 
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
}
