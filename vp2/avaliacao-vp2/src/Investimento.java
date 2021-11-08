public abstract class Investimento {
    private final String instF, usuario;
    private double valorA, lucro;
    private final double taxaAA, imposto = 0.15;

    public Investimento(String instF, String usuario, double valorA, double taxaAA) {
        this.instF = instF;
        this.usuario = usuario;
        this.valorA = valorA;
        this.taxaAA = taxaAA;
    }

    public void calculaLucro(boolean temImposto) {
        double imposto = 0;
        if(temImposto) imposto = valorA * this.imposto;
        double lucro = valorA + (valorA * taxaAA);
        this.lucro = lucro - imposto;
    }

    public double getValorA() {
        return valorA;
    }

    public double getLucro() {
        return lucro;
    }
}
