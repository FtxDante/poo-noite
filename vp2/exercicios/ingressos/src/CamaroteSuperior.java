public class CamaroteSuperior extends Vip {
    public CamaroteSuperior(double valor){
        super(valor);
    }

    public double imprimeValor(){
        return super.imprimeValor() + super.imprimeValor() * 0.2;
    }
}
