

public class EntregaLista implements Lista {
    private Atendimento atendimento;

    public EntregaLista(Atendimento atendimento){
        this.atendimento = atendimento;
    }
    @Override
    public void executar(){
        this.atendimento.entregarListaAtendimento();
    }

}
