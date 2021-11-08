public class TesouroSelic extends Investimento {
    public TesouroSelic (String instF, String usuario, double valorA, double taxaAA) {
        super(instF, usuario, valorA, taxaAA);
        calculaLucro(true);
    }
}
