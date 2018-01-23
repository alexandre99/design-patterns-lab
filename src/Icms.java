
public class Icms extends Imposto {

	public Icms(Imposto outroImposto) {
		super(outroImposto);
	}

	public Icms() {
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
	}

}
