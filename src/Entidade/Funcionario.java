package Entidade;



public class Funcionario {
	
	public String nome;
	public double salario;
	public double valorIr;
	
	
	public double salarioLiquido() {
		
	 double s = salario - valorIr;
	 return s;
	 
	}

	public double reajuste(double taxa) {
		
		 double reajuste  = (salario *( taxa / 100) + salario);
		 return reajuste;
		 
	}
	
}
