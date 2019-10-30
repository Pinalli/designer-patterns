package br.com.pinalli.impostos;
import br.com.pinalli.descontos.Orcamento;

public interface Imposto {
	
	double calcula(Orcamento orcamento);
}
