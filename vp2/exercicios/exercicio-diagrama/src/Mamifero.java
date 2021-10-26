public class Mamifero extends Animal {
    private Mamifero pai;
    private Mamifero mae;
    private Coracao coracao;
    private boolean sexo;

    public Mamifero (){
        this.coracao = new Coracao();
    }

    public void comer(){
        System.out.println("Comendo...");
    }
}
