public class Gerente extends Funcionario{
    Gerente(String cpf, String nome) {
        super(cpf, nome);
    }

    public void demitirFuncionario(String funcionario){
        System.out.println("Estou demitindo o funcionaro" + funcionario);
    }
}
