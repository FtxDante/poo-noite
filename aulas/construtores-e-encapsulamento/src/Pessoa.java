import java.util.Date;

public class Pessoa {
    private String nome;
    private Date nascimento;
    private String cpf;
    private int altura;

    Pessoa(){

    }
    Pessoa(String nome, Date nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }

}
