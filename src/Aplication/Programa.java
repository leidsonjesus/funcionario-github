package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Funcionario;



public class Programa {
		public static void main(String[] args) {
				
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				Funcionario funcionario = new Funcionario();
				System.out.println("Entra com as informações do funcionario");
				System.out.print(" Nome : ");
				funcionario.nome = sc.nextLine();
				System.out.print(" Valor Salario : ");
				funcionario.salario = sc.nextDouble();
				System.out.print(" Valor do Imposto : ");
				funcionario.valorIr = sc.nextDouble();
				
				System.out.println(" Salario Liquito é " + funcionario.salarioLiquido());
				double taxa = sc.nextDouble();
				System.out.println(" Valor da taxa para reajuste : " + taxa);
				System.out.println(" Valor do salario reajustado : " + funcionario.reajuste(taxa));
				
		
				sc.close();	
		}
				
}

