import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class MercadoTest {
    Mercado mercado;
    Atendimento atendimento;

    @BeforeEach
    void setUp(){
        mercado = new Mercado();
        atendimento = new Atendimento(1,"Presunto");
    }

    @Test
    void devePrepararLista(){
        Lista prepararListaAtendimento = new ListaAtendimento(atendimento);
        mercado.executarLista(prepararListaAtendimento);

        assertEquals("Lista Aberta", atendimento.getSituacao());
    }

    @Test
    void deveEntregarLista(){
        Lista entregarListaAtendimento= new EntregaLista(atendimento);
        mercado.executarLista(entregarListaAtendimento);

        assertEquals("Lista entregada", atendimento.getSituacao());
    }
}
