
public class TesteDeDescontos {

	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();

		Orcamento orcamento = new Orcamento(600);

		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));

		double descontoFinal = descontos.calcular(orcamento);

		System.out.println(descontoFinal);
	}

}
