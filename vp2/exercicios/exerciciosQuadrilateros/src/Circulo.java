public class Circulo extends Quadrilatero{

    private final float raio;
    private final float pi = (float) Math.PI;

    Circulo(float raio){
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return pi * (float) Math.pow(raio, 2);
    }

    @Override
    public float calcularPerimetro() {
        return 2 * pi * raio;
    }

    public float getRaio() {
        return raio;
    }

    public float getPi() {
        return pi;
    }
}
