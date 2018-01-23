
public class CalculadorDeDescontos {

	public double calcular(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMiasDeQuinhentosReais();
		Desconto d3 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);

		// em caso contrário
		return d1.desconta(orcamento);
	}

}
