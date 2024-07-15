package edu.dio.contadigital.entidades;


public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente, Double saldo) {
		super(cliente, saldo);
		// TODO Auto-generated constructor stub
		this.saldo = saldo;
	}


	public Double getsaldo() {
		return saldo;
	}

	public void setsaldo(Double saldo) {
		this.saldo = saldo;
	}

}
