package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NavioTest {
    @Test
    void deveInformarPorto() {
        Navio navio = new Navio();
        assertEquals("A Mediador da Navegacao receptou seu contato.\n"+
                        "A decisao do porto esta descrita conforme mensagem a seguir.\n" +
                        ">>O Porto decidiu sobre: Qual a direcao do porto" ,
                navio.informarPorto("Qual a direcao do porto"));
    }

    @Test
    void deveInformarFarol() {
        Navio navio = new Navio();
        assertEquals("A Mediador da Navegacao receptou seu contato.\n"+
                        "A decisao do farol esta descrita conforme mensagem a seguir.\n" +
                        ">>O Farol decidiu sobre: ha alguma pedra no caminho" ,
                navio.informarFarol("ha alguma pedra no caminho"));
    }
}