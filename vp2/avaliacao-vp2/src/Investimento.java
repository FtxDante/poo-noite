public abstract class Investimento {
    private final double percentualDeImposto;
    private final String instituicaoFinanceira;
    private final double taxaDeRendimentoAA;
    private double lucro;
    private double valorAplicado;

    public Investimento(String instituicaoFinanceira, double valorAplicado, double taxaDeRendimentoAA) {
        this.percentualDeImposto = 0.15;
        this.instituicaoFinanceira = instituicaoFinanceira;
        this.taxaDeRendimentoAA = taxaDeRendimentoAA;
        this.valorAplicado = valorAplicado;
    }

    public abstract void calculaLucro();

    public String getInstituicaoFinanceira() {
        return instituicaoFinanceira;
    }

    public double getPercentualDeImposto() {
        return percentualDeImposto;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public double getTaxaDeRendimentoAA() {
        return taxaDeRendimentoAA;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
}
