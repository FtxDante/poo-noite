public class Circulo {
    private double raio;
    private double area;
    private double perimetro;
    private double diametro;
    private static double  PI = 3.14159265359;

    public Circulo(double raio){
        setRaio(raio);
        geraOCirculo();
    }

    public void geraOCirculo(){
        calculaArea();
        calculaPerimetro();
        calculaDiametro();
    }

    public void calculaArea(){
        this.area = PI * this.raio * this.raio;
    }

    public void calculaPerimetro(){
        this.perimetro = 2 * PI * this.raio;
    }

    public void calculaDiametro(){
        this.diametro = this.raio * 2;
    }

    public void setRaio(double raio) {
        this.raio = raio;
        geraOCirculo();
    }

    public double getArea() {
        return area;
    }

    public double getRaio() {
        return raio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getDiametro() {
        return diametro;
    }



}
