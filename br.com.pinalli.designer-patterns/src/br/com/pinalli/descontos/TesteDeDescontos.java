package br.com.pinalli.descontos;

public class TesteDeDescontos {
	public static void main(String[] args) {
		CalculadoraDeDescontos descontos = new CalculadoraDeDescontos();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("Caneta", 250.0));
		orcamento.adicionaItem(new Item("Laois", 250.0));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
		
	}
}
