package edu.dio.contadigital.entidades;

import edu.dio.contadigital.exceptions.SaldoInsuficienteException;
import edu.dio.contadigital.repositorios.IConta;

public abstract class Conta implements IConta {

	private static final int AGENCIA = 1;
	private static int NumeroDeContas = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente, Double saldo) {
		this.agencia = Conta.AGENCIA;
		this.numero = NumeroDeContas++;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	@Override
	public void sacar(Double valor) {
		// TODO Auto-generated method stub
		if (saldo - valor < 0) {
			throw new SaldoInsuficienteException("Saldo insuficiente!!");
		} else {
			saldo = saldo - valor;
			System.out.printf("Saldo atualizado: ", saldo);
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (saldo < valor) {
			System.out.println("Saldo insuficiente pra transação");
		} else {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Saldo: "+saldo);
	}

	public void informacoesGerais() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static int getAgencia() {
		return AGENCIA;
	}

}
