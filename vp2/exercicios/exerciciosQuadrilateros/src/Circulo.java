public class Circulo extends Quadrilatero{

    private final float raio;
    private float pi = (float) Math.PI;

    Circulo(float raio){
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        float raio = this.raio;
        float pi = this.pi;
        return pi * (float) Math.pow(raio, 2);
    }

    @Override
    public float calcularPerimetro() {
        float raio = this.raio;
        float pi = this.pi;
        return 2 * pi * raio;
    }
}
