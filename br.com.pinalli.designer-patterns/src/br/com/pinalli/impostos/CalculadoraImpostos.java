package br.com.pinalli.impostos;
import br.com.pinalli.descontos.Orcamento;

public class CalculadoraImpostos {
    
	public void realizaCalculo(Orcamento orcamento, Imposto qualquerImposto) {
		
		double icms = qualquerImposto.calcula(orcamento);
		System.out.println(icms);
	}
}
