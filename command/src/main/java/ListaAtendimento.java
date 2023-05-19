public class ListaAtendimento implements Lista{
    private Atendimento atendimento;

    public ListaAtendimento(Atendimento atendimento){
        this.atendimento = atendimento;
    }
    @Override
    public void executar(){
        this.atendimento.prepararListaAtendimento();
    }
}
