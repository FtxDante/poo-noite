public class Cdb extends Investimento {
    public Cdb (String instituicaoFinanceira, double valorAplicado, double taxaDeRendimentoAA) {
        super(instituicaoFinanceira, valorAplicado, taxaDeRendimentoAA);
    }

    public void calculaLucro() {
        double rendimento = getTaxaDeRendimentoAA() * getValorAplicado();
        double imposto = rendimento * getPercentualDeImposto();
        super.setLucro(rendimento - imposto);
    }

    public double getLucro() {
        calculaLucro();
        return super.getLucro();
    }
}
