import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private List<Lista> listas = new ArrayList<Lista>();


    public void executarLista(Lista lista) {
        this.listas.add(lista);
        lista.executar();
    }
}
