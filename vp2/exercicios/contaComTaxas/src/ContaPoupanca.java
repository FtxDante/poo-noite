public class ContaPoupanca extends Conta{
    @Override
    public double rendimento() {
        double saldo = getSaldo();
        double taxaSelic = 8;
        for(int contador = 1; contador <= 12; contador++){
            saldo = saldo + taxaSelic * 0.7;
        }
        return saldo;
    }
}
