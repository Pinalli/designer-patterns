package br.com.pinalli.impostos;

import br.com.pinalli.descontos.Item;
import br.com.pinalli.descontos.Orcamento;

public class IKCV extends TemplateDeImposto {

	private boolean temItemMaiorQue100(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
	   return orcamento.getValor() > 500 && temItemMaiorQue100(orcamento);
	}

}
