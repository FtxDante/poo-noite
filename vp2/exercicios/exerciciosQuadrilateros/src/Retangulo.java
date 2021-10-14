public class Retangulo extends Quadrilatero {
    private final float altura;
    private final float lado;

    Retangulo(float altura, float lado){
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        return 2 * altura + 2 * lado;
    }

    public float getAltura() {
        return altura;
    }

    public float getLado() {
        return lado;
    }
}
