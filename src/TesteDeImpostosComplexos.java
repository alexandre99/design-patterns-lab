
public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		Imposto iss = new Iss(new Icms(new Icpp()));
		Orcamento orcamento = new Orcamento(500);
		double valor = iss.calcula(orcamento);
		System.err.println(valor);
	}

}
