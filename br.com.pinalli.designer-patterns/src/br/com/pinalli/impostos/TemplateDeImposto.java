package br.com.pinalli.impostos;

import br.com.pinalli.descontos.Orcamento;

public abstract class TemplateDeImposto implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		else {
			return minimaTaxacao(orcamento);
		}
		
	}

public abstract double maximaTaxacao(Orcamento orcamento);

public abstract double minimaTaxacao(Orcamento orcamento);

public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
