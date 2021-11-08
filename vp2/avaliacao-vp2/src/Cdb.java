public class Cdb extends Investimento {
    public Cdb (String instF, String usuario, double valorA, double taxaAA) {
        super(instF, usuario, valorA, taxaAA);
        calculaLucro(true);
    }
}
