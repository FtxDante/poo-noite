public class Vip extends Ingresso{
    public Vip(double preco){
        super(preco);
    }
    public double imprimiValor(){
        return this.imprimeValor() + this.imprimeValor() * 0.45;
    }
}
