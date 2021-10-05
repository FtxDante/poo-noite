public class Retangulo extends Quadrilatero {
    private final float altura;
    private final float lado;

    Retangulo(float altura, float lado){
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        float lado = this.lado;
        float altura = this.altura;
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        float lados = 2 * this.lado;
        float alturas = 2 * this.altura;

        return alturas + lados;
    }

    public float getAltura() {
        return altura;
    }

    public float getLado() {
        return lado;
    }
}
