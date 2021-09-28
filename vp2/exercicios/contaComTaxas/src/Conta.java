public abstract class Conta {
    private double saldo;

    public abstract double rendimento();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
