package br.com.pinalli.descontos;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
