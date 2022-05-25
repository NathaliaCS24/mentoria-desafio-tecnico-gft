package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Consultor;
import entities.Funcionario;
import entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> listaFuncionarios = new ArrayList<>(); 
		
		char ch;
		do {		
			System.out.println("Dados do funcionário:");
			System.out.print("Vendedor ou Consultor (v/c) ?");
			ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("CPF: ");
			Long cpf = sc.nextLong();
			
			if (ch == 'v') {
				System.out.print("Comissão: ");
				double comissao =  sc.nextDouble();
				System.out.print("Numero de vendas: ");
				long numeroVendas = sc.nextLong();
				
				listaFuncionarios.add(new Vendedor(nome, cpf, comissao, numeroVendas));
			}
			else if (ch == 'c') {
				System.out.print("Valor por hora: ");
				double valorHora =  sc.nextDouble();
				System.out.print("Horas trabalhadas: ");
				long horasTrabalhadas = sc.nextLong();
				
				listaFuncionarios.add(new Consultor(nome, cpf, valorHora, horasTrabalhadas));
			}
			
			System.out.println("Continuar cadastrando (s/n) ?");
			ch = sc.next().charAt(0);
		} while (ch == 's');
		
		for (Funcionario funcionario : listaFuncionarios) {
			System.out.println(funcionario);
		}
		
		
		
		
		sc.close();

	}

}
