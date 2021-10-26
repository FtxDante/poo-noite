public class Pessoa extends Mamifero {
    private Gato bichoEstimacao;

    public Pessoa(){
        this.bichoEstimacao = new Gato();
    }

    public void falar(){
        System.out.println("Falando...");
    }
}
