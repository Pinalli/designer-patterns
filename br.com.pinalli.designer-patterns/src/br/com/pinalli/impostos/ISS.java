package br.com.pinalli.impostos;
import br.com.pinalli.descontos.Orcamento;

public class ISS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
		
	}

}
