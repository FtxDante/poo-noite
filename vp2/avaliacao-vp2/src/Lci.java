public class Lci extends Investimento {

    public Lci (String instituicaoFinanceira, double valorAplicado, double taxaDeRendimentoAA) {
        super(instituicaoFinanceira, valorAplicado, taxaDeRendimentoAA);
    }

    public void calculaLucro() {
        double rendimento = getTaxaDeRendimentoAA() * getValorAplicado();
        super.setLucro(rendimento);
    }

    public double getLucro() {
        calculaLucro();
        return super.getLucro();
    }
}
