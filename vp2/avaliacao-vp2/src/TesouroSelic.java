public class TesouroSelic extends Investimento {
    private double porcentagemSelic;

    public TesouroSelic (String instituicaoFinanceira, double valorAplicado, double taxaDeRendimentoAA) {
        super(instituicaoFinanceira, valorAplicado, taxaDeRendimentoAA);
        porcentagemSelic = 1.1;
    }

    public void calculaLucro() {
        double rendimento = getTaxaDeRendimentoAA() * getValorAplicado() * porcentagemSelic;
        double imposto = rendimento * getPercentualDeImposto();
        super.setLucro(rendimento - imposto);
    }

    public double getLucro() {
        calculaLucro();
        return super.getLucro();
    }
}
