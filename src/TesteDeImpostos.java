
public class TesteDeImpostos {

	public static void main(String[] args) {

		Imposto iss = new Iss();
		Imposto icms = new Icms();
		Imposto iccc = new Iccc();

		Orcamento orcamento = new Orcamento(1300);

		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iccc);
	}

}
