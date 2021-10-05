public class Quadrado extends Retangulo{

    Quadrado(float lado) {
        super(lado, lado);
    }

    @Override
    public float calcularArea() {
        float lado = super.getLado();
        return lado  * lado;
    }

    @Override
    public float calcularPerimetro() {
        float lados = 2 * super.getLado();
        float alturas = 2 * super.getAltura();
        return alturas + lados ;
    }

}
