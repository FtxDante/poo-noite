public class Cliente  extends Pessoa{

    private Float rendaMensal;

    Cliente(String cpf, String nome){
        super(cpf , nome);
    }

    public Float getRendaMensal() {
        return rendaMensal;
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
}
