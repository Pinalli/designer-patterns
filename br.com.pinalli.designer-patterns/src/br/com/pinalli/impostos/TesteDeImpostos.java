package br.com.pinalli.impostos;
import br.com.pinalli.descontos.Orcamento;

public class TesteDeImpostos {
 public static void main(String[] args) {
	
	 Imposto iss  = new ISS();
	 Imposto icms  = new ICMS();
	 Imposto iccc  = new ICCC();
	 
	 Orcamento orcamento = new Orcamento(3000.00);
	 CalculadoraImpostos  calculadora = new  CalculadoraImpostos ();
	 System.out.println("Total do calculo do ISS ");
	 calculadora.realizaCalculo(orcamento, iss);
	 System.out.println("Total do calculo do ICMS ");
	 calculadora.realizaCalculo(orcamento, icms);
	 System.out.println("Total do calculo do ICCC ");
	 calculadora.realizaCalculo(orcamento, iccc);
}
}
