import java.util.ArrayList;

public class Cliente {
    private final String nome;
    private final String cpf;
    private ArrayList<NotasFiscais> comprasFeitasNF;
    private double totalDinheiro;

    public Cliente(String nome, String cpf,  double totalDinheiro) {
        this.comprasFeitasNF = new ArrayList<>();
        this.nome = nome;
        this.cpf = cpf;
        this.totalDinheiro = totalDinheiro;
    }

    public void pagar(double totalDinheiro) {
        if(totalDinheiro <= 0) {
            throw new Error("Valor inválido,O valor deve ser maior que zero");
        }
        this.totalDinheiro -= totalDinheiro;
    }

    public void adicionarNotaFiscal(NotasFiscais notaFiscal) {
        this.comprasFeitasNF.add(notaFiscal);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ArrayList<NotasFiscais> getComprasFeitas() {
        return comprasFeitasNF;
    }

    public double getTotalDinheiro() {
        return totalDinheiro;
    }

}
