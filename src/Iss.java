
public class Iss extends Imposto {

	public Iss(Imposto outroImposto) {
		super(outroImposto);
	}

	public Iss() {

	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
