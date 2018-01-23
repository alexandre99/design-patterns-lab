
public abstract class TemplateDeImpostoCondicional extends Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
	}

	abstract double minimaTaxacao(Orcamento orcamento);

	abstract double maximaTaxacao(Orcamento orcamento);

	abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
