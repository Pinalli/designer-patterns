package br.com.pinalli.descontos;

public class TestaCorrente {
	
	public static void main(String[] args) {
        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d3 = new DescontoPorVendaCasada();
        Desconto d4 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(d4);

        Item lapis = new Item("LAPIS", 15.00);
        Item caneta = new Item("CANETA", 15.00);
        Item borracha = new Item("borracha", 15.00);

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adiciona(caneta);
        orcamento.adiciona(borracha);
        orcamento.adiciona(lapis);        

        double desconto = d1.desconta(orcamento);
        System.out.println(desconto);
      }
}
