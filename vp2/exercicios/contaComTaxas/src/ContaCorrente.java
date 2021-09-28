public class ContaCorrente extends Conta {
    @Override
    public double rendimento() {
        double saldo = super.getSaldo();
        setSaldo( saldo + (saldo * 0.01));
        return getSaldo();
    }
}
