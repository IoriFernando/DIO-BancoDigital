package edu.dio.contadigital;

import edu.dio.contadigital.entidades.Cliente;
import edu.dio.contadigital.entidades.Conta;
import edu.dio.contadigital.entidades.ContaCorrente;
import edu.dio.contadigital.entidades.ContaPoupanca;
import edu.dio.contadigital.repositorios.IConta;

public class Main {
	
	public static void main(String[] args) {
		
		
		Cliente cliente1 = new Cliente("Fernando");
		
		cliente1.getNome();
		System.out.println("Clinte 1:"+ cliente1.getNome());
		
		Conta conta1 = new ContaCorrente(cliente1,1000.00);
		
		conta1.informacoesGerais();	
	}
}