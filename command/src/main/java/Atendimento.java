public class Atendimento {
    private int nCliente;
    private String nomeProduto;
    private String situacao;

    public Atendimento(int nCliente, String nomeProduto){
        this.nCliente = nCliente;
        this.nomeProduto = nomeProduto;
    }

    public String getSituacao(){
        return situacao;

    }

    public void prepararListaAtendimento(){
        this.situacao = "Receita em aberto";
    }

    public void entregarListaAtendimento(){
        this.situacao = "Receita entregue";
    }
}
