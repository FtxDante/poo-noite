public class Pessoa {
    private final String cpf;
    private final String nome;

    Pessoa(String cpf,String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}

