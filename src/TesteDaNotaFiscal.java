public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		// Interface fluentes
		NotaFiscalBuilder builder = new NotaFiscalBuilder();

		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new Impressora());

		builder.paraEmpresa("razao social").comCnpj("123").comItem(new ItemDaNota("item 1", 200))
				.comItem(new ItemDaNota("item 2", 300)).comItem(new ItemDaNota("item 3", 400)).comObservacoes("teste")
				.naDataAtual();

		NotaFiscal nf = builder.constroi();
		System.out.println(nf.getValorBruto());

	}

}
